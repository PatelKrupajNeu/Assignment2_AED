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
public class PatientDirectory 
{
    private ArrayList<Patient> directory;
    
    public PatientDirectory()
    {
        this.directory = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> setDirectory() {
        return directory;
    }
    
    public void setDirectory(ArrayList<Patient> directory) {
        this.directory = directory;
    }
    
public Patient addNewPatient(){
      
    Patient newPatient = new Patient();
        directory.add(newPatient);
        return newPatient;
    }
public void deletePatient(Patient vs){
       directory.remove(vs);
    }
}
