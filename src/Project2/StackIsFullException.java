package Project2;

public class StackIsFullException extends RuntimeException 
{
   public StackIsFullException()
   {
   }

   public StackIsFullException(String problem)
   { 
      super(problem);
   }
}