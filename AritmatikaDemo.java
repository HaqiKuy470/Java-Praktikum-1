public class AritmatikaDemo {
    public static void main (String []args){
        int i=37;
        int j=42;
        double x=27.475;
        double y=7.22;
        
        int digitNIM = 6; 

        System.out.println("Variable Values...");
        System.out.println("    i="+i);
        System.out.println("    j="+j);
        System.out.println("    x="+x);
        System.out.println("    y="+y);
        
        System.out.println("Adding");
        System.out.println("i+j="+(i+j));
        System.out.println("x+y="+(x+y));
        
        System.out.println("Substracting");
        System.out.println("i-j="+(i-j));
        System.out.println("x+y="+(x-y));
        
        System.out.println("Multiplying");
        System.out.println("i*j="+(i*j));
        System.out.println("x*y="+(x*y));
        
        System.out.println("Dividing");
        System.out.println("i/j="+(i/j));
        System.out.println("x/y="+(x/y));
        
        System.out.println("Mixing Types");
        System.out.println("j+y="+(j+y));
        System.out.println("i*x="+(i*x));

        System.out.println("Modulus Operation");
        System.out.println("i modulus " + digitNIM + "=" + (i % digitNIM));
        System.out.println("j modulus " + digitNIM + "=" + (j % digitNIM));
        System.out.println("x modulus " + digitNIM + "=" + (x % digitNIM));
        System.out.println("y modulus " + digitNIM + "=" + (y % digitNIM));
    }
}
