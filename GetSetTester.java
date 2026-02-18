import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //create objects
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();
        GetSet player3 = new GetSet();
        GetSet player4 = new GetSet();

        // PLAYER 1
        System.out.print("Enter username for Player 1: ");
        player1.setUsername(input.nextLine());

        System.out.print("Enter ID for " + player1.getUsername() + ": ");
        player1.setId(input.nextInt());
        input.nextLine();

        System.out.print("Enter rank (N00b, Bruh, Novice, Hacker, Gawd): ");
        player1.setRank(input.nextLine());

        if(player1.getRank().equals("N00b")){
    System.out.println("You are just getting started!");
}
else if(player1.getRank().equals("Bruh")){
    System.out.println("You are climbing the ranks!");
}
else if(player1.getRank().equals("Novice")){
    System.out.println("You are sharpening your skills!");
}
else if(player1.getRank().equals("Hacker")){
    System.out.println("You are one powerful hacker!");
}
else if(player1.getRank().equals("Gawd")){
    System.out.println("You have ascended to digital godhood!");
} else {
    System.out.println("you entered straight giberish bruh!");
}

        // PLAYER 2
        System.out.print("\nEnter username for Player 2: ");
        player2.setUsername(input.nextLine());

        System.out.print("Enter ID for " + player2.getUsername() + ": ");
        player2.setId(input.nextInt());
        input.nextLine();

        System.out.print("Enter rank (N00b, Bruh, Novice, Hacker, Gawd): ");
        player2.setRank(input.nextLine());

        if(player2.getRank().equals("Noob")){
    System.out.println("You are just getting started!");
}
else if(player2.getRank().equals("Bruh")){
    System.out.println("You are climbing the ranks!");
}
else if(player2.getRank().equals("Novice")){
    System.out.println("You are sharpening your skills!");
}
else if(player2.getRank().equals("Hacker")){
    System.out.println("You are one powerful hacker!");
}
else if(player2.getRank().equals("Gawd")){
    System.out.println("You have ascended to digital godhood!");
} else {
    System.out.println("you entered straight giberish bruh!");
}


        // PLAYER 3
        System.out.print("\nEnter username for Player 3: ");
        player3.setUsername(input.nextLine());

        System.out.print("Enter ID for " + player3.getUsername() + ": ");
        player3.setId(input.nextInt());
        input.nextLine();

        System.out.print("Enter rank (N00b, Bruh, Novice, Hacker, Gawd): ");
        player3.setRank(input.nextLine());
        
        if(player3.getRank().equals("Noob")){
    System.out.println("You are just getting started!");
}
else if(player3.getRank().equals("Bruh")){
    System.out.println("You are climbing the ranks!");
}
else if(player3.getRank().equals("Novice")){
    System.out.println("You are sharpening your skills!");
}
else if(player3.getRank().equals("Hacker")){
    System.out.println("You are one powerful hacker!");
}
else if(player3.getRank().equals("Gawd")){
    System.out.println("You have ascended to digital godhood!");
} else {
    System.out.println("you entered straight giberish bruh!");
}

        // PLAYER 4
        System.out.print("\nEnter username for Player 4: ");
        player4.setUsername(input.nextLine());

        System.out.print("Enter ID for " + player4.getUsername() + ": ");
        player4.setId(input.nextInt());
        input.nextLine();

        System.out.print("Enter rank (N00b, Bruh, Novice, Hacker, Gawd): ");
        player4.setRank(input.nextLine());

        if(player4.getRank().equals("Noob")){
    System.out.println("You are just getting started!");
}
else if(player4.getRank().equals("Bruh")){
    System.out.println("You are climbing the ranks!");
}
else if(player4.getRank().equals("Novice")){
    System.out.println("You are sharpening your skills!");
}
else if(player4.getRank().equals("Hacker")){
    System.out.println("You are one powerful hacker!");
}
else if(player4.getRank().equals("Gawd")){
    System.out.println("You have ascended to digital godhood!");
} else {
    System.out.println("you entered straight giberish bruh!");
}

        System.out.println("\n===== PLAYER INFO =====");

        System.out.println("\nUsername: " + player1.getUsername());
        System.out.println("ID: " + player1.getId());
        System.out.println("Rank: " + player1.getRank());

        System.out.println("\nUsername: " + player2.getUsername());
        System.out.println("ID: " + player2.getId());
        System.out.println("Rank: " + player2.getRank());

        System.out.println("\nUsername: " + player3.getUsername());
        System.out.println("ID: " + player3.getId());
        System.out.println("Rank: " + player3.getRank());

        System.out.println("\nUsername: " + player4.getUsername());
        System.out.println("ID: " + player4.getId());
        System.out.println("Rank: " + player4.getRank());
        
    }
}

class GetSet{
    private String username = "No user name";
    private int id;
    private String rank = "N00b";

    //GETTERS
    public String getUsername(){
        return username;
    }

    public int getId(){
        return id;
    }

    public String getRank(){
        return rank;
    }

    //SETTERS
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public void setRank(String newRank){
        this.rank = newRank;
    }
}
