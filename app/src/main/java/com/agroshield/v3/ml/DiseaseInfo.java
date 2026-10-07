package com.agroshield.v3.ml;

/**
 * Oru disease-oda details (English + Tamil) idhula irukkum.
 * disease_info.json file-la irundhu idha load pannuvom.
 */
public class DiseaseInfo {
    public String classKey;      // e.g. "Tomato___Early_blight"
    public String nameEn;
    public String nameTa;
    public String descriptionEn;
    public String descriptionTa;
    public String solutionEn;
    public String solutionTa;

    public DiseaseInfo(String classKey, String nameEn, String nameTa,
                        String descriptionEn, String descriptionTa,
                        String solutionEn, String solutionTa) {
        this.classKey = classKey;
        this.nameEn = nameEn;
        this.nameTa = nameTa;
        this.descriptionEn = descriptionEn;
        this.descriptionTa = descriptionTa;
        this.solutionEn = solutionEn;
        this.solutionTa = solutionTa;
    }

    public boolean isHealthy() {
        return classKey != null && classKey.toLowerCase().contains("healthy");
    }
}
