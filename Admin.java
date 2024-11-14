/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import static Person.Role.Admin;
import static Person.Status.ACTIVE;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MARIEM
 */
public final class Admin extends Person{

    public Admin(int id, String nom, String address, String mail, int phoneNumber) {
        super(id, nom, address, mail, phoneNumber);
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccount() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter identify number: ");
            int Id = scanner.nextInt();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            Status status=Status.ACTIVE;
            Role role=Role.Admin;
            Account a=new Account(Id,password,status,role);
            this.account=a;
            System.out.println("Account created successfully with ID: " + id);
        }catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a valid number for the ID.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    

}
