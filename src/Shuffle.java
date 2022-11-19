import java.util.Scanner ;
public class Shuffle {


    private static int randomInt  ;

    public static int pickcard() {
        randomInt=  (int) (Math.random()*100+1) ;
        return randomInt ;
    }
}
