public class Ortho extends Doctor {


    public void treatPatient(){
        conductCTScan();
        conductXRay();
    }
    public void conductCTScan(){
        System.out.println("Conduct CT Scan");
    }

    public void conductXRay(){
        System.out.println("Conduct X-Ray");
    }
}