/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package senjaungubiru;

/**
 *
 * @author senjaungubiru
 */
import java.util.Scanner;
public class senjaungubiru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,m,c;
        System.out.println("Masukan a =");
        a=input.nextInt();
        System.out.println("Masukan c =");
        c=input.nextInt();
        System.out.println("Masukan m =");
        m=input.nextInt();
        double[] x = new double[1000];
        double[] r = new double[1000];
        for(int i=1;i<=100;i++){
            x[i]=(a*x[i-1]+c)%m;
            r[i] = x[i]/m;
            
            //Range dadunya
            // 1/6 = 0.1666666666666667
            // 2/6 = 0.3333333333333333
            // 3/6 = 0.5
            // 4/6 = 0.6666666666666667
            // 5/6 = 0.8333333333333333
            
            System.out.println("\n");
            System.out.println("RN["+i+"] = "+r[i]+"\n");
            if (r[i] >= 0 & r[i] < 0.1666666666666667){
                System.out.println("Dadu 1");
            }else if (r[i] >= 0.1666666666666667 & r[i] < 0.3333333333333333){
                System.out.println("Dadu 2");
            }else if (r[i] >= 0.3333333333333333 & r[i] < 0.5){
                System.out.println("Dadu 3");
            }else if (r[i] >= 0.5 & r[i] < 0.6666666666666667){
                System.out.println("Dadu 4");
            }else if (r[i] >= 0.6666666666666667 & r[i] < 0.8333333333333333){
                System.out.println("Dadu 5");
            }else if (r[i] >= 0.8333333333333333 & r[i] < 1){
                System.out.println("Dadu 6");
            }       
        }
    }
}
