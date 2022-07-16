package org.example;

public class Main {
    public static void main(String[] args) {
        int days = 6;
        useNestedIf(days);
        useSwitch(days);

}
private static void useNestedIf(int days){
        String numbersWeek = null;
        if (0 == days){
            numbersWeek = "monday";
        } else if (1 == days) {
            numbersWeek = "tuesday";
        } else if (2 == days) {
            numbersWeek = "wenesday";
        } else if (3 == days) {
            numbersWeek = "thursday";
        } else if (4 == days) {
           numbersWeek = "friday";
        } else if (5 == days) {
            numbersWeek = "saturday";
        } else if (6 == days) {
            numbersWeek = "sunday";
        }
        System.out.println("enter any day: "+numbersWeek);
}
private static void useSwitch(int days){
        String numberWeek = null;
        switch (days){
            case 0: numberWeek = "monday"; break;
            case 1: numberWeek = "tuesday"; break;
            case 2: numberWeek = "wenesday"; break;
            case 3: numberWeek = "thursday"; break;
            case 4: numberWeek = "friday"; break;
            case 5: numberWeek = "saturday"; break;
            case 6: numberWeek = "sunday"; break;
        }
        System.out.println("enter day: "+numberWeek);

    }
}
