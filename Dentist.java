public class Dentist extends Doctor {

    @Override
    public void treatPatient(){
        dentalCheckUp();
    }

    public void dentalCheckUp(){
        System.out.println("Perform dental checkup...");
    }
}