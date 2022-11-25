package com.bl.workshop;

public class GamblingSimulator {
	 public static final int STAKE=100;
	    public static final int BET=1;
	    public static final int PERCENTAGE_50_STAKE=(STAKE/100)*50;
	    public static final int HIGH_LIMIT=STAKE+PERCENTAGE_50_STAKE;
	    public static final int LOW_LIMIT=STAKE-PERCENTAGE_50_STAKE;
	    public static final int START_DAY=1;
	    public static final int MAX_DAY=20;
	    public static final int DAYS_IN_MONTH=30;
	    public static final int STAKES_PER_DAY=50;
	    public static final int START_DOLLARS=0;

	    public static void main(String[] args) {
	        System.out.println("Welcome to the Gambler Game");
	        int days = START_DAY;
	        int totalDollars = START_DOLLARS;
	        for (days = START_DAY; days <= MAX_DAY; days++)

	        for (days = START_DAY; days <= DAYS_IN_MONTH; days++)
	        {
	            int totalStake = STAKE;


	            
	                totalDollars += STAKES_PER_DAY;
	                System.out.println("Gambler won by " +totalDollars+" dollars on day "+days);
	           
	            }
	            
	                totalDollars -= STAKES_PER_DAY;
	                System.out.println("Gambler lost by " +totalDollars+" dollars on day "+days);
	            }
	    {
	

	        int totalDollars = 0;
			if(totalDollars>START_DOLLARS)
	        {
	            System.out.println("Gambler won " +totalDollars);
	        } else {
	            System.out.println("Gambler lost " + totalDollars);
	        }
	    }
	}