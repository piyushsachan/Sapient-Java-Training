public class DoctorClient {
    public static void main(String[] args) {

        Doctor d2 = null;

        System.out.println("D2 is " + args[0]);
        if (args[0].equals("1")){
            d2  = new Ortho();
        }else if(args[0].equals("2")) {
            d2 = new Dentist();
        } else {
            d2 = new Padietrician();

        }
      //  Doctor d1 = new Doctor();
        Ortho o1 = new Ortho();
        //Ortho o2 = new Dentist();
        //Ortho o3 = new Doctor();

        // d2.conductCTScan();
        //d2.treatPatient();
        System.out.println(d2 instanceof Ortho);
       // Ortho o4 = (Ortho)d2;
       // o4.conductCTScan();
       d2.treatPatient();
        


    }
}