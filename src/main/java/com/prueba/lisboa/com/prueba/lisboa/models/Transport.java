package com.prueba.lisboa.com.prueba.lisboa.models;

public class Transport {
    String id;
    String name;
    Double x;
    Double y;
    String licencePlate;
    Integer range;
    Integer batteryLevel;
    Integer seats;
    String model;
    String resourceImageId;
    Double pricePerMinuteParking;
    Double pricePerMinuteDriving;
    Boolean realTimeData;
    String engineType;
    String resourceType;
    Integer companyZoneId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public Integer getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResourceImageId() {
        return resourceImageId;
    }

    public void setResourceImageId(String resourceImageId) {
        this.resourceImageId = resourceImageId;
    }

    public Double getPricePerMinuteParking() {
        return pricePerMinuteParking;
    }

    public void setPricePerMinuteParking(Double pricePerMinuteParking) {
        this.pricePerMinuteParking = pricePerMinuteParking;
    }

    public Double getPricePerMinuteDriving() {
        return pricePerMinuteDriving;
    }

    public void setPricePerMinuteDriving(Double pricePerMinuteDriving) {
        this.pricePerMinuteDriving = pricePerMinuteDriving;
    }

    public Boolean getRealTimeData() {
        return realTimeData;
    }

    public void setRealTimeData(Boolean realTimeData) {
        this.realTimeData = realTimeData;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getCompanyZoneId() {
        return companyZoneId;
    }

    public void setCompanyZoneId(Integer companyZoneId) {
        this.companyZoneId = companyZoneId;
    }
}
