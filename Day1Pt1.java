//Import block
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class Day1Pt1 {

	/*
	 * Author: Cole Polyak
	 * Advent of Code 2017 Day 1 Part 1
	 * 01 December 2017
	 * 
	 */
	
	/*
	 * In this first challange we are given a string of numbers. Our task
	 * is to sum up consecutive numbers that appear in the string. 
	 *  
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = null;
		
		//Try catch block to set up Scanner
		try
		{
			keyboard = new Scanner(new FileInputStream("inputDay1.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
			System.exit(0);
		}
		
		//Defining number array. File format has total number of ints as first line in the file.
		int[] nums = new int[keyboard.nextInt()];
		
		//Initializing our array.
		int index = 0;
		while(keyboard.hasNextInt())
		{
			nums[index] = keyboard.nextInt();
			++index;
		}
		
		
		int sum = 0;
		
		// Looping over array.
		for(int i = 0; i < nums.length; ++i)
		{
			int current; int current2;
			
			//If else statement assigns our current scoped numbers. If the last number in the sequence 
			// is being looked at, the last number and first number are paired.
			if(i == nums.length-1)
			{
				current = nums[i];
				current2 = nums[0];
			}
			else
			{
				current = nums[i];
				current2 = nums[i+1];
			}
			
			//Checks if the numbers are identical and sums if they are.
			if(current == current2)
			{
				sum += current;
			}
			
		}
		
		//And output.
		System.out.println("The sum of the consecutive numbers are " + sum);
		keyboard.close();
	}

}
