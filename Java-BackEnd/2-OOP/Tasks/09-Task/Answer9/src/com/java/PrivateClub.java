package com.java;

public class PrivateClub extends ParentClub {

    @Override
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("Player added to Private Club.");
    }

}