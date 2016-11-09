/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseball;

/**
 *
 * @author behac6513
 */
public abstract class Sports {
    //constructors
    
    /**
     * Class constructor
     */
    String name;
    int players;
    int totalWins;

    public Sports(){
        name = "The Waggles";
        players = 20;
        totalWins = 100;
    }
    public Sports(String n, int p, int tw){
        name = n;
        players = p;
        totalWins = tw;
    }
     public String toString() {
        String output = "Name: "+name+"\n";
        output += "Players: "+players+"\n";
        output += "Total Wins: "+totalWins+"\n";
        return (output);
    }
}
