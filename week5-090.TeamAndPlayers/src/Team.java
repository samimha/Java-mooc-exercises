
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sami
 */
public class Team {
    private String name;
    private ArrayList<Player> list;
    private int maxSize;
    
    public Team(String name){
        this.name = name;
        this.list = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName(){
        return name;
    }
    
    public void addPlayer(Player player){
        if (list.size() < maxSize)
            list.add(player);
    }
    
    public void printPlayers(){
        for(Player player : list){
            System.out.println(player.toString());
        }
    }
    
    public void setMaxSize(int newSize){
        maxSize = newSize;
    }
    
    public int size(){
        return list.size();
    }
    
    public int goals(){
        int goals = 0;
        for(Player player : list){
            goals += player.goals();
        }
        return goals;
    }
}
