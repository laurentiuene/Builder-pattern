package com.example;

public class Main {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Marcel", "Pavel")
                .age(30)
                .phone("0734839325")
                .address("Str.Sperantei la parter")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Ene", "Laurentiu")
                .age(25)
                .build();
        System.out.println(user2);
    }
}
