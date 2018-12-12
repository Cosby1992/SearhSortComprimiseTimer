import java.util.Timer;

public class CosbysTimer {


    private static long startTimeMillis = 0;

    public static void start(){
        startTimeMillis = java.lang.System.currentTimeMillis();
    }

     public static void stop(){
        long stopTimeMillis = java.lang.System.currentTimeMillis();
        long execTime = stopTimeMillis - startTimeMillis;
         System.out.println("Execution time = " + execTime + " ms.");
     }





}
