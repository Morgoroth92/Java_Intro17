package org.example;

public class Main {
    public static void main(String[] args) {
        dayOfTheWeek(3);
    }
    public static void dayOfTheWeek(int x){
        switch (x){
            case 1:
                System.out.println("Lunedì");
                break;
            case 2:
                System.out.println("Martedì");
                break;
            case 3:
                System.out.println("Mercoledì");
                break;
            case 4:
                System.out.println("Giovedì");
                break;
            case 5:
                System.out.println("Venerdì");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
            default:
                System.out.println("Errore hai insrito un giorno un nunmero non valido");
                break;
        }
    }
}