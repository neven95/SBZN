/**
 * 
 */
package com.sbnz.doctor.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Neven Jovic ra18-2014
 *
 */
public class DiseaseDTO {

	private long diseaseId;
	@NotNull
	@Size(max = 200)
	private String diseaseName;
	@NotNull
	@Size(min = 5, max = 5)
	private String diseaseCode;
	private long diagnosisId;
	private long medicineId;

	public DiseaseDTO() {
	}

	public DiseaseDTO(long diseaseId, String diseaseName, long diagnosisId, long medicineId) {
		this.diseaseId = diseaseId;
		this.diseaseName = diseaseName;
		this.diagnosisId = diagnosisId;
		this.medicineId = medicineId;
	}

	public long getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(long diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public long getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(long diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public long getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(long medicineId) {
		this.medicineId = medicineId;
	}

	public String getDiseaseCode() {
		return diseaseCode;
	}

	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}
}
