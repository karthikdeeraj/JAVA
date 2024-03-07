
abstract class HealthcareProvider {
    abstract void treatPatient();
    abstract void prescribeMedication();


    String getCredentials() {
        return "Healthcare Provider Credentials";
    }
}

class Doctor extends HealthcareProvider {
    @Override
    void treatPatient() {
        System.out.println("Doctor is treating the patient.");
    }

    @Override
    void prescribeMedication() {
        System.out.println("Doctor is prescribing medication.");
    }
}


class Nurse extends HealthcareProvider {
    @Override
    void treatPatient() {
        System.out.println("Nurse is providing care to the patient.");
    }

    @Override
    void prescribeMedication() {
        System.out.println("Nurse is administering medication.");
    }
}

class Therapist extends HealthcareProvider {
    @Override
    void treatPatient() {
        System.out.println("Therapist is conducting therapy for the patient.");
    }

    @Override
    void prescribeMedication() {
        System.out.println("Therapist is recommending therapeutic activities.");
    }


    public static void main(String[] args) {
        // Creating instances of derived classes
        HealthcareProvider doctor = new Doctor();
        HealthcareProvider nurse = new Nurse();
        HealthcareProvider therapist = new Therapist();

        // Using methods on instances
        System.out.println(doctor.getCredentials());
        doctor.treatPatient();
        doctor.prescribeMedication();

        System.out.println(nurse.getCredentials());
        nurse.treatPatient();
        nurse.prescribeMedication();

        System.out.println(therapist.getCredentials());
        therapist.treatPatient();
        therapist.prescribeMedication();
    }
}
