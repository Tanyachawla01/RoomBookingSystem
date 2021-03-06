package com.example.roombookingsystem.activities.admin.rooms;

public class Rooms {

    String roomno;
    String roomcapacity;
    String hardware;
    String software;
    String block;
    String floor;
    boolean available;
    String requestedEquipment;
    String bookingPurpose;
    String bookingDate;
    String startTime;
    String endTime;
    String staffname;
    String staffId;
    String roomimage;

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getRoomimage() {
        return roomimage;
    }

    public void setRoomimage(String roomimage) {
        this.roomimage = roomimage;
    }

    public String getRoomcapacity() {
        return roomcapacity;
    }

    public void setRoomcapacity(String roomcapacity) {
        this.roomcapacity = roomcapacity;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getBlock() { return block; }

    public void setBlock(String block) { this.block = block; }

    public String getFloor() { return floor; }

    public void setFloor(String floor) { this.floor = floor; }

    public String getRequestedEquipment() { return requestedEquipment; }

    public void setRequestedEquipment(String requestedEquipment) { this.requestedEquipment = requestedEquipment; }

    public String getBookingPurpose() { return bookingPurpose; }

    public void setBookingPurpose(String bookingPurpose) { this.bookingPurpose = bookingPurpose; }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Rooms(String roomno, String roomcapacity, String hardware, String software) {
        this.roomno = roomno;
        this.roomcapacity = roomcapacity;
        this.hardware = hardware;
        this.software = software;
    }

    public Rooms(String roomno, String roomcapacity, String hardware, String software, boolean available) {
        this.roomno = roomno;
        this.roomcapacity = roomcapacity;
        this.hardware = hardware;
        this.software = software;
        this.available = available;
    }

    public Rooms(String roomno, String roomcapacity, String hardware, String software, boolean available, String block, String floor, String roomimage) {
        this.roomno = roomno;
        this.roomcapacity = roomcapacity;
        this.hardware = hardware;
        this.software = software;
        this.block = block;
        this.floor = floor;
        this.available = available;
        this.roomimage = roomimage;
    }

    public Rooms(String roomno, String roomcapacity, String hardware, String software, boolean available, String block, String floor, String roomimage, String staffname) {
        this.roomno = roomno;
        this.roomcapacity = roomcapacity;
        this.hardware = hardware;
        this.software = software;
        this.block = block;
        this.floor = floor;
        this.available = available;
        this.roomimage = roomimage;
        this.staffname = staffname;
    }

    public Rooms(String roomno, String roomcapacity, String hardware, String software, boolean available, String block, String floor) {
        this.roomno = roomno;
        this.roomcapacity = roomcapacity;
        this.hardware = hardware;
        this.software = software;
        this.available = available;
        this.block = block;
        this.floor = floor;

    }

    public Rooms(String roomno, String roomcapacity, String hardware, String software, String block, String floor, String roomimage) {
        this.roomno = roomno;
        this.roomcapacity = roomcapacity;
        this.hardware = hardware;
        this.software = software;
        this.block = block;
        this.floor = floor;
        this.roomimage = roomimage;
    }

    public Rooms(String roomno, String roomcapacity, String hardware, String software, String block, String floor, String roomimage, String staffname, String staffId) {
        this.roomno = roomno;
        this.roomcapacity = roomcapacity;
        this.hardware = hardware;
        this.software = software;
        this.block = block;
        this.floor = floor;
        this.roomimage = roomimage;
        this.staffname = staffname;
        this.staffId = staffId;
    }

    public Rooms(String roomno, String roomcapacity, String hardware, String software, String block, String floor, String roomimage, String staffname) {
        this.roomno = roomno;
        this.roomcapacity = roomcapacity;
        this.hardware = hardware;
        this.software = software;
        this.block = block;
        this.floor = floor;
        this.roomimage = roomimage;
        this.staffname = staffname;
    }

    public Rooms(String roomno, String roomcapacity, String hardware, String software, String block, String floor, String roomimage, String staffname, String staffId, String requestedEquipment, String bookingPurpose, String bookingDate, String startTime, String endtime) {
        this.roomno = roomno;
        this.roomcapacity = roomcapacity;
        this.hardware = hardware;
        this.software = software;
        this.block = block;
        this.floor = floor;
        this.roomimage = roomimage;
        this.staffname = staffname;
        this.staffId = staffId;
        this.requestedEquipment = requestedEquipment;
        this.bookingPurpose = bookingPurpose;
        this.bookingDate = bookingDate;
        this.startTime = startTime;
        this.endTime = endtime;
    }
}
