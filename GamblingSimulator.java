package com.bl.workshop;

public class GamblingSimulator {
	public static final  int INITIAL_STAKE = 100;
    public static final int STAKE_BET = 1;
    public static int stake = 0;
    public static final int STAKE=100;
    public static final int BET=1;

    public static void winOrLose()
    {
        if(Math.random()<0.5) {
            stake++;
            System.out.println("Win");;
        }
        else {
            stake --;
            System.out.println("Lose");
    
        int totalStake=STAKE;

        System.out.println("Welcome to the Gambler Game");

        int game=(int) (Math.random() * 10) % 2;
        if(game==1){
            totalStake=totalStake+BET;
            System.out.println("Gambler won the bet and have total stake:"  +totalStake);
        }else{
            totalStake=totalStake-BET;
           System.out.println("Gambler lost the bet and have total stake:" +totalStake);
        }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome To Gambler Simulation");
        System.out.println("Initial Stake is " +INITIAL_STAKE +"$");
        System.out.println("Stake Bet is " +STAKE_BET+"$");
    }
}
