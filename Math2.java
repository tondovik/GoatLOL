// lesson on accumulation and increment, decrement

class ScoreBoard {

    int playerXP = 0;
    int playerLevel = 0;
    static String nameofgame = "FunGame";

    static void name(){
        System.out.println(nameofgame);

    }

    void gainXP(int amount) {
        playerXP = playerXP + amount; // accumulation, long way of doing it.
    }

    void heal() {
        playerXP += 50; //compound addition
    }

    void damage() {
        playerXP -= 10; // compound subtraction
    }


    void levelUp() {
        playerLevel++;   //increment
    }

      void levelDown() {
        playerLevel--;    //decrement
    }

}

public class Math2 {
    public static void main(String[] args){

        ScoreBoard player1 = new ScoreBoard();
        ScoreBoard player2 = new ScoreBoard();

        player1.gainXP(100);
        player1.gainXP(200);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();

        player1.gainXP(100);
        player1.gainXP(200);
        player1.heal();
        player1.damage();
        player1.levelUp();
        player1.levelUp();
        player1.levelDown();
        player1.name();
        
        System.out.println("Player XP: " + player1.playerXP);
        System.out.println("Player Level: " + player1.playerLevel);

    }
}
