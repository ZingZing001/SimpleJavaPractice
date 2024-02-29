public class myarrays {
    public static void main(String [] args){
        System.out.println("\n"); 

        String [] friends = {"Bowen", "Desmond", "Kevin"};
        friends[0] = "Mike";
        System.out.println(friends[0]);
        System.out.println(friends.length);
        String [] newFriends = new String[3];
        newFriends[0] = "Bowen";
        newFriends[1] = "Jason";
        newFriends[2] = "Aloh";
        System.out.println(newFriends[0]);
        System.out.println(newFriends[1]);
        System.out.println(newFriends[2]);

        System.out.println("\n");

    }
}
