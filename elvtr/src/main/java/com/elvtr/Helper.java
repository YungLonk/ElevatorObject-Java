package com.elvtr;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Helper {

    // Simplifies println
    public static void print(String text) {
        System.out.println(text);}

    // Simplifies printf
    public static void printf(String text, String num) {
        System.out.printf(text, num);}

    // Simplifies program delaying
    public static void sleep(int secs) {
        try {TimeUnit.SECONDS.sleep(secs);}
        catch (InterruptedException e) {e.printStackTrace();}}

    // Describes how to use program
    public static void howToUse() {
        print("Enter the floor you need when prompted.");
        print("If you need more floors, hit 'ctrl + c', and enter when prompted. Repeat up to 3 times.");
        print("");}

    // Prints if user input is invalid
    public static void userError() {
        print("Enter either a floor number (1 - 5) or 'quit'.");
        print("");}

    // Closes the door normally
    public static void closeDoor() {
        print("Closing doors...");
        sleep(2);}

    // Closes door after interruption
    public static void closeDoor(int secs) {
        printf("Closing doors in %d seconds...%n", Integer.toString(secs));
        sleep(secs);}

    // Opens the door
    public static void openDoor(int currentFloor) {
        printf("Arrived at floor %d; Opening doors...", Integer.toString(currentFloor));}

    // Ensures number provided is anywhere from 1 to 5 (inclusive)
    public static boolean isValidFloor(int floorNum) {
        if(floorNum < 1 && floorNum > 5) {
            return false;}
        else return true;}

    // Ensures input is a number
    public static boolean isValidNumber(String input) {
        try {int intNum = Integer.parseInt(input);}
        catch (NumberFormatException nfe) {return false;}
        return true;}

    // Ensures word provided is the word "quit"
    public static boolean isValidWord(String word) {
        if(word.toLowerCase() != "quit") {
            return false;}
        else return true;}

    // Ensures user input is valid
    public static boolean isValidUserInput(String userInput) {
        if(isValidWord(userInput)) { // If it's the word quit, it's valid input
            return true;}
        else if(isValidNumber(userInput)) { // If it's a number...
            if(isValidFloor(Integer.parseInt(userInput))) { // ...and it's a valid floor, it's valid
                return true;}
            else return false;}
        else return false;} // It's not "quit" or a valid floor number

    // Returns a list of the floors needed in order
    public static List<Integer> floorList(int floorNeeded, int floorNeeded2, int... floorsNeeded) {
        List<Integer> floors = new ArrayList<Integer>();
        switch (floorsNeeded.length) { // If there are...
            case 0: // ...2 floors
                floors.add(floorNeeded);
                floors.add(floorNeeded2);
                return floors;

            case 1: // ...3 floors
                floors.add(floorNeeded);
                floors.add(floorNeeded2);
                floors.add(floorsNeeded[0]);
                return floors;

            case 2: // ...4 floors
                floors.add(floorNeeded);
                floors.add(floorNeeded2);
                floors.add(floorsNeeded[0]);
                floors.add(floorsNeeded[1]);

            case 3: // ...5 floors
                floors.add(floorNeeded);
                floors.add(floorNeeded2);
                floors.add(floorsNeeded[0]);
                floors.add(floorsNeeded[1]);
                floors.add(floorsNeeded[2]);
        
            default: return floors;}}

    // Creates and returns empty list
    public static List<Integer> emptyList() {
        List<Integer> floors = new ArrayList<Integer>();
        return floors;}
}