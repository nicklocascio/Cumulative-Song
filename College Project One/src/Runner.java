
public class Runner 
	{
	public static void endLine()
		{
		System.out.println("Perhaps she'll die.");
		}
	
	public static void dontKnowWhy()
		{
		System.out.println("I don't know why she swallowed that fly.");	
		}
	
	public static void swallowed(String a)
		{
		System.out.println("There was an old woman who swallowed a " + a);
		}
	
	public static void why(String a, String b)
		{
		System.out.println("She swallowed the " + a + " to catch the " + b);	
		}
	
	public static void verseOne()
		{
		swallowed("fly");
		dontKnowWhy();
		endLine();
		System.out.println();	
		}
	
	public static void verseTwo()
		{
		swallowed("spider");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		why("spider", "fly");
		dontKnowWhy();
		endLine();
		System.out.println();
		}
	
	public static void verseThree()
		{
		swallowed("bird");
		System.out.println("How absurd to swallow a bird.");
		why("bird", "spider");
		why("spider", "fly");
		dontKnowWhy();
		endLine();
		System.out.println();
		}
	
	public static void verseFour()
		{
		swallowed("cat");
		System.out.println("Imagine that to swallow a cat.");
		why("cat", "bird");
		why("bird", "spider");
		why("spider", "fly");
		dontKnowWhy();
		endLine();
		System.out.println();
		}
	
	public static void verseFive()
		{
		swallowed("dog");
		System.out.println("What a hog to swallow a dog.");
		why("dog", "cat");
		why("cat", "bird");
		why("bird", "spider");
		why("spider", "fly");
		dontKnowWhy();
		endLine();
		System.out.println();
		}
	
	public static void verseSix()
		{
		swallowed("goat");
		System.out.println("I'd jump in a moat if I had to swallow a goat.");
		why("goat", "dog");
		why("dog", "cat");
		why("cat", "bird");
		why("bird", "spider");
		why("spider", "fly");
		dontKnowWhy();
		endLine();
		System.out.println();
		}
	
	public static void verseSeven()
		{
		swallowed("horse");
		System.out.println("She died of course.");
		}
	
	public static void main(String [] args)
		{
		verseOne();
		verseTwo();
		verseThree();
		verseFour();
		verseFive();
		verseSix();
		verseSeven(); 
		}
	}
