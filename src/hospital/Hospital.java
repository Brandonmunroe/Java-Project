package hospital;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Hospital extends JFrame {
    //Properties
    String name;
    String address;
    int totalBeds;
    int availableBeds;
    //List of patient objects or String names
    List<String> patients;
    List<String> doctors;

    //Constructor initializing
    public Hospital(String name, String address, int totalBeds, int availableBeds){
        this.name = name;
        this.address = address;
        this.totalBeds = totalBeds;
        this.availableBeds = availableBeds;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();

    }
    //Implementing
    //admitPatient
    public void admitPatient(String name){
        if (availableBeds > 0) {
            patients.add(name);
            availableBeds --;
            System.out.println("There is an available bed for" + name);


        } else {
            System.out.print("There are no avalable beds for" + name);
        }
    }

    public void dischargePatient(String name){
        if (patients.remove(name)){
            availableBeds ++;
            System.out.println("Patient is discharged. There is an available bed." + name);
        } else {
            System.out.println("Patient is not in the record");
        }


    }

    public void addDoctor(String doctorName){
        doctors.add(doctorName);
        System.out.println("Welcome Doctor" + doctorName);
    }

    public void removeDoctor(String doctorName){
        if (doctors.remove(doctorName)){
            System.out.println("Doctor" + doctorName + "is no longer in our records");
        } else {
            System.out.println("This doctor was never in our records");
        }
    }

    public int getPatientCount(){
        return patients.size();

    }

    public int getAvailableBeds(){
        return availableBeds;
    }

    public void printHospitalInfo() {
        System.out.println("---- Hospital Info ----");
        System.out.println("Hospital Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Total Beds: " + totalBeds);
        System.out.println("Avalable Beds: " + availableBeds);
        System.out.println("Number of Patients: " + patients);
        System.out.println("Number of Doctors: " + doctors);
        System.out.println("----End of Hospital Info ----");
    }
}

