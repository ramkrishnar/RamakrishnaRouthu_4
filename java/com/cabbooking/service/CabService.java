package com.cabbooking.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cabbooking.domain.Cab;
import com.cabbooking.domain.Location;

@Service
public class CabService {
	
	public String book(Map<String, Location> booking) {
		String res = "";
		try {
		List<Cab> cabs=new ArrayList();
		 
		  Location clientSource = booking.get("source");
	        Location clientDestination = booking.get("destination");
	        int client_to_destination_distance = getDistance(clientSource, clientDestination);
	        int car_to_client_distance = 0;
	        int finalCar = -1;
	        for (Cab c:cabs) {
	            if (!c.isBooked()) {
	                int dist = getDistance(clientSource, c.getDestinationLocation());
	                if (dist < car_to_client_distance) {
	                    finalCar = cabs.lastIndexOf(c);
	                    car_to_client_distance = dist;
	                }
	               
	                if (finalCar != -1) {
	                   res="car booked car number"+finalCar;
	                } 
	            }
	        }
		}
		
		catch(Exception e) {
			System.out.println("error in cab booking "+e);
		}
		return res;
	}
	
	 public int getDistance(Location start, Location end) {
	        return Math.abs(start.getStart() - end.getStart()) + Math.abs(start.getEnd() - end.getEnd());
	    }
	 
	 public List<Cab> getCabs(){
		 List<Cab> cabs=new ArrayList();
		
		 cabs.add(new Cab(1, 2, new Location(2,3), new Location(2,3),
				 new Location(2,3),true));
		 cabs.add(new Cab(2, 2, new Location(2,3), new Location(2,3),
				 new Location(2,3),true));
		 cabs.add(new Cab(3, 2, new Location(2,3), new Location(2,3),
				 new Location(2,3),true));
		 return cabs;
	 }

}
