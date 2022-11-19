import java.util.InputMismatchException;
import java.util.Scanner ;
public class Player {

    private int betCard; //a Object of Player can bet on a number
    private String name; //name of the Player


    public int getBetCard() {
        return betCard;
    }

    public void setBetCard(int betCard) {
        this.betCard = betCard;
    }

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        BetMore_Game.players.add(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int Start() {
        int res = 0;
        if (this.name == "Player 1") {
            System.out.println(this.getName() + " it is your turn !") ;
            this.setBetCard(BetMore_Game.play());
            res = BetMore_Game.play();
        } else {
            try {
                System.out.println(this.getName() + " it is your turn ! ") ;
                Scanner s = new Scanner(System.in);
                System.out.println("You have the option of betting on one number from 5 randomly selected numbers.");
                for (int i = 1; i <= 5; i++) {
                    res = BetMore_Game.play();
                    System.out.println(res);
                    System.out.println("Do you want to bet on the number or pick another card?");
                    int j = 5-i ;
                    System.out.println(" After this, you have only " + j+ " chance(s) to bet on a number") ;
                    System.out.println("If you have only 0 chances after that,and your choose " +
                            "to pick another card, your bet number will be 0 ") ;
                    System.out.println("True = Bet ; False = Pick another card");
                    boolean user_selected = s.nextBoolean();
                    if (user_selected == true) {
                        this.setBetCard(res);
                        break;
                    } else {
                        continue;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Please write only TRUE  or  FALSE");
                Start() ;
            }

        }
        return res ;
    }
}
