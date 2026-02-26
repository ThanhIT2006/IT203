package BTTH;

import java.util.ArrayList;

public class PatientManager {
    private ArrayList<Patient> patientList = new ArrayList<>();

    public boolean isIdExist(int id) {
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getId() == id)
                return true;
        }
        return false;
    }

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public boolean removePatient(int id) {
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getId() == id) {
                patientList.remove(i);
                return true;
            }
        }
        return false;
    }

    public Patient findById(int id) {
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getId() == id)
                return patientList.get(i);
        }
        return null;
    }

    public void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i < patientList.size(); i++) {
            if (patientList.get(i).getName()
                    .toLowerCase()
                    .contains(name.toLowerCase())) {
                System.out.println(patientList.get(i));
                found = true;
            }
        }
        if (!found)
            System.out.println("Khong tim thay!");
    }

    public void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (int i = 0; i < patientList.size(); i++) {
            System.out.println(patientList.get(i));
        }
    }
}