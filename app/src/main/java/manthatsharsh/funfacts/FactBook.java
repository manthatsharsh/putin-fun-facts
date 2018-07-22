package manthatsharsh.funfacts;

import java.util.Random;

/**
 * Created by harshjshah on 4/23/15.
 */
public class FactBook {
    //Member variable (properties about the object)

    public String[] mFacts = {
            "Vladimir Putin doesn't read books. He stares them down until he gets the information he wants.",
            "There is no theory of evolution. Just a list of creatures Vladimir Putin has allowed to live.",
            "Outer space exists because it's afraid to be on the same planet with Vladimir Putin.",
            "Vladimir Putin does not sleep. He waits.",
            "Vladimir Putin is currently suing NBC, claiming Law and Order are trademarked names for his left and right legs.",
            "Vladimir Putin is the reason why Waldo is hiding.",
            "Vladimir Putin counted to infinity - twice.",
            "Vladimir Putin is so fast, he can run around the world and punch himself in the back of the head.",
            "Vladimir Putin' hand is the only hand that can beat a Royal Flush.",
            "Vladimir Putin can lead a horse to water AND make it drink.",
            "Vladimir Putin doesn’t wear a watch. HE decides what time it is.",
            "Vladimir Putin can slam a revolving door.",
            "Vladimir Putin does not get frostbite. Vladimir Putin bites frost."};

    //Method (abilities: things the object can do)
    public String getFact() {



        // The button was clicked, so update the fact label with a new fact
        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact;
    }
}
