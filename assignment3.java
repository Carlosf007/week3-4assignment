

package assignment3;

public class assignment3 {

	public static void main(String[] args) {
		// 

		
		//Coding Steps — Arrays and Methods
		//1.Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//a.Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
			int lengthOfArr = ages.length;
			
		//int value = (ages[lengthOfArr - lengthOfArr] - ages[lengthOfArr - 1]);
			int value = ages[lengthOfArr -1] - ages[0];
				System.out.println("difference = " + value);
	
		//b.Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			int[] ages2 = {4, 23, 55, 89, 12, 72};
			int lengthOfArr2 = ages2.length;
			int value2 = ages2[lengthOfArr2 -1] - ages2[0];
		  			System.out.println("difference2 = " + value2);	  	
		//c.Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		  			double sum = 0;
			for (int number : ages) {
				sum += number;
			
			}
				System.out.println("The sum of all ages is: " + sum);
			
			double average = sum / ages.length;
				System.out.println("The average age is: " + average);
		
		//2.Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		
	
		//a.Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			int letterSum = 0;
			for (String name : names) { 
				letterSum += name.length();
			}		
			System.out.println("The sume of all letter is: " + letterSum);					
			int average2 = letterSum / names.length;
			System.out.println("Average letters per name: " + average2);
		//b.Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			String concat="";
	         for(int i=0;i<names.length;i++)
	         {
	         	concat+=names[i];
	         	concat+=", ";
	         }System.out.println("Concatenation of all String is:  " +  concat );
	         
		//3.How do you access the last element of any array?
			System.out.println ("The last name of the Array is: " + names[names.length - 1]);
			
		//4.How do you access the first element of any array?
			System.out.println("The first name of the Array is: " + names[0]);
			
		//5.Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			 
			int []nameLengths=new int[names.length];
	         for(int i=0;i< names.length;i++)
	         {
	        	 String name =names[i];
	         	nameLengths[i]=name.length();
	         }
	         	
		//6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	         int sum3 = 0;
	         for (int i = 0; i < nameLengths.length; i++) {
	             sum3 += nameLengths[i];
	         }
	         	System.out.println("The sum of the elements in the nameLengths array is " + sum3);
	         	
		//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	         String word = "Hello";
	         int n = 3;
	         String repeated = repeatWord(word, n);
	         System.out.println(repeated); 
			
		//8.Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	         firstName ("Tom");
	         lastName ("Flecher");
	      
		//9.Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	         int[] nums1 = {10, 44, 66, 77, 80};
	         boolean result1 = sumGreaterThan100(nums1);
	         System.out.println("Is the sum of nums1 greater than 100?: " + result1);

	         int[] nums2 = {11, 24, 43, 3};
	         boolean result2 = sumGreaterThan100(nums2);
	         System.out.println("Is the sum of nums2 greater than 100?: " + result2);
			
		//10.Write a method that takes an array of double and returns the average of all the elements in the array.
	         double[] arr= {12, 32, 65, 78, 99};
	         System.out.println("Average of the Array is " + Averagedouble(arr));
		//11.Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	         double[] arr2 = {13, 23, 55, 86, 90};
	         System.out.println("Average of the second Array is " + Averagedouble(arr2));
	         System.out.println("Is the average in the first array greater than the average in the second array? : " + isGreaterAverage(arr, arr2));
			
		//12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	         boolean hotOutside = true;
	         double moneyInPocket = 15.00;
	         boolean willBuy = willBuyDrink(hotOutside, moneyInPocket);
	         System.out.println("Can I buy the drink?:  " + willBuy);
	     
			
		
		//13.Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
			int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			double avg3 = averageOfOddNumbers(arr4);
						System.out.println("The average odd number is: " + avg3);
			
		}

		
	
	
	
	
			
			public static boolean sumGreaterThan100(int[] nums) {
				int sum = 0;
				for (int i = 0; i < nums.length; i++) {
					sum += nums[i];
				}
				return sum > 100;
				}
	
			public static double averageOfOddNumbers(int[] arr4) { 
			    int sum = 0;
			    int count = 0;
			    for (int i = 0; i < arr4.length; i++) {
			        if (arr4[i] % 2 != 0) { // check if the number is odd
			            sum += arr4[i];
			            count++;
			        }
			    }
			    if (count == 0) {
			        return 0; // return 0 if there are no odd numbers in the array
			    } else {
			        return (double) sum / count; // return the average of all odd numbers in the array
			    }
			}
			
			
			
			
	
	
			// willBuyDrink method
			public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket)
			{
				if (isHotOutside && moneyInPocket > 10.50) {
			        return true;
			    } else 
			        return false;
			    }
			
			public static String repeatWord(String word, int n) {
			    String result = "";
			    for (int i = 0; i < n; i++) {
			        result += word;
			    }
			    return result;
			}		



		public static boolean isGreaterAverage(double array1[],double array2[])
		{
			// calculate average and then compare
			double avg1=Averagedouble(array1);
			double avg2=Averagedouble(array2);
			if(avg1>avg2)
			{
				return true;
			}
			return false;
		}
	
	
	
	
		public static double Averagedouble(double arr[])
		{
			double sum2=0.0;
			for(int i=0;i<arr.length;i++)
			{
			sum2+=arr[i];
			}
			return sum2/arr.length;
		}
		
			public static boolean isGreaterthan(int i)
			{
				// call calculatesum method to calculate the sum.
				int sum1=calculatesum(i);
				// if greater than 100 return true
				if(sum1>100)
				{
					return true;
				}
				// else return false.
				return false;
			}
	
			
			
		private static int calculatesum(int i) {
				
				return 0;
			}
		public static void firstName(String String1) {
			System.out.print("Fulle Name is: " + String1 + " ");
		}private static void lastName(String string) {
			System.out.println(string);
			
		}






}		
		










	
			
			



