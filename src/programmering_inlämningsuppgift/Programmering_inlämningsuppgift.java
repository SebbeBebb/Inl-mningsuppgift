package programmering_inlämningsuppgift;

import java.util.Scanner;

public class Programmering_inlämningsuppgift {

    //Alla nummer och scannern som ska finnas i alla metoder:
    public static short player = 100;
    public static short computer1 = 250;
    public static Scanner key = new Scanner(System.in);
    public static byte round = 1;
    public static byte compscore = 0;
    public static byte playerscore = 0;

    public static void main(String[] args) {
        boolean spela = true; 
        while (spela == true) { //Loop så att man ska kunna spela spelet flera gånger
            while (round <= 3) { //Loop så att man kan spela tre rundor
                System.out.println("Round: " + round);
                round++;
                computer1 = 250;
                player = 100;
                attack();
            }
            key.nextLine();
            System.out.println("Vill du spela igen? Ja/Nej");
            String spelaigen = key.nextLine();
            if (spelaigen.equalsIgnoreCase("Ja")) { //För att man ska kunna starta om spelet
                spela = true;
                round = 1;
            }
            if (spelaigen.equalsIgnoreCase("Nej")) { //För att man ska kunna avsluta spelet
                spela = false;
            }
        }
    }

    static void attack() { //Metod för attack systemet

        while (computer1 > 0 && player > 0) { //Loop för att man ska kunna attackera flera gånger
            boolean fiendeattack = true;

            System.out.print("Välj attack ");
            byte val = key.nextByte();

            switch (val) { //Switch-case för att välja mellan varje attack
                case 1 -> {
                    double dmg = Math.random() * 31; //Slumpar numret för skada
                    short damage = (short) dmg; //Gör om det slumpade numret från decimal till heltal
                    if (damage > 5) { //Loop för att göra en risk att missa attacken
                        computer1 = (short) (computer1 - damage);
                        System.out.println("Din attack träffade");
                    } else {
                        System.out.println("Din attack missade");
                    }
                        double edmg = Math.random() * 31; //Slumpar numret för skada
                        short endamage = (short) edmg; //Gör om det slumpade numret från decimal till heltal
                        if (endamage > 20) { //Loop för att göra en risk att missa attacken
                            player = (short) (player - endamage);
                            System.out.println("Fienden träffade");
                        } else {
                            System.out.println("Fienden missade");
                        }
                        System.out.println("Fiende liv: " + computer1 + " Ditt liv: " + player);
                        break;
                }
                case 2 -> {
                    double dmg = Math.random() * 71; //Slumpar numret för skada
                    short damage = (short) dmg; //Gör om det slumpade numret från decimal till heltal
                    if (damage > 40) { //Loop för att göra en risk att missa attacken
                        computer1 = (short) (computer1 - damage);
                        System.out.println("Din attack träffade");
                    } else {
                        System.out.println("Din attack missade");
                    }
                        double edmg = Math.random() * 31; //Slumpar numret för skada
                        short endamage = (short) edmg; //Gör om det slumpade numret från decimal till heltal
                        if (endamage > 20) { //Loop för att göra en risk att missa attacken
                            player = (short) (player - endamage);
                            System.out.println("Fienden träffade");
                        } else {
                            System.out.println("Fienden missade");
                        }
                        System.out.println("Fiende liv: " + computer1 + " Ditt liv: " + player);
                        break;
                }
                case 3 -> {
                    double evd = Math.random() * 101; //Slumpar numret för evade
                    short evade = (short) evd; //Gör om det slumpade numret från decimal till heltal
                    if (evade > 25) { //Loop för att göra en risk att missa attacken
                        System.out.println("Du dodgea attacken");
                        fiendeattack = false;
                    } else {
                        System.out.println("Du hann inte dodgea");
                    }
                    while (fiendeattack == true) { //Loop för att fienden endast ska attackera om din evade inte lyckades
                        double edmg = Math.random() * 31; //Slumpar numret för skada
                        short endamage = (short) edmg; //Gör om det slumpade numret från decimal till heltal
                        player = (short) (player - endamage);
                        System.out.println("Fienden träffade");
                        System.out.println("Fiende liv: " + computer1 + " Ditt liv: " + player);
                        break;
                    }
                }
                default ->
                    System.out.println("Ogiltigt val");
            }
            if (computer1 <= 0) { //Loop för att lägga till poäng till spelaren om datorn dog
                playerscore++;
                System.out.println("Datorns poäng: " + compscore + " Ditt poäng: " + playerscore);
            } else if (player <= 0) { //Loop för att lägga till poäng till datorn om spelaren dog
                compscore++;
                System.out.println("Datorns poäng: " + compscore + " Ditt poäng: " + playerscore);
            }
        }
    }
}
