package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Horoscope extends FortuneTeller{
    /**
     * Simple program that takes in user's birth date
     * and returns their zodiac sign and horoscope
     * Created by Jennifer on 2016-09-24.
     */
    public static void main(String[] args) throws IOException {

        //create a new buffered reader to take in user's DOB
        BufferedReader bMonth = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bDay = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello, child! Let me tell you what your birthday says about you. \n"
                + "\nWhich month were you born in? Make sure you type so I can read it!");

        //take in their birth month as a string
        String birthMonth = bMonth.readLine().toUpperCase();

        System.out.println("Interesting! Now, which day was it?");

        //take in birth date as an int
        int birthDay = Integer.parseInt(bDay.readLine());

        //exit program if user doesn't supply a birth month or valid date
        if (birthMonth.isEmpty() || birthDay>31 || birthDay<1) {
            System.out.println("Oops! You didn't tell me your birthday... \n " +
                    "I guess you aren't interested in your horoscope!");
            System.exit(0);
        }

        //call method to provide user with their horoscope
        horoscopeFortuneGenerator(birthMonth, birthDay);

        //let user know program has finished
        System.out.println("Thank you for playing! Come back again soon!");
    }
}
