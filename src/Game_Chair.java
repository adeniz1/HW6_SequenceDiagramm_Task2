import java.util.Arrays;

public class Game_Chair {

    public static void main (String[] args) {
        Player Computer =  new Player("Player 1") ;
        Player Player_2 = new Player("Player 2") ;

        System.out.println("Number of Players : " + BetMore_Game.players.size()) ;
        System.out.println("The Game starts."); ;
        System.out.println("-----------------------------------------------------------------------------------") ;

        Computer.Start() ;
        System.out.println( Computer.getName() + " bet on a number !") ;
        System.out.println("__________________________________________________________________________________") ;
        Player_2.Start() ;
        System.out.println("Player 2 bet on a number !") ;
        System.out.println("__________________________________________________________________________________") ;
        Player Winner = BetMore_Game.FindWinner(Computer,Player_2) ;
        System.out.println("Number of Player 1 : " + Computer.getBetCard() ) ;
        System.out.println("Number of Player 2 : " + Player_2.getBetCard())  ;
        System.out.println("The Winner  is : " + Winner.getName()) ;
    }
}
