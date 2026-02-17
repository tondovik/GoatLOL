public class GetSetTester {
    public static void main(String[] args) {

        //create a new object for my GetSet class
        GetSet name = new GetSet();

        System.out.println(name.getUsername());
        name.setUsername("6967xMXjoshuaUsesAiXMx6769");

        System.out.println(name.getUsername());

    }
}

class GetSet{
    //instance variables; attributes
    private String username;

    //accesor methods aka GETTERS:
    public String getUsername(){
        return username;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

}