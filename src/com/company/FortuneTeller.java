package com.company;

/**
 * Generates the fortune for each horoscope
 * Created by Jennifer on 2016-09-24.
 */
public class FortuneTeller {

    /**
     * Method to provide horoscope to user
     * @param birthMonth month user provides
     * @param birthDay day that user provides
     */
    public static void horoscopeFortuneGenerator(String birthMonth, int birthDay) {

        switch (birthMonth) {
            case "JANUARY":
                if (birthDay <= 19) {
                    System.out.println("Hello, my feisty Capricorn! This week, something very big will happen to you." +
                            "\nOh, not big in a good way though. Perhaps a fire or car accident! How exciting.");
                    break;
                }

                if (birthDay >= 20) {
                    System.out.println("Ahhh, Aquarius! You will find yourself facing a tough decision next Tuesday." +
                            "\nProbably on other days too, but I'm getting bad Tuesday vibes right now especially.");
                    break;
                }
                if (birthDay<1 || birthDay>31) break;

            case "FEBRUARY":
                if (birthDay <= 18) {
                    System.out.println("Ahhh, Aquarius! You will find yourself facing a tough decision next Tuesday." +
                            "\nProbably on other days too, but I'm getting bad Tuesday vibes right now especially.");
                    break;
                }
                if (birthDay >= 19) {
                    System.out.println("Greetings, Pisces! You'll find yourself at the fish market this weekend, " +
                            "for some reason.");
                    break;
                }
                break;

            case "MARCH":
                if (birthDay <= 20) {
                    System.out.println("Greetings, Pisces! You'll find yourself at the fish market this weekend, " +
                            "for some reason.");
                    break;
                }
                if (birthDay >= 21) {
                    System.out.println("Aries, your bull-headed attitude as the Ram leads me to believe you'll " +
                            "get into a fight with someone you love this week. As per usual, probably.");
                    break;
                }
                break;

            case "APRIL":
                if (birthDay <= 20) {
                    System.out.println("Aries, your bull-headed attitude as the Ram leads me to believe you'll " +
                            "get into a fight with someone you love this week. As per usual, probably.");
                    break;
                }
                if (birthDay >= 21) {
                    System.out.println("Hi Taurus! You will run into your ex at a bad time this month. Sorry lol");
                    break;
                }
                break;

            case "MAY":
                if (birthDay <= 20) {
                    System.out.println("Hi Taurus! You will run into your ex at a bad time this month. Sorry lol");
                    break;
                }
                if (birthDay >= 21) {
                    System.out.println("Gemini, I hate to tell you this but you'll get caught in a lie with a close friend" +
                            "this week. Not too surprising. You're very two faced as The Twins, after all.");
                    break;
                }
                break;

            case "JUNE":
                if (birthDay <= 20) {
                    System.out.println("Gemini, I hate to tell you this but you'll get caught in a lie with a close friend" +
                            " this week. Not too surprising. You're very two faced as The Twins, after all.");
                    break;
                }
                if (birthDay >= 21) {
                    System.out.println("Hola Cancer! You will win a free vacation to Spain. " +
                            "\n All the crab paella you can eat!");
                    break;
                }
                break;

            case "JULY":
                if (birthDay <= 22) {
                    System.out.println("Hola Cancer! You will win a free vacation to Spain. " +
                            "\n All the crab paella you can eat!");
                    break;
                }
                if (birthDay >= 23) {
                    System.out.println("Nice to meet you, Leo! Watch out for black cats this month... \n" +
                            "One may cross your path and give you cat scratch disease.");
                    break;
                }
                break;

            case "AUGUST":
                if (birthDay <= 22) {
                    System.out.println("Nice to meet you, Leo! Watch out for black cats this month... \n" +
                            "One may cross your path and give you cat scratch disease.");
                    break;
                }
                if (birthDay >= 23) {
                    System.out.println("Virgo, so innocent and pure, the next time you wear something white" +
                            "your annoying coworker will 'accidentally' spill coffee on it.");
                    break;
                }
                break;

            case "SEPTEMBER":
                if (birthDay <= 22) {
                    System.out.println("Virgo, so innocent and pure, the next time you wear something white" +
                            "your annoying coworker will 'accidentally' spill coffee on it.");
                    break;
                }
                if (birthDay >= 23) {
                    System.out.println("Congratulations Libra! This month you're getting accepted into law school." +
                            "\nDon't forget to call your mom and let her know! She'll be so proud.");
                    break;
                }
                break;

            case "OCTOBER":
                if (birthDay <= 22) {
                    System.out.println("Congratulations Libra! This month you're getting accepted into law school." +
                            "\nDon't forget to call your mom and let her know! She'll be so proud.");
                    break;
                }
                if (birthDay >= 23) {
                    System.out.println("Bonjour, Scorpio! Tomorrow morning, you will receive the phone call you've" +
                            "been waiting for. It also might just be a wrong number...");
                    break;
                }
                break;

            case "NOVEMBER":
                if (birthDay <= 21) {
                    System.out.println("Bonjour, Scorpio! Tomorrow morning, you will receive the phone call you've" +
                            "been waiting for. It also might just be a wrong number...");
                    break;
                }
                if (birthDay >= 22) {
                    System.out.println("Saggitarius, you should really get that rash checked out.");
                    break;
                }
                break;

            case "DECEMBER":
                if (birthDay <= 21) {
                    System.out.println("Saggitarius, you should really get that rash checked out.");
                    break;
                }
                if (birthDay >= 22) {
                    System.out.println("\"Hello, my feisty Capricorn! This week, something very big will happen to you. " +
                            "Oh, not big in a good way though. Perhaps a fire or car accident! How exciting.");
                    break;
                }
                break;
        }
    }
}
