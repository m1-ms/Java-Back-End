package com.java;

import java.util.ArrayList;

public class ParentClub extends Player{
    protected ArrayList<Player> players = new ArrayList<>();      // Because I don't know how many players

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void printPlayers() {
        for (Player p : players) {
            System.out.println("ID : " + p.getId());
            System.out.println("Name : " + p.getName());
            System.out.println("Age : " + p.getAge());
            System.out.println("Phone Number : " + p.getPhoneNumber());
        }
    }

}
