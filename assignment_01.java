// CSE 110     : CSE 110
// Assignment  : assignment_01
// Author      : Hannah Stojack & hstojack
// Description : <of the file contents>

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);

        // declare and initialize variables
        int pizzas;
        int slices;
        int adults;
        int children;

        // prompt for and collect inputs
        System.out.print("How many pizzas? ");
        pizzas = in.nextInt();

        System.out.print("How many slices? ");
        slices = in.nextInt();

        System.out.print("How many adults? ");
        adults = in.nextInt();

        System.out.print("How many children? ");
        children = in.nextInt();

        // compute required values
        int totalSlices;
        totalSlices = pizzas * slices;
        int adultSlices;
        adultSlices = adults * 2;
        int childrenSlices;
        childrenSlices = totalSlices - adultSlices;
        int eachChildSlices;
        eachChildSlices = childrenSlices / children;

        int leftoverSlices;
        leftoverSlices = totalSlices - (childrenSlices + adultSlices);

        // display required outputs
        // -----------------------------------------------------------------------
        // I am not sure if this section is required or not so I added incase.
        // -----------------------------------------------------------------------

        System.out.print("Number of pizzas purchased:  ");
        System.out.println(pizzas);

        System.out.print("Number of slices per pizza:  ");
        System.out.println(slices);

        System.out.print("Number of adults:  ");
        System.out.println(adults);

        System.out.print("Number of children:  ");
        System.out.println(children);

        // -----------------------------------------------------------------------
        // Expected Outputs section below.
        // -----------------------------------------------------------------------

        System.out.print("Total number of slices of pizza:  ");
        System.out.println(totalSlices);

        System.out.print("Total number of slices given to adults:  ");
        System.out.println(adultSlices);

        System.out.print("Total number of slices left for children:  ");
        System.out.println(childrenSlices);

        System.out.print("Total number of slices left for each child:  ");
        System.out.println(eachChildSlices);

        System.out.print("Leftover slices:  ");
        System.out.println(leftoverSlices);
    }
}
