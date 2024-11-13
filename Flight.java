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
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
/**
 *
 * @author MARIEM
 */
public class Flight {
    int number;
    Airport departure_airport;
    Airport arrival_airport;
    float duration;
    public List<FlightInstance> instances;

    public Flight(int number, Airport departure_airport, Airport arrival_airport, float duration) {
        this.number = number;
        this.departure_airport = departure_airport;
        this.arrival_airport = arrival_airport;
        this.duration = duration;
         this.instances = new LinkedList<>();
    }
    public void addInstance(FlightInstance instance) throws InstanceException{
        if(!instances.add(instance)){
            throw new InstanceException("Instance already in this flight");
        }
    }
    public int getNumber() {
        return number;
    }

    public Airport getDeparture_airport() {
        return departure_airport;
    }

    public Airport getArrival_airport() {
        return arrival_airport;
    }

    public float getDuration() {
        return duration;
    }

    public List<FlightInstance> getInstances() {
        return instances;
    }
    public void afficherInstances(){
        Collections.sort(instances,(j1,j2)->j1.getDeparture_time().compareTo(j2.getDeparture_time()));
   
        System.out.println("Instances list of the flight "+number+": ");
        instances.forEach(System.out::println);
    }
    //selon le Status filtrer les instances annulés en cours ou bien programmés
     public List<FlightInstance> getstatusInstances(Status s) {
        return instances.stream()
                .filter(instance -> instance.getStatus() == s)
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer(number);
        for(FlightInstance i:instances){
            sb.append("\n"+i.toString()+".");
        }
        return sb.toString();
    }
    
}


