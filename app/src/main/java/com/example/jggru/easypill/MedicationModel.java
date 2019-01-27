package com.example.jggru.easypill;

public class MedicationModel {
    private String medName, medFrequency;
    private int remainDoses;

    public String getmedName() {
        return medName;
    }
    public String getMedFrequency() {
        return medFrequency;
    }
    public int getRemainDoses() {
        return remainDoses;
    }

    public void setmedName(String medName) {
        this.medName = medName;
    }
    public void setMedFrequency(String medFrequency) {
        this.medFrequency = medFrequency;
    }
    public void setRemainDoses(int remainDoses) {
        this.remainDoses = remainDoses;
    }

    public MedicationModel(String medName, String medFrequency, int remainDoses) {
        this.medName = medName;
        this.medFrequency = medFrequency;
        this.remainDoses = remainDoses;
    }

    public String toString() {
        return "Medication Name: " + medName + "\n" +
                "Use Frequency: " + medFrequency + "\n" +
                "Remaining Doses: " + remainDoses + "\n";
    }
}
