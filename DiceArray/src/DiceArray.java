public class DiceArray 
{
	public static void main (String[] args)
	{
	//fields
	int roll1;
	int roll2;
	int total;
	DiceRoll dice1 = new DiceRoll();
	DiceRoll dice2 = new DiceRoll();
	int[] value = new int[13];
	//
	for (int i=0; i<=1000; i++)
	{
		roll1 = dice1.roll();
		roll2 = dice2.roll();
		total = dice1.roll() + dice2.roll();
		value [total]+=1;
	for (int j=2; j<13; j++)
	{
		System.out.println("You rolled " + j + value[j] + " times");
	}
		
	}
	}
}

