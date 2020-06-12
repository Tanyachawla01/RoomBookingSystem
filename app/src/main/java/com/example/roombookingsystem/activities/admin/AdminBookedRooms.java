package com.example.roombookingsystem.activities.admin;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.roombookingsystem.R;
import com.example.roombookingsystem.activities.admin.rooms.Rooms;
import com.example.roombookingsystem.activities.admin.rooms.RoomsAdapter;
import com.example.roombookingsystem.activities.staff.ModifyBookedRoom;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdminBookedRooms extends Fragment {

    public static final String ROOM_ID = "roomno";
    public static final String ROOM_CAPACITY = "roomcapacity";
    public static final String ROOM_SOFTWARE = "software";
    public static final String ROOM_HARDWARE = "hardware";
    public static final String ROOM_IS_AVAILABLE = "available";
    public static final String ROOM_BLOCK = "block";
    public static final String ROOM_FLOOR = "floor";
    private DatabaseReference mRoomsDatabase;
    private RecyclerView mRoomRecyclerView;
    private RoomsAdapter mRoomItemAdapter;
    private RecyclerView.LayoutManager mRoomLayoutManager;
    String roomID, roomCapacity, roomSoftware, roomHardware, available, block, floor;

    public AdminBookedRooms() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin_booked_rooms, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRoomRecyclerView = getView().findViewById(R.id.recycler_booked_rooms);
        mRoomRecyclerView.setNestedScrollingEnabled(false);
        mRoomRecyclerView.setHasFixedSize(true);
        mRoomLayoutManager = new LinearLayoutManager(getActivity());
        mRoomRecyclerView.setLayoutManager(mRoomLayoutManager);
        mRoomItemAdapter = new RoomsAdapter(getRoomListing(), getActivity());
        mRoomRecyclerView.setAdapter(mRoomItemAdapter);

        setRoomData();

        if(getRoomListing() != null)
        {
            mRoomItemAdapter.setOnItemClickListener(new RoomsAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    Rooms room = getRoomListing().get(position);
                    Intent intent = new Intent(getActivity(), AdminModifyBookedRoom.class);
                    intent.putExtra(ROOM_ID, room.getRoomno());
                    intent.putExtra(ROOM_CAPACITY, room.getRoomcapacity());
                    intent.putExtra(ROOM_HARDWARE, room.getHardware());
                    intent.putExtra(ROOM_SOFTWARE, room.getSoftware());
                    intent.putExtra(ROOM_IS_AVAILABLE, String.valueOf(room.isAvailable()));
                    intent.putExtra(ROOM_BLOCK, room.getBlock());
                    intent.putExtra(ROOM_FLOOR, room.getFloor());
                    startActivity(intent);
                }
            });
        }
    }

    private void setRoomData() {
        mRoomsDatabase = FirebaseDatabase.getInstance().getReference().child("rooms");

        mRoomsDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){

                    for(DataSnapshot roomList : dataSnapshot.getChildren()){

                        getRoomListDbInformation(roomList.getKey());
                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void getRoomListDbInformation(String key) {

        DatabaseReference RoomKeyRef = mRoomsDatabase.child(key);

        RoomKeyRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                available = dataSnapshot.child("available").getValue().toString();
                if(dataSnapshot.exists() && available.equals("false")){
                    roomID = dataSnapshot.child("roomno").getValue().toString();
                    roomCapacity = dataSnapshot.child("roomcapacity").getValue().toString();
                    roomSoftware = dataSnapshot.child("software").getValue().toString();
                    roomHardware = dataSnapshot.child("hardware").getValue().toString();
                    block = dataSnapshot.child("block").getValue().toString();
                    floor = dataSnapshot.child("floor").getValue().toString();

                    Rooms roomObj = new Rooms(roomID,roomCapacity,roomSoftware,roomHardware, block, floor);
                    roomListingResult.add(roomObj);
                    mRoomItemAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private ArrayList<Rooms> roomListingResult= new ArrayList<Rooms>();

    private List<Rooms> getRoomListing() {
        return roomListingResult;
    }
}
