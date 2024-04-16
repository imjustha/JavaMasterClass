package dev.lpa;

public class Main {
    public static void main(String[] args){
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        // array initializer
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
        // System.out.println("Last = " + firstTen[arrayLength]); // this is not working because array index is 9 not 10 so instead
        System.out.println("Last = " + firstTen[arrayLength - 1]);

        // another way
        int[] newArray;
        // newArray = {5, 4, 3, 2, 1}; this is not working since it has to put new int[] so
        newArray = new int[] {5, 4, 3, 2, 1};
        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i] + " ");
        }

    }
}
