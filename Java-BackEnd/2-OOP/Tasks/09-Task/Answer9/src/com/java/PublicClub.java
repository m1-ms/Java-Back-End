package com.java;

public class PublicClub extends ParentClub {

    @Override
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("Player added to Public Club.");
    }

}