package events;
import java.util.ArrayList;

import campaign.Campaign;
import economy.Economy;

public abstract class Event {
    private ArrayList<String> choice;
    public Event() {
        choice  = new ArrayList<String>();

    }
    public void addChoice(String c) {
        choice.add(c);

    }
    public String printChoice(){
        String s = "";
        for( String choice : choice) {
            System.out.println(choice);
        }
        return s;
    }

    public ArrayList<String> getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        return getDescription() + "\n" + printChoice();
    }

    public abstract void consequences(int choice, Economy e, Campaign campaign);
    public abstract void consequencesEasy( int choice, Economy e, Campaign campaign);
    public abstract void consequencesHard( int choice, Economy e, Campaign campaign);

    public abstract String getDescription();



}
