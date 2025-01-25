import java.util.ArrayList;

class FriendList {
    ArrayList<String[]> list = new ArrayList<>();
    public FriendList() {
        list.add(new String[] {"Vardhan", "7569152170", "Hyderabad"});
        list.add(new String[] {"Anvesh", "7815859576", "Hyderabad"});
        list.add(new String[] {"Ashwith", "6454546565", "Hyderabad"});
        list.add(new String[] {"Bharath", "9012345678", "Hyderabad"});
        list.add(new String[] {"Dinakar", "1112223333", "India"});
    }
    public void displayFriends() {
        for (String[] friend : list) {
            int i =0;
            System.out.println("Name: " + friend[i]);
            System.out.println("Phone Number: " + friend[++i]);
            System.out.println("Address: " + friend[++i]);
            System.out.println();
        }
    }
}
public class Demo024 {
    public static void main(String[] args) {
        FriendList friendList = new FriendList();
        friendList.displayFriends();
    }
}