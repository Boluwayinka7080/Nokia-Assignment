import java.util.Scanner;
public class Nokiaa{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        System.out.println("YOUR NOKIA MENU MAP");
	    String menu = """
			        1: PHONEBOOK
			        2: MESSAGES 
			        3: CHAT
			        4: CALL REGISTER
			        5: TONES
			        6: SETTINGS
			        7: CALL DIVERT
			        8: GAMES
			        9: CALCULATOR
			        10: REMINDERS
			        11: CLOCK
			        12: PROFILES
			        13: SIM SERVICES
		    """;
	    System.out.println(menu);

        System.out.println("Select menu option:");
        String menuOption = input.next();

        switch(menuOption){
            case "1":
                System.out.println("PHONEBOOK:");
                String phoneBook = """
			    1: Search
			    2: Search Nos.  
			    3: Add Name
			    4: Erase
			    5: Edit
			    6: Assign Name
			    7: Send b'card
			    8: Options**
			    9: Speed Dials
			    10: Voice Tags
					""";	
                System.out.println(phoneBook);
                
                System.out.println("Enter phonebook options:");
                String phoneBookOption = input.next();
                
                switch(phoneBookOption){
                    case "1":
                        System.out.println("Search");
                        break;
                    case "2": 
                        System.out.println("Search Nos.");
                        break;
                    case "3":
                        System.out.println("Add name");
                        break;
                    case "4":
                        System.out.println("Erase");
                        break;
                    case "5":
                        System.out.println("Edit");
                        break;  
                    case "6":
                        System.out.println("Assign name");
                        break;    
                    case "7":
                        System.out.println("Send b'card");
                        break;
                    case "8":
                        System.out.println("Options");
                        String options = """
	                    1: Type of View
                        2: Memory status
                        """;
                        System.out.println(options);

                        System.out.println("Enter option");
                        String optionEntry = input.next();
                        switch(optionEntry){
                            case "1":
                                System.out.println("Type of view");
                                break;
                            case "2":
                                System.out.println("Memory status");
                                break;
                         
                       } 
                        break;
                    case "9":
                        System.out.println("Speed Dials");
                        break;
                    case "10":
                        System.out.println("Voice Tags");
                        break;
                }
                break;

            case "2":

                    String messages = """
                    MESSAGES:

                    1.Write messages
                    2.Inbox
                    3.Outbox
                    4.Picture messages
                    5.Templates
                    6.Smileys
                    7.Messages settings
                          """;
                    System.out.println(messages);
                
                    System.out.println("Enter messages options:");
                    String messagesOption = input.next();
                    
                   switch(messagesOption){
                        case "1":
                            System.out.println("Write messages");
                            break;
                        case "2":
                            System.out.println("Inbox");
                            break;
                        case "3":
                            System.out.println("Outbox");
                            break;
                        case "4":
                            System.out.println("Picture messages");
                            break;
                        case "5":
                            System.out.println("Templates");
                            break;
                        case "6":
                            System.out.println("Smileys");
                            break;

                        case "7":
                            System.out.println("Messages settings");

                            String messageSetting = input.next();

                            switch(messageSetting){
                                case "1":
                                    System.out.println("Set 1");
                                    String set1 = """
                                        1. Message centre number
                                        2. Messages sent as
                                        3. Messages validity
                                    """;
                                    System.out.println(set1);

                                    String set1Choice = input.next();

                                    switch(set1Choice){
                                        case "1":
                                            System.out.println("Message centre number");
                                            break;
                                        case "2":
                                            System.out.println("Message sent as");
                                            break;
                                        case "3":
                                            System.out.println("Message validity");
                                            break;
                                    }
                                    break;

                                case "2":
                                    System.out.println("Common");
                                    String common = """
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                    """;
                                    System.out.println(common);
                                    break;
                            }
                            break;

                        case "8":
                            System.out.println("Info service");
                            break;
                        case "9":
                            System.out.println("Voice mailbox number");
                            break;
                        case "10":
                            System.out.println("Service command editor");
                            break;
                    }
                   

             case "3" :
                    System.out.println("Chat"); 
                    break;


            case "4" :
                    System.out.println("Call register");
                    String callRegister = """
                        1. Missed calls
                        2. Received calls
                        3. Dialed numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid credit
                    """;

                    System.out.println(callRegister);
                     
                    System.out.println("Enter your selection:");
                    String callRegisterOption = input.next();

                    switch(callRegisterOption){
                        case "1":
                            System.out.println("Missed call options");
                            break;
                        case "2":
                            System.out.println("Received calls options");
                            break;
                        case "3":
                            System.out.println("Dialed numbers options");
                            break;
                        case "4":
                            System.out.println("Erase call list");
                            break;
                        case "5":
                            System.out.println("Show call duration");
                            
                            String callDurationMenu = """
                                1. Last call duration
                                2. All calls duration
                                3. Received calls duration
                                4. Dialed calls duration
                                5. Clear timers
                            """;
                            System.out.println(callDurationMenu);

                            System.out.println("Enter choice:");
                            String callDurationChoice = input.next();
                            switch(callDurationChoice){
                                case "1":
                                    System.out.println("Last call duration");
                                    break;
                                case "2":
                                    System.out.println("All calls duration");
                                    break;
                                case "3":
                                    System.out.println("Received calls duration");
                                    break;
                                case "4":
                                    System.out.println("Dialed calls duration");
                                    break;
                                case "5":
                                    System.out.println("Timers cleared");
                                    break;
                                default:
                                    System.out.println("Invalid input");
                            }
                            break;

                    }



        }

	

    } 

                        





}
