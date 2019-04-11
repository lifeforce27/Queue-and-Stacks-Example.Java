package Project2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartTheLine();    
		
	}
	
	
	public static void StartTheLine(){    
	Queue Customer = new Queue();
        MovieTicket BuyOrRefund = new MovieTicket();
        System.out.println("10 people have now entered into the box office line\n");
        Customer.enqueue(1);
        Customer.enqueue(2);
        Customer.enqueue(3);
        Customer.enqueue(4);
        Customer.enqueue(5);
        Customer.enqueue(6);
        Customer.enqueue(7);
        Customer.enqueue(8);
        Customer.enqueue(9);
        Customer.enqueue(10);
        
        System.out.println("1st person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
        System.out.println("2nd person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
        System.out.println("3rd person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
        System.out.println("4th person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
        System.out.println("5th person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
        System.out.println("6th person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
        System.out.println("7th person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
        System.out.println("8th person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
        System.out.println("9th person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
        System.out.println("10th person to the window\n");
        Customer.dequeue();
        BuyOrRefund.Display2User();
                
	}

	
}
