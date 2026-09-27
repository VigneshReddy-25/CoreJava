package inheritance;


class Doctor{
	private int doctorId;
	private String doctorName;
	private String specialization;
	Doctor(int doctorId,String doctorName,String specialization){
		this.doctorId=doctorId;
		this.doctorName=doctorName;
		this.specialization=specialization;
	}
	public int getDoctorId() {
	    return doctorId;
	}
	public String getDoctorName() {
	    return doctorName;
	}
	public String getSpecialization() {
	    return specialization;
	}
	
	
	public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Doctor ID      : " + doctorId);
        System.out.println("Doctor Name    : " + doctorName);
        System.out.println("Specialization : " + specialization);
    }
}

class Surgeon extends Doctor {

    private String surgeryType;
    private int yearOfExperience;

    Surgeon(int doctorId, String doctorName, String specialization, String surgeryType, int yearOfExperience) {

        super(doctorId, doctorName, specialization);

        this.surgeryType = surgeryType;
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Surgery Type     : " + surgeryType);
        System.out.println("Experience       : " + yearOfExperience + " Years");
    }
}

public class HospitalManagemnet {

    public static void main(String[] args) {

        Surgeon d1 = new Surgeon(101, "Dr. Ravi", "General Surgery", "Heart Surgery", 12);

        d1.displayDetails();
    }
}
