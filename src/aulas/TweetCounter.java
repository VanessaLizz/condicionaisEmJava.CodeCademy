package aulas;

public class TweetCounter {

    public static void main(String[] args) {

        //LENGTH
        String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";
        // What's the character count?
        System.out.println(tweet.length());

        //CONCAT
        // Add your first names:
        String firstName = "Vanessa";
        String lastName = "Liz";
        // What's the full name?
        System.out.println(firstName.concat(" " + lastName));

        //EQUALS
        String password = "correcthorsebatterystaple";
        // Write the code:
        System.out.println(password.equals("Reficofage"));

        //TOSTRING

        String line = "The Heav'ns and all the Constellations rung";
        // Change the arguments:
        System.out.println(line.substring(4, 11));

        String hashtag = "#100DaysOfCode";

        // Make the hashtag lowercase and upercase:
        System.out.println(hashtag.toLowerCase());
        System.out.println(hashtag.toUpperCase());
    }

}
