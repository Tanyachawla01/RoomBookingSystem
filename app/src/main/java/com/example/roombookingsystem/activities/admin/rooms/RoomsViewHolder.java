package com.example.roombookingsystem.activities.admin.rooms;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roombookingsystem.R;

public class RoomsViewHolder extends RecyclerView.ViewHolder {


    public TextView mRoomNo, mRoomCapacity, mHardware, mSoftware, mBlock, mFloor, mStaffName, mRequestedEquipment, mBookingPurpose, mBookingDate, mStartTime, mEndTime;
    Spinner mAvailable;
    ImageView mRoomImage;
    TableRow mTableLayout, mRequestedEquipmentLayout, mBookingPurposeLayout, mBookingDateLayout, mStartTimeLayout, mEndTimeLayout;


    public RoomsViewHolder(@NonNull View itemView, final RoomsAdapter.OnItemClickListener listener) {
        super(itemView);

        mRoomNo = itemView.findViewById(R.id.tv_room_no);
        mRoomCapacity = itemView.findViewById(R.id.tv_room_capacity);
        mHardware = itemView.findViewById(R.id.tv_hardware_equipment);
        mSoftware = itemView.findViewById(R.id.tv_software_equipment);
        mBlock = itemView.findViewById(R.id.tv_block);
        mFloor = itemView.findViewById(R.id.tv_floor);
        mRoomImage = itemView.findViewById(R.id.image_btn);
        mStaffName = itemView.findViewById(R.id.tv_staff_name);
        mRequestedEquipment = itemView.findViewById(R.id.tv_requested_equipment);
        mBookingPurpose = itemView.findViewById(R.id.tv_booking_purpose);
        mTableLayout = itemView.findViewById(R.id.staff_layout);
        mRequestedEquipmentLayout = itemView.findViewById(R.id.requestedEquipment_layout);
        mBookingPurposeLayout = itemView.findViewById(R.id.bookingPurpose_layout);
        mBookingDate = itemView.findViewById(R.id.tv_bookingDate);
        mStartTime = itemView.findViewById(R.id.tv_start_time);
        mEndTime = itemView.findViewById(R.id.tv_end_time);
        mBookingDateLayout = itemView.findViewById(R.id.bookingDate_layout);
        mStartTimeLayout = itemView.findViewById(R.id.startTime_layout);
        mEndTimeLayout = itemView.findViewById(R.id.endTime_layout);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null)
                {
                    int position = getAdapterPosition();
                    if(position!=RecyclerView.NO_POSITION)
                    {
                        listener.onItemClick(position);
                    }
                }
            }
        });
    }




}
