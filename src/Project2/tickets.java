package Project2;
//Author Jonathan Smart
import java.util.Random;

public class tickets {
	

	int TicketPrce;
	int TicketNumber;
    int MyBonus;
	
	
//	tickets(){
//	
//	}

	public int getTicketPrce() {
		return TicketPrce;
	}


	public void setTicketPrce(int ticketPrce) {
		TicketPrce = ticketPrce;
	}


	public int getMyBonus() {
		return MyBonus;
	}


	public void setMyBonus() {
		Random rnd = new Random();
      int Bonus = rnd.nextInt(2);
//      System.out.println(Bonus);
      this.MyBonus = Bonus;

	
	}
	
//	public static int BonusStuff() {
//		Random rnd = new Random();
//        int Bonus = rnd.nextInt(2);
//        System.out.println(Bonus);
////        String Bonus1 = "Free PopCorn";
////           String NoBonus= null;
//// 
//        if(Bonus == 1)
//            return 1;
//        if(Bonus == 2)
//            return 2;
//        
//        return 2;
//	}	


	@Override
	public String toString() {
		return "tickets [TicketPrce=" + TicketPrce + ", MyBonus=" + this.MyBonus + "]";
	}
	
	

}
