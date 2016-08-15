package Ch01.Sec08;

import  java.util.ArrayList;
import  java.util.Arrays;
import  java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Peter");
        friends.add("Paul");
        friends.remove(1);
        friends.add(0, "Paul");
        System.out.println("friends :"+ friends);

        String first = friends.get(0);
        System.out.println("first :"+ first);
        friends.set(1, "Mary");
        for (int i = 0; i < friends.size(); i++){
            System.out.println(friends.get(i));
        }

        ArrayList<String> people = friends;
        people.set(0, "Mary");
        System.out.println("friends="+friends);

        ArrayList<String> copiedFriends = new ArrayList<>(friends);
        copiedFriends.set(0, "Fred");
        System.out.println("copiedFriends="+ copiedFriends);
        System.out.println("friends="+ friends);

        friends = new ArrayList<>(Arrays.asList("Peter", "Paul", "Mary"));
        String[] names = friends.toArray(new String[0]);
        System.out.println("names=" + Arrays.toString(names));

        ArrayList<String> moreFriends = new ArrayList<>(Arrays.asList(names));
        System.out.println("moreFriends" + moreFriends);

        Collections.reverse(friends);
        System.out.println("After reversing friends=" + friends);
        Collections.shuffle(friends);
        System.out.println("After Shuffling friends=" + friends);
        Collections.sort(friends);
        System.out.println("After Sort friends=" + friends);
    }
}
