/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author BHAGAT
 */
public class FlightSchedule {
    
    
    private Airliners airliners;
    private ArrayList<Flight> listOfFlight;
    
    
    public FlightSchedule()
    {
        listOfFlight=new ArrayList<Flight>();
    }

    public ArrayList<Flight> getListOfFlight() {
        return listOfFlight;
    }

    public void setListOfFlight(ArrayList<Flight> listOfFlight) {
        this.listOfFlight = listOfFlight;
    }

    public Airliners getAirliners() {
        return airliners;
    }

    public void setAirliners(Airliners airliners) {
        this.airliners = airliners;
    }
   
    public Flight addFlight()
    {
        Flight flight=new Flight();
        listOfFlight.add(flight);
        return flight;
    }
}
