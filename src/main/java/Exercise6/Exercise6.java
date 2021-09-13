/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package Exercise6;

import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Exercise6 {
    public static void main(String[] args){
        Scanner retirement = new Scanner(System.in);

        System.out.print("How old are you");

        String age = retirement.nextLine();

        System.out.print("At what age do you wish to retire?");

        String retiring_age = retirement.nextLine();

        var age1 = Integer.parseInt(age, 10);

        var retiring_age1 = Integer.parseInt(retiring_age, 10);

        DateFormat year = new SimpleDateFormat("yyyy");

        Date date = Calendar.getInstance().getTime();

        String strDate = year.format(date);

        var int_year = Integer.parseInt(strDate, 10);

        int ytr = retiring_age1 - age1;

        int retirement_year = int_year + ytr;

        System.out.printf("You can retire in %d years\n", ytr);

        System.out.printf("It is %d, you can retire in %d", int_year, retirement_year);

    }
}
