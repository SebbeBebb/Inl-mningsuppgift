package programmering_inlämningsuppgift;
import java.util.Scanner;
import java.lang.Math;
public class Programmering_inlämningsuppgift {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        short player=100;
        short computer1=250;
        while(player>0 && computer1>0){
        while (true){
            
                
            
            System.out.print("Välj attack ");
            byte val = key.nextByte();
            
                if (val==1){
                    System.out.println("Attack 1");
                    double damage = Math.random()*11;
                    break;
                }
                else if (val==2){
                    System.out.println("Attack 2");
                    break;
                }
                else if (val==3){
                    System.out.println("Attack 3");
                    System.exit(0);
                }
                else if (val==4){
                    System.out.println("Evade");
                    break;
                }
                else{
                    System.out.println("Ogiltigt val");
                }
            
        }
        } 
    }
}