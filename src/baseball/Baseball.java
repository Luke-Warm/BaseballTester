/*
 * This code is free software; used for educational purposes
 * you can redistribute ir and/or modify it, as
 * published by Bennett Hack
 *
 * This code is distributed in the hope that it will be useful
 * but WITHOUT ANY WARRANTY; without the implied warranty
 * of usefulness for a particular purpose
 *
 * This contains the main class,
 * you should have received a copy of Sports.java, BaseballTeam.java and
 * Baseball.java (this)
 */

package baseball;

/**
 *
 * @author behac6513
 */
public class Baseball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n2 = (int)(Math.random()*2);
        BaseballTeam team1 = new BaseballTeam("Good Fellers", 18, 68);
        System.out.println(team1.toString());
    }
    
}
