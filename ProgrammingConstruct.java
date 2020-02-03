public class ProgrammingConstruct{
    public static void main(String[] args) {
        // for loop demo
        for (int index = 0; index < args.length; index++) {
            System.out.println("The value of index is :" + args[index]);
        }
        if(args.length > 0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        int value = args.length-1;

        while(value >= 0)
        {
            System.out.println(args[value]);
            value = value-1;
        }
    }
}