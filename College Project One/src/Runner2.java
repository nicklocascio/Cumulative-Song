import java.util.*;

public class Runner2 
	{
	static ArrayList <String> animals = new ArrayList <String>();
	static ArrayList <String> rhymes = new ArrayList <String>();
	
	public static void endLine()
		{
		System.out.println("Perhaps she'll die.");
		}
	
	public static void dontKnowWhy()
		{
		System.out.println("I don't know why she swallowed that fly,");	
		}
	
	public static void swallowed(String a)
		{
		System.out.println("There was an old woman who swallowed a " + a + ".");
		}
	
	public static void why(String a, String b)
		{
		System.out.println("She swallowed the " + a + " to catch the " + b + ",");	
		}
	
	public static void fillArrays()
		{
		animals.add("fly");
		animals.add("spider");
		animals.add("bird");
		animals.add("cat");
		animals.add("dog");
		animals.add("goat");
		animals.add("horse");
		rhymes.add("That wriggled and iggled and jiggled inside her.");
		rhymes.add("How absurd to swallow a bird.");
		rhymes.add("Imagine that to swallow a cat.");
		rhymes.add("What a hog to swallow a dog.");
		rhymes.add("I'd jump in a moat if I had to swallow a goat.");
		}
	
	public static void main(String [] args)
		{
		fillArrays();
		int k = 0;
		for(int i = 0; i < 7; i++)
			{
			swallowed(animals.get(i));
			if(i < 6)
				{
				if(i >= 1)
					{
					System.out.println(rhymes.get(k));
					k++;
					for(int j = i; j > 0; j--)
						{
						why(animals.get(j), animals.get(j-1));
						}
					}
				dontKnowWhy();
				endLine();
				}
			else
				{
				System.out.println("She died of course.");	
				}
			System.out.println();
			}
		}
	}
