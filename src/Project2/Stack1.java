package Project2;

import java.util.*; 
import java.util.ArrayList;

 public class Stack1<T> {

      public Stack1()
    {
      sp = 0; 
	  theStack = new ArrayList<T>(DEFAULT_STACK_SIZE);
	  theStackSize = DEFAULT_STACK_SIZE;
	} 

	public Stack1(int stackSize)
	{ 
    	sp = 0; 
		theStack = new ArrayList<T>(stackSize); 
		theStackSize = stackSize; 
	} 

 	public void push(T value) throws StackIsFullException
	{ 		
	   if (sp < theStackSize)
	       theStack.add(sp++, value);  // if an error condition occurs, handle in else block
		   else 
		   {
    		   StackIsFullException exception = new StackIsFullException("Stack full"); 
			   throw exception;
		   } 	
	}

	public T pop() throws StackIsEmptyException
	{ 	
     	if (sp > 0) // Perform normal processing ﬁrst;
		return theStack.remove(--sp);   // if an error condition occurs, handle in else block 
		else
		{
    		StackIsEmptyException exception = new StackIsEmptyException("Stack empty"); 
			throw exception;
  		}
 	}

	private int sp;
	private ArrayList<T> theStack;
	private int theStackSize;
	private final int DEFAULT_STACK_SIZE = 10;
}
