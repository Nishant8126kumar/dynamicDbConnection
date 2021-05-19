package com.example.DemoPractise.model;

public class Vehicle {

    private String vehicleId;
    private String vehicleRnno;
    private Long createdTime;
    private String uuid;
    private String source;
    private String ownerName;
    private String chassisNo;
    private String trackingVia;
    private String vtsDeviceId;

    public Vehicle() {
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleRnno() {
        return vehicleRnno;
    }

    public void setVehicleRnno(String vehicleRnno) {
        this.vehicleRnno = vehicleRnno;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getTrackingVia() {
        return trackingVia;
    }

    public void setTrackingVia(String trackingVia) {
        this.trackingVia = trackingVia;
    }

    public String getVtsDeviceId() {
        return vtsDeviceId;
    }

    public void setVtsDeviceId(String vtsDeviceId) {
        this.vtsDeviceId = vtsDeviceId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", vehicleRnno='" + vehicleRnno + '\'' +
                ", createdTime=" + createdTime +
                ", uuid='" + uuid + '\'' +
                ", source='" + source + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", chassisNo='" + chassisNo + '\'' +
                ", trackingVia='" + trackingVia + '\'' +
                ", vtsDeviceId='" + vtsDeviceId + '\'' +
                '}';
    }
}
