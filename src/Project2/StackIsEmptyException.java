package Project2;

public class StackIsEmptyException extends RuntimeException 
{ 
   public StackIsEmptyException() 
   { 
   }
   
   public StackIsEmptyException(String problem)
   { 
      super(problem);
   }
}