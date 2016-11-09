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
public class BaseballTeam extends Sports implements Stats {
    public BaseballTeam(){
        super();
    }
    public BaseballTeam(String n, int p, int tw){
        name = n;
        players = p;
        totalWins = tw;
    }
    @Override
    public int overAllPoints(int n) {
        int r = 0;
        if(n == 0){
        r=2;
        }
        if(n == 1){
        r=1;
        }
        if(n == 2){
        r=0;
        }
        return(r);
    }
    
}
