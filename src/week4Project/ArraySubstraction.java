package week4Project;

import java.util.*;

public class ArraySubstraction {

	
		public static void main(String[] args) {

     ///1.	Create an array of int called ages that contains the following values:
			
            int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 93};

	
      /// Create a program that subtract the first element from the last without using 7. Print result 

              int results = ages1[ages1.length-1]- ages1[0];
   
         System.out.println("The result of subtracting the first from the last element is:" + " " + results);


      /// Create a new array of int called ages2 with 9 elements 
      ///.Add a new age to your array and repeat the step above to ensure it is dynamic 
      /// (works for arrays of different lengths)
  
              int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 20};
  
       
       /// Repeat subtraction of removing the first from the last element
  
                    int results2 = ages2[ages2.length-1]- ages2[0];
  
         System.out.println("The second result of subtracting the first from the last element is:" + " " + results2);
         
       ///Show that using the index values for the elements is dynamic (works for arrays of different lengths).
       ///c.	Use a loop to iterate through the array then calculate the average age. Print the result to the console.
        		  
         int sum = 0;
         for (int age : ages2) {
         sum = sum + age;
         }
         double average = sum / ages2.length;
        System.out.println("The average age is:" + " "+ average);
       
        /// 2. Create an array of String called names that contains the following values: 
	            
	     String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck" , "Bob"};

			 
		/// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	    /// Initialize a variable to store the total character count       
			           	   		         
		 double sumOfcount = 0;
			           	   		   
			 for (int counter = 0; counter < names.length; counter++) {
			           	   		    	 
			 sumOfcount += names[counter].length();
			           	   		              }
			 double averageLetter = sumOfcount/names.length;
			           	   		    	  
			 System.out.println("The average number of letters in the names array is:" + " " + averageLetter);
				
			///b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			 /// for loop to print full array
				           	   		
			 String concatenateAll = " ";
				           	   		   	
			 for (int counter = 0; counter < names.length; counter++) {
				           	   		    
			 concatenateAll = concatenateAll + names[counter] + " ";
			 }
				           	   		    
		     System.out.println("The names entered are: " +  concatenateAll);

			/// 3. How do you access the last element of any array?
			///To get the last element, you can access it using the index array.length - 1.
			/// for example using age2 array
				
			int lastElement = ages2[ages2.length - 1]; 
		    System.out.println("The last element in ages2 array is:" + " " + lastElement);	
						
			///4. How do you access the first element of any array?
			/// To get the first element in an array, it can be accessed by using the index array 0
						           	   		
			int firstElement = ages2[0];
			System.out.println("The first element in ages2 array is:" + " " + firstElement);

			///5. Create a new array of int called nameLengths. Write a loop to iterate over the 
			/// previously created names array and add the length of each name to the nameLengths array.
				                     
			  int [] nameLengths = new int[names.length];
			  for (int i = 0; i < nameLengths.length; i++) {
			  nameLengths[i] = names[i].length();
			  System.out.println(nameLengths[i]);
				   }
				/// 6. A loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
    			
    			int totalOfNameLengths = 0;
    			for (int nameLength : nameLengths) {
    				totalOfNameLengths += nameLength;
    			}
    				System.out.println("Total of all elements in nameLengths array: " + totalOfNameLengths);

					/// 7. Write a method that takes a String, word, and an int, n, as arguments and 
					///  returns the word concatenated to itself n number of times. (i.e. if I pass in 
					///  “Hello” and 3, I expect the method to return “HelloHelloHello”).
					            
					String word = "Hello";
					      int n = 3;
					System.out.println("The words to repeat is: " + repetition(word, n));


					///8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
					///  the full name should be the first and the last name as a String separated by a space).
					String firstName = "Candy";
			        String lastName = "Johnson";
					System.out.println("The fisrt and last names are:" + " " + firstAndLast(firstName, lastName));
					
					///9. Write a method that takes an array of int and returns true if the sum of all the ints in the 
					///array is greater than 100.
					
		            int[] arr = {10,15,35,25,50};
		  			System.out.println(returnsTrue(arr));
					
					///10. Write a method that takes an array of double and returns the average of all the elements in the array.
	                
		  			double []elements = {10.5,15.3,35.4,25.5,50.5,40.5};
	          
	                System.out.println(totalAverage(elements));

					///11. A method that takes two arrays of double and returns true if the average of the elements 
					///in the first array is greater than the average of the elements in the second array.
					               
				    double[] numbers1 = {30.8, 34.6, 90.5, 54.0};
					double[] numbers2 = {2.8, 11.4, 15.2, 44.3};
					System.out.println(higherAverage(numbers1, numbers2));

					///12. A method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
					///and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
									
					boolean isHotOutside = true;
					double moneyInpocket = 8.50;
					System.out.println(willBuyDrink(isHotOutside, moneyInpocket));

					// 13. A method of your own that solves a problem. In comments, write what the method does and why you created it.
					
					String s = "ABEACDAARRABCEA";
					
					System.out.println("The number of character 'A' in the string is;" + " " + countA(s));
			}
	               
		
	// end of main
	

		 /// Question 7
		
		
		public static String repetition(String word, int n) {
		       
		 String concatenate = " ";
		
		 for(int i=0; i<3; i++){
		 concatenate +=word;
		 }
		           
		  return concatenate;
		 }

		
		 /// 8. Question 8  
	      public static String firstAndLast(String firstName, String lastName) {
	    	  
	       String fullName = firstName + " " + lastName;
	                     	  
	      return fullName;
	      }


		// Step 9
		/// 9.Question
	      
       public static boolean returnsTrue(int [] arr) {
     	   
       int TotalSum = 0;
    	  
        for( int i = 0; i < arr.length; i++ ) {
         	 
        TotalSum += arr[i];
        }
                    
		return TotalSum > 100;
                     	
    	   
    	}

		   ///Question 10
	     public static double totalAverage(double[] elements) {
	                      
	          
	      double sumOfelements = 0;
	  	   		   
	 	  for (int counter = 0; counter < elements.length; counter++) {
	 	   		    	 
	 	   		   
	 	  sumOfelements  += elements[counter];
	 	  }
	 	  double average = sumOfelements/elements.length;
	 	   		    
	 	  return average;
	 	   		    
	 	   		
	     }
        
   ///Question 11     
   public static boolean higherAverage(double[] numbers1, double[] numbers2) {
    		double sum1 = 0;
    		
    for (int i = 0; i < numbers1.length; i++) {
   	sum1 += numbers1[i];
    }
    double average1 = sum1/numbers1.length;
    System.out.println("The first average is :" + average1);

    		double sum2 = 0;
    for (int i = 0; i < numbers2.length; i++) {
    	sum2 += numbers2[i];

    }
    double average2 = sum2/numbers2.length;
    		System.out.println("The second average is :" + average2);

    if (average1 > average2) {
    return true;

    } else {

    return false;
    }

    }	
    		
		// Step 12
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInpocket) {
			if (isHotOutside == true && moneyInpocket > 10.50)
				return true;
		 else 
			return false;
		}

		///Question 13   
		///countA that accepts a String parameter and returns the number of times the 
		///letter 'A' is found in the string.

		     public static int countA (String s)
		    {
		   int count = 0;
		   for (int i = 0; i < s.length(); i++)
		      if (s.charAt(i) == 'A')
		         count++;
		   return count;
		    }

		         

		       
		     }// End of Class
