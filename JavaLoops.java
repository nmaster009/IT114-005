
public class JavaLoops {

	 public static void main(String[] args) {
	      int myList[] = {0, 1, 2, 3, 4, 5};
	      
	      for(int i=0; i< myList.length; i++)
	      {
	    	  System.out.println(myList[i]);
	      }
	      
	      // int i=0 says that we are starting at 0
	      // i<myList.length is the condition of the loop, 0 less that the values inthe list
	      // i++ tells the loop to increase by 1 everytime the loop has been run
	      
	      
	      
	    
	      
	      int yourList[] = {0, 1, 2, 3, 4, 5};
	      
	      for(int i=0; i< yourList.length; i= i + 2)
	      {
	    	  System.out.print(yourList[i]);
	      }
	      
	      // int=0, start at 0
	      // i<yourList.length 0 is less than the values in the array
	      // i=i+2, increases by 2 to output even numbers
	      
}
}

