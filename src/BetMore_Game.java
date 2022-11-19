import java.util.ArrayList;

public class BetMore_Game {

    public BetMore_Game() {
    }

    public static ArrayList<Player> players = new ArrayList<>() ;

   private static Player winner ;


   public static int  play() {
    return Shuffle.pickcard() ;
   }
   public static Player  FindWinner(Player Computer, Player Player_2) {
       if(Computer.getBetCard() >  Player_2.getBetCard()) {
           BetMore_Game.winner=Computer ;
       }
       if(Computer.getBetCard() <  Player_2.getBetCard()) {
           BetMore_Game.winner=Player_2;
       }
       if(Computer.getBetCard() ==  Player_2.getBetCard()) {
           System.out.println("Both Players had the same number");
       }
       return BetMore_Game.winner ;
   }
}
