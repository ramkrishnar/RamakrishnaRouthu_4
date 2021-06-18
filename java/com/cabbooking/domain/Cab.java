package com.cabbooking.domain;

public class Cab {
	private int cab_number;
    private int total_time;
    private Location cabLocation;
    private Location customerLocation ;
    private Location destinationLocation;
    private boolean booked;
	public Cab(int cab_number, int total_time, Location cabLocation, Location customerLocation,
			Location destinationLocation, boolean booked) {
		super();
		this.cab_number = cab_number;
		this.total_time = total_time;
		this.cabLocation = cabLocation;
		this.customerLocation = customerLocation;
		this.destinationLocation = destinationLocation;
		this.booked = booked;
	}
	public int getCab_number() {
		return cab_number;
	}
	public void setCab_number(int cab_number) {
		this.cab_number = cab_number;
	}
	public int getTotal_time() {
		return total_time;
	}
	public void setTotal_time(int total_time) {
		this.total_time = total_time;
	}
	public Location getCabLocation() {
		return cabLocation;
	}
	public void setCabLocation(Location cabLocation) {
		this.cabLocation = cabLocation;
	}
	public Location getCustomerLocation() {
		return customerLocation;
	}
	public void setCustomerLocation(Location customerLocation) {
		this.customerLocation = customerLocation;
	}
	public Location getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(Location destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public boolean isBooked() {
		return booked;
	}
	public void setBooked(boolean booked) {
		this.booked = booked;
	}

}
