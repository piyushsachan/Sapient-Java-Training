public class Overloading {
 
    public long sum(int a, long b){
        System.out.println("int and long");
     
        return a + b;
    }
    /*
    public long sum(long a, int b){
        
        System.out.println("long and int");
     
        return a + b;
    }
 
    public int sum(int a, int b){
        System.out.println("both integers");
        return a + b;
    }
 */
    public int sum(int a, int b, int c ){
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.sum(12,12);
    }
}