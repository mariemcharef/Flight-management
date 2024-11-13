/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Flights;

import static Flights.Status.canceled;
import java.time.LocalDateTime;

/**
 *
 * @author MARIEM
 */
public class Fligths {

    public static void main(String[] args) throws InstanceException {
        Airport a=new Airport("aaaaa","11111","abcd");
        Airport b=new Airport("bbbbb","22222","abffr");
        Flight f=new Flight(1,a,b,100);
        FlightInstance i1=new FlightInstance(1,LocalDateTime.of(2024, 11, 15, 10, 30),Status.scheduled);
        FlightInstance i2=new FlightInstance(2,LocalDateTime.of(2024, 11, 16, 10, 30),Status.canceled);
        FlightInstance i3=new FlightInstance(3,LocalDateTime.of(2024, 11, 17, 10, 30),Status.canceled);
        FlightInstance f2=new FlightInstance(123, LocalDateTime.of(2024, 11, 10, 14, 30), Status.delayed);
        f.addInstance(f2);
        f.addInstance(i1);
        f.addInstance(i2);
        f.addInstance(i3);
        System.out.println("Annulled flight instances:");
        f.getstatusInstances(canceled).forEach(System.out::println);
        System.out.println(f);
        
        
    }
}
