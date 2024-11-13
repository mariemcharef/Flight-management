/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flights;

/**
 *
 * @author MARIEM
 */
import java.time.LocalDateTime;

/**
 *
 * @author MARIEM
 */
public class FlightInstance implements Annulable{
    public int id;
    public LocalDateTime departure_time;
    Status status;//programmé,retardé ou en vol

    public FlightInstance(int id, LocalDateTime departure_time, Status status) {
        this.id = id;
        this.departure_time = departure_time;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDeparture_time() {
        return departure_time;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeparture_time(LocalDateTime departure_time) {
        this.departure_time = departure_time;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public boolean compareTo(FlightInstance j) { 
        return this.departure_time.isBefore(j.departure_time); }
    @Override
    public void cancel() {
        if (this.status != status.canceled) {
            System.out.println("Canceling the flight instance " + id);
            this.status = status.canceled;  
        } else {
            System.out.println("This instance has been cancelled successfully");
        }
    }
    @Override
    public String toString() {
        return "flight_instance{" + "id=" + id + ", departure_time=" + departure_time + ", status=" + status + '}';
    }
    
       
   

}

