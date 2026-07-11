public class method {
    static int addition(int x, int y) {

        return x + y;
    }

    static double addition (double x, double y){
            return x + y;
    }

    public static void main (String[] args){

        int result = addition(5,3);
        System.out.println(result);

        double results = addition(5,3);
        System.out.println(results);

        int i = 11; 
        if (i > 10){
            System.out.println("i > 10");
            int m = 1;
            m = m + i;
            System.out.println(m);

        }
        System.out.println(i);
        //System.out.println(m);

        for (int a = 0; a < 11;  a++){
            System.out.println(a);

        }
        

    }




}
