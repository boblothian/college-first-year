import java.util.Scanner;

public class theatreTickets {

	static Scanner sc=new Scanner(System.in);


	//main method//

	public static void main(String[] args) 
	{
		int numberOfAdults = 0;
		int numberOfTeenagers = 0;
		int numberOfChildren = 0;



		getInput(numberOfAdults, numberOfTeenagers, numberOfChildren);



	}

	public static void getInput(int numberOfAdults,int numberOfTeenagers, int numberOfChildren)
	{



		System.out.print("Please enter the number of people in your group: ");
		int numberOfPersons = sc.nextInt();
		//code to limit input to between 2 and 5
		if (numberOfPersons<2 || numberOfPersons>5)

		{
			System.out.print("The maximum number of people in a group is 5 and the minimum is 2, please try again: \n");
			getInput(numberOfAdults, numberOfTeenagers, numberOfChildren);			
		}
		//code to find ages and compile total number of adults, teenagers and children

		else
		{

			for(int i=1;i<=numberOfPersons;i++)
			{ System.out.print("Please enter the age of person " +i+ ": ");

			int age = sc.nextInt();		


			if (age>=20)
			{
				numberOfAdults++;
			}
			else if (age>=11 && age<20)
			{
				numberOfTeenagers++;
			}
			else if (age>=2 && age<11)
			{
				numberOfChildren++;
			}
			else if (age<2)
			{//restart booking system if someone enters an age that is less than 2
				System.out.println("Age entered is not valid, please restart booking");
				getInput(numberOfAdults, numberOfTeenagers, numberOfChildren);

			}
			}			
			if (numberOfAdults<=0)
			{//to terminate program if adult ticket is not booked
				System.out.println("Booking terminated. One adult must be booked.");
				System.exit(0);
			}
		}//to calculate total number of people booked
		int totalPeople = numberOfAdults+numberOfTeenagers+numberOfChildren;

		priceCalculator(numberOfAdults,numberOfTeenagers, numberOfChildren, totalPeople);
	}


	public static void priceCalculator(int numberOfAdults,int numberOfTeenagers, int numberOfChildren, int totalPeople)
	{//calculations for total ticket prices
		double priceAdults = 10;
		double priceTeenagers = 7;
		double priceChildren = 2;
		double totalPriceForAdults = priceAdults*numberOfAdults;
		double totalPriceForTeenagers = priceTeenagers*numberOfTeenagers;
		double totalPriceForChildren= priceChildren*numberOfChildren;

		print (numberOfAdults,numberOfTeenagers, numberOfChildren, totalPeople, totalPriceForAdults, totalPriceForTeenagers, totalPriceForChildren, priceAdults, priceTeenagers, priceChildren);

	}

	public static void print(int numberOfAdults, int numberOfTeenagers, int numberOfChildren, int totalPeople, double totalPriceForAdults, double totalPriceForTeenagers, double totalPriceForChildren, double priceAdults, double priceTeenagers, double priceChildren)
	{//print results
		System.out.println("Here are your reservation details********");
		System.out.println("Number of people in group = "+totalPeople);
		System.out.println("Number of adults = "+numberOfAdults +". At £"+priceAdults+" per adult. The total price for adults is £" +totalPriceForAdults);
		System.out.println("Number of teenagers = "+numberOfTeenagers +". At £"+priceTeenagers+" per teenager. The total price for teenagers is £" +totalPriceForTeenagers);
		System.out.println("Number of children = "+numberOfChildren +". At £"+priceChildren+" per child. The total price for children is £" +totalPriceForChildren);
		System.out.println("The total price for this reservation is £"+(totalPriceForAdults+totalPriceForTeenagers+totalPriceForChildren));
		System.out.println("********Your reservation is confirmed, thank you*********");

	}
}
