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
    public static String horoscopeFortuneGenerator(String birthMonth, int birthDay) {

        switch (birthMonth) {
            case "JANUARY":
                if (birthDay <= 19) {
                    return "Hello, my feisty Capricorn! This week, something very big will happen to you." +
                            "\nOh, not big in a good way though. Perhaps a fire or car accident! How exciting.";
                }

                if (birthDay >= 20) {
                    return "Ahhh, Aquarius! You will find yourself facing a tough decision next Tuesday." +
                            "\nProbably on other days too, but I'm getting bad Tuesday vibes right now especially.";
                }
                if (birthDay<1 || birthDay>31) break;

            case "FEBRUARY":
                if (birthDay <= 18) {
                    return "Ahhh, Aquarius! You will find yourself facing a tough decision next Tuesday." +
                            "\nProbably on other days too, but I'm getting bad Tuesday vibes right now especially.";
                }
                if (birthDay >= 19) {
                    return "Greetings, Pisces! You'll find yourself at the fish market this weekend, " +
                            "for some reason.";
                }
                break;

            case "MARCH":
                if (birthDay <= 20) {
                    return "Greetings, Pisces! You'll find yourself at the fish market this weekend, " +
                            "for some reason.";
                }
                if (birthDay >= 21) {
                    return "Aries, your bull-headed attitude as the Ram leads me to believe you'll " +
                            "get into a fight with someone you love this week. As per usual, probably.";
                }
                break;

            case "APRIL":
                if (birthDay <= 20) {
                    return "Aries, your bull-headed attitude as the Ram leads me to believe you'll " +
                            "get into a fight with someone you love this week. As per usual, probably.";
                }
                if (birthDay >= 21) {
                    return "Hi Taurus! You will run into your ex at a bad time this month. Sorry lol";
                }
                break;

            case "MAY":
                if (birthDay <= 20) {
                    return "Hi Taurus! You will run into your ex at a bad time this month. Sorry lol";
                }
                if (birthDay >= 21) {
                    return "Gemini, I hate to tell you this but you'll get caught in a lie with a close friend" +
                            "this week. Not too surprising. You're very two faced as The Twins, after all.";
                }
                break;

            case "JUNE":
                if (birthDay <= 20) {
                    return "Gemini, I hate to tell you this but you'll get caught in a lie with a close friend" +
                            " this week. Not too surprising. You're very two faced as The Twins, after all.";
                }
                if (birthDay >= 21) {
                    return "Hola Cancer! You will win a free vacation to Spain. " +
                            "\n All the crab paella you can eat!";
                }
                break;

            case "JULY":
                if (birthDay <= 22) {
                    return "Hola Cancer! You will win a free vacation to Spain. " +
                            "\n All the crab paella you can eat!";
                }
                if (birthDay >= 23) {
                    return "Nice to meet you, Leo! Watch out for black cats this month... \n" +
                            "One may cross your path and give you cat scratch disease.";
                }
                break;

            case "AUGUST":
                if (birthDay <= 22) {
                    return "Nice to meet you, Leo! Watch out for black cats this month... \n" +
                            "One may cross your path and give you cat scratch disease.";
                }
                if (birthDay >= 23) {
                    return "Virgo, so innocent and pure, the next time you wear something white" +
                            "your annoying coworker will 'accidentally' spill coffee on it.";
                }
                break;

            case "SEPTEMBER":
                if (birthDay <= 22) {
                    return "Virgo, so innocent and pure, the next time you wear something white" +
                            "your annoying coworker will 'accidentally' spill coffee on it.";
                }
                if (birthDay >= 23) {
                    return "Congratulations Libra! This month you're getting accepted into law school." +
                            "\nDon't forget to call your mom and let her know! She'll be so proud.";
                }
                break;

            case "OCTOBER":
                if (birthDay <= 22) {
                    return "Congratulations Libra! This month you're getting accepted into law school." +
                            "\nDon't forget to call your mom and let her know! She'll be so proud.";
                }
                if (birthDay >= 23) {
                    return "Bonjour, Scorpio! Tomorrow morning, you will receive the phone call you've" +
                            "been waiting for. It also might just be a wrong number...";
                }
                break;

            case "NOVEMBER":
                if (birthDay <= 21) {
                    return "Bonjour, Scorpio! Tomorrow morning, you will receive the phone call you've" +
                            "been waiting for. It also might just be a wrong number...";
                }
                if (birthDay >= 22) {
                    return "Saggitarius, you should really get that rash checked out.";
                }
                break;

            case "DECEMBER":
                if (birthDay <= 21) {
                    return "Saggitarius, you should really get that rash checked out.";
                }
                if (birthDay >= 22) {
                    return "\"Hello, my feisty Capricorn! This week, something very big will happen to you. " +
                            "Oh, not big in a good way though. Perhaps a fire or car accident! How exciting.";
                }
                break;
        }
        return "Oops, try entering your actual birth date next time!";
    }
}
