public class Complicated {


    public static void aLotOfLoops(int numberOfLoops){

        int x = 0;

        for (int i = 0; i < numberOfLoops; i++) {
            if(x%1000==0){
                System.out.print(".");
            }
            else if(x==numberOfLoops-1){
                System.out.println();
            }
            for (int j = 0; j < numberOfLoops ; j++) {
                for (int k = 0; k < numberOfLoops; k++) {
                  x = i*j*k;
                }
            }
        }

    }








}
