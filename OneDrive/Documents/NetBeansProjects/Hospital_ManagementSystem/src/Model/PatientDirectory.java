/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author sarth
 */
public class PatientDirectory {
private ArrayList<Patient> history;
public PatientDirectory(){
    this.history = new ArrayList<Patient>();
}
public ArrayList<Patient> getHistory() {
        return history;
    }
public void setHistory(ArrayList<Patient> history) {
        this.history = history;
    }
public Patient addNewPatient(){
        Patient newPatient = new Patient();
        history.add(newPatient);
        return newPatient;
    }
public void deletePatient(Patient vs){
       history.remove(vs);
    }
}
