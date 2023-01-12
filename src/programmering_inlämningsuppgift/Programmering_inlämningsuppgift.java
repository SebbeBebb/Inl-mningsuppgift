package programmering_inlämningsuppgift;

import java.util.Scanner;

public class Programmering_inlämningsuppgift {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        short player = 150;
        short computer1 = 250;

        while (player > 0 && computer1 > 0) {
            boolean fiendeattack = true;
            boolean sleep = false;
            System.out.print("Välj attack ");
            byte val = key.nextByte();
            while (sleep == true) {
                for (int i = 0; i < 4; i++) {
                    fiendeattack = false;

                }
            }
            if (val == 1) {

                double dmg = Math.random() * 31;
                short damage = (short) dmg;
                if (damage > 5) {
                    computer1 = (short) (computer1 - damage);

                } else {
                    System.out.println("Din attack missade");
                }
                while (fiendeattack == true) {
                    double edmg = Math.random() * 31;
                    short endamage = (short) edmg;
                    if (endamage > 20) {
                        player = (short) (player - endamage);
                        System.out.println("Fienden träffade");
                    } else {
                        System.out.println("Fienden missade");
                    }
                    System.out.println("Fiende liv: " + computer1 + " Ditt liv: " + player);
                    break;
                }
            } else if (val == 2) {

                double dmg = Math.random() * 71;
                short damage = (short) dmg;
                if (damage > 40) {
                    computer1 = (short) (computer1 - damage);

                } else {
                    System.out.println("Din attack missade");
                }
                while (fiendeattack == true) {
                    double edmg = Math.random() * 31;
                    short endamage = (short) edmg;
                    if (endamage > 20) {
                        player = (short) (player - endamage);
                        System.out.println("Fienden träffade");
                    } else {
                        System.out.println("Fienden missade");
                    }
                    System.out.println("Fiende liv: " + computer1 + " Ditt liv: " + player);
                    break;
                }

            } else if (val == 3) {
                double hyp = Math.random() * 101;
                short hypnosis = (short) hyp;
                if (hypnosis > 40) {
                    sleep = true;
                } else {
                    System.out.println("Din attack missade");
                }

                while (fiendeattack == true) {
                    double edmg = Math.random() * 31;
                    short endamage = (short) edmg;
                    if (endamage > 20) {
                        player = (short) (player - endamage);
                        System.out.println("Fienden träffade");
                    } else {
                        System.out.println("Fienden missade");
                    }
                    System.out.println("Fiende liv: " + computer1 + " Ditt liv: " + player);
                    break;
                }
            } else if (val == 4) {
                System.out.println("Evade");
                double evd = Math.random() * 101;
                short evade = (short) evd;
                if (evade > 25) {
                    System.out.println("Du dodgea attacken");
                    fiendeattack = false;

                } else {
                    System.out.println("Du hann inte dodgea");
                }
                while (fiendeattack == true) {
                    double edmg = Math.random() * 31;
                    short endamage = (short) edmg;

                    player = (short) (player - endamage);
                    System.out.println("Fienden träffade");

                    System.out.println("Fiende liv: " + computer1 + " Ditt liv: " + player);
                    break;
                }
            } else {
                System.out.println("Ogiltigt val");
            }

        }
    }

}
