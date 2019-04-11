package Project2;
import java.util.Scanner;
import java.util.Random;

public class MovieTicket {

	MovieTicket(){
		
	BTFTickets = GetTicketNumber();
	BTFTicketsPrice = GetTicketPrice();

	for(int i=0; i < BTFTickets; i++){
		myticket.setTicketPrce(BTFTicketsPrice);
		//myticket.setMyBonus();
		//checker = BonusStuff();
			ticketHolder1.push(myticket);
		
		}
	
	
	DBDTickets = GetTicketNumber();
	DBDTicketsPrice  = GetTicketPrice();
	
	for(int i=0; i < DBDTickets; i++){
		myticket1.setTicketPrce(DBDTicketsPrice);
		//checker = BonusStuff();	
		ticketHolder2.push(myticket1);
			//count++;
		}
	
	
	IJLCTickets = GetTicketNumber();
	IJLCTicketsPrice = GetTicketPrice();
	for(int i=0; i < IJLCTickets; i++){
		myticket2.setTicketPrce(IJLCTicketsPrice);
		//checker = BonusStuff();	
		ticketHolder3.push(myticket2);
			//count++;
		}

	
	

	LAHTickets = GetTicketNumber(); 
	LAHTicketsPrice = GetTicketPrice();
	for(int i=0; i < LAHTickets; i++){
		myticket3.setTicketPrce(LAHTicketsPrice);
		//checker = BonusStuff();	
		ticketHolder4.push(myticket3);
			//count++;
		}
	
	
	

	BATTickets= GetTicketNumber();
	BATTicketsPrice = GetTicketPrice();
	for(int i=0; i < BATTickets; i++){
		myticket4.setTicketPrce(BATTicketsPrice);
		//checker = BonusStuff();	
		ticketHolder5.push(myticket4);
			//count++;
		}
	

		
	}
	
	
	public static void Display2User(){
		String Bonus = "Free Popcorn";
		int checker;
		int total =0;
		Scanner kb = new Scanner(System.in);
		//tickets [] myholder = new tickets[10];
		
//	boolean keepGoing = true;
	
	
	
	
	
	
	
	
//	while(keepGoing == true)
//	{
		System.out.println("Welcome Movie Goer!");
//		System.out.println("Select the number of your movie selection");
		System.out.println("Yor choices are as follows:\n");
		System.out.println("(1.) Back to the future (total tickets left: "+ BTFTickets  +")\n");		
		
		
		System.out.println("(2.) Devil in a Blue Dress (total tickets left: "+ DBDTickets +")\n");

		System.out.println("(3.) Indiana Jones and the Last Crusade (Total tickets left: "+ IJLCTickets + ")\n");
//		
		System.out.println("(4.) Last Action Hero (Total tickets left: "+ LAHTickets + ")\n");
		
		System.out.println("(5.) Batman: Revenge of the Joker (Total tickets left: "+ BATTickets + ")\n");
				
		System.out.println("Or Please Click");
		System.out.println("(6.) To Return Tickets\n");

	
		int num = kb.nextInt();
	//,,,LAHTicketsPrice,;
	
	if(num == 1)
	{
		if(BTFTickets ==0){
			System.out.println("Sorry No more of these Tickets are available");
			System.out.println("Maybe try Another selection");
			RandomSelection(1);
			return;
		}
		ticketHolder1.pop();
		System.out.println("Your cost is: $" + BTFTicketsPrice +".00");
		BonusStuff();
		BTFTickets--;
		CollectMoney(BTFTicketsPrice);
	}
	
	if(num == 2)
	{
		if(DBDTickets ==0){
			System.out.println("Sorry No more Of these Tickets available");
			System.out.println("Maybe try Another selection");
			RandomSelection(2);
			return;
		}
		ticketHolder2.pop();
		System.out.println("Your cost is: $" +DBDTicketsPrice  +".00");
		BonusStuff();
		DBDTickets--;
		CollectMoney(DBDTicketsPrice);
	}
	if(num == 3)
	{
		if(IJLCTickets ==0){
			System.out.println("Sorry No more Of these Tickets available");
			System.out.println("Maybe try Another selection");
			RandomSelection(3);
			return;
		}
		ticketHolder3.pop();
		System.out.println("Your cost is: $" + IJLCTicketsPrice +".00");
		BonusStuff();
		IJLCTickets--;
		CollectMoney(IJLCTicketsPrice);
	}
	
	if(num == 4)
	{
		if(LAHTickets ==0){
			System.out.println("Sorry No more Of these Tickets available");
			System.out.println("Maybe try Another selection");
			RandomSelection(4);
			return;
		}
		ticketHolder4.pop();
		System.out.println("Your cost is: $" +LAHTicketsPrice  +".00");
		BonusStuff();
		LAHTickets--;
		CollectMoney(LAHTicketsPrice);
	}
	
	if(num == 5)
	{
		if(BATTickets ==0){
			System.out.println("Sorry No more Of these Tickets available");
			System.out.println("Maybe try Another selection");
			RandomSelection(5);
			return;
		}
		ticketHolder5.pop();
		System.out.println("Your cost is: $" +BATTicketsPrice  +".00");
		BonusStuff();
		BATTickets--;
		CollectMoney(BATTicketsPrice);
	}
	
	if(num == 6)
	{
		System.out.println("For which number movie are you returning tickets?");
		int TicketReturn = kb.nextInt();
		if(TicketReturn  == 1) {
			ticketHolder1.push(myticket);
			BTFTickets++;
			ReturnMyMoney(BTFTicketsPrice);
		}
		if(TicketReturn  == 2) {
			ticketHolder2.push(myticket1);
			DBDTickets++;
			ReturnMyMoney(DBDTicketsPrice);
		}
		if(TicketReturn  == 3) {
			ticketHolder3.push(myticket2);
			IJLCTickets++;
			ReturnMyMoney(IJLCTicketsPrice);
		}
		if(TicketReturn  == 4) {
			ticketHolder4.push(myticket3);
			LAHTickets++;
			ReturnMyMoney(LAHTicketsPrice);
		}
		if(TicketReturn  == 5) {
			ticketHolder5.push(myticket4);
			BATTickets++;
			ReturnMyMoney(BATTicketsPrice);
		}
		
		
	}
	
	
	}
	
//	}
	
	
	
	
	
	
	public static int GetTicketNumber() {
		Random rnd = new Random();
        int tickets = rnd.nextInt(5) + 2;
		return tickets;
	}
	
	
	public static int GetTicketPrice() {
		Random rnd = new Random();
        int ticketPrice = rnd.nextInt(10) + 11;
		return ticketPrice;
	}
	
	public static void BonusStuff() {
	Random rnd = new Random();
    int Bonus = rnd.nextInt(2);
    //System.out.println(Bonus);
//    String Bonus1 = "Free PopCorn";
//       String NoBonus= null;
//
    if(Bonus == 1) {
        System.out.println("Your ticket has a special offer Today!");
        System.out.println("Free PopCorn!\n");
    }
   
}	
	public static void RandomSelection(int num){
		System.out.println("maybe you will enjoy this movie intead: ");
		Random rnd = new Random();
        int rand = rnd.nextInt(5) + 1;
		if (rand ==5 && num != 5) {
			System.out.println("Back to the future");
		}
		if (rand ==4 && num != 4 ) {
			System.out.println("Devil in a Blue Dress");
			 		
		}
		if (rand ==3 && num != 3) {
			System.out.println("Indiana Jones and the Last Crusade");
		}
		if (rand ==2 && num != 2) {
			System.out.println("Last Action Hero ");	
		}
		if (rand ==1 && num != 1) {
			System.out.println("Batman: Revenge of the Joker");
		}
		
	}	
	
	public static void CollectMoney(int ticketsold){
		Money += ticketsold;
		
	}
	
	public static void ReturnMyMoney(int Refund){
		Money -= Refund;
		
	}
	
	
	static int Money;
	static Stack1 ticketHolder1 = new Stack1();
	static Stack1 ticketHolder2 = new Stack1();
	static Stack1 ticketHolder3 = new Stack1();
	static Stack1 ticketHolder4 = new Stack1();
	static Stack1 ticketHolder5 = new Stack1();
	static int count =1;
	
	static tickets myticket = new tickets();
	static tickets myticket1 = new tickets();
	static tickets myticket2= new tickets();
	static tickets myticket3 = new tickets();
	static tickets myticket4 = new tickets();
//	
	static int BTFTickets,DBDTickets,IJLCTickets,LAHTickets,BATTickets;
	static int BTFTicketsPrice,DBDTicketsPrice,IJLCTicketsPrice,LAHTicketsPrice,BATTicketsPrice;

}
