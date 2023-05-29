package gr.aueb.cf.ch4;

import java.util.Scanner;

public class OrangeRedSignal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeon = false; boolean redon = false;

        System.out.println("Please insert if tank1, tank2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeon = isTank1LTQuarter || isTank2LTQuarter;
        redon = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: + orangeon); ");
        System.out.println("Red on: " + redon);
    }
}
