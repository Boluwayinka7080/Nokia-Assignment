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
        
                        case "6":
                            System.out.println("Show call costs");

                            String callCosts = """
                                    1. Last call cost
                                    2. All calls cost                   
                                    3. Clear counters
                                    """;
                            System.out.println(callCosts);

                            System.out.print("Enter choice: ");
                            String callCost = input.next();

                            switch(callCost){
                                case "1":
                                    System.out.println("Last call cost");
                                    break;
                                case "2":
                                    System.out.println("All calls cost");
                                    break;
                                case "3":
                                    System.out.println("Counters cleared");
                                    break;
                            }
                            break;

                        case "7":
                            System.out.println("Call cost settings");

                            String costSettingsMenu = """
                                    1. Call cost limit
                                    2. Shows cost in
                                    """;
                            System.out.println(costSettingsMenu);

                            System.out.println("Enter choice: ");
                            String costSettingsChoice = input.next();

                            switch(costSettingsChoice){
                                case "1":
                                    System.out.println("Call cost limit");
                                    break;
                                case "2":
                                    System.out.println("Shows costs in");
                                    break;
                            }
                            break;

                       case "8":
                            System.out.println("Prepaid credit");
                            break;
                    }
                    break;


            case "5" :
                System.out.println("Tones");
                String tones = """
                     1. Ringing tone
                     2. Ringing volume
                     3. Incoming call alert
                     4. Composer
                     5. Messages alert tones
                     6. Keypad tones
                     7. Warning and game tones
                     8. Vibrating alert
                     9. Screen saver
                    """;

                    System.out.println(tones);

                    System.out.println("Enter choice");
                    String toneChoice = input.next();
                    switch(toneChoice){
                          case "1" :
                          System.out.print("Ringing tone");
                          break;
                    case "2" :
                          System.out.print("Ringing volume");
                          break;
                    case "3" :
                          System.out.print("Incoming call");
                          break;
                    case "4" :
                          System.out.print("Composer"); 
                          break;
                    case "5" :
                          System.out.print("Messages alert tones");
                          break;
                    case "6" :
                          System.out.print("Keypad tones");
                          break;
                    case "7" :
                          System.out.print("Warning and game tone");
                          break;
                    case "8" :
                          System.out.print("Vibrating alert");
                          break;
                    case "9" :
                          System.out.print("Screen saver");
                          break;
                    }
                break;


           case "6" :
                 System.out.println("Access settings");
                 String accessSettings = """
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                     """;
                   System.out.print(accessSettings);
                
                   System.out.print("Enter selection");
                   String callSettings = input.next();
                   switch(callSettings){
                         case "1" :
                             System.out.print("Call settings");
                             String callSettingsMenu = """
                                1. Automatic redial
                                2. Speed dialing
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """;
                                 System.out.print(callSettingsMenu);
                
                               System.out.print("Enter selection");
                               String callSettingsOptions = input.next();
                            
                                switch(callSettingsOptions){
                                    case "1" :
                                         System.out.print("Automatic redial");
                                         break;
                                    case "2" :
                                         System.out.print("Speed dialing");
                                         break;
                                    case "3" : 
                                         System.out.print("Call waiting options");
                                         break; 
                                     case "4" : 
                                         System.out.print("Own number sending");
                                         break;                               
                                      case "5" : 
                                         System.out.print("Phone line in use");
                                         break;                               
                                       case "6" : 
                                         System.out.print("Automatic answer");
                                         break;
                                 }
                                 break;   
                        case "2" :
                              System.out.print("Phone settings");

                              String phoneSettingsMenu = """
                               1. Language 
                               2. Cell info display
                               3. Welcome note
                               4. Network selection
                               5. Lights
                               6. Confirm SIM service actions
                                    """;
                                System.out.print(phoneSettingsMenu);
            
                           System.out.print("Enter selection");
                           String phoneSettingsOptions = input.next();
                                switch(phoneSettingsOptions){
                            case "1" :
                                 System.out.print("Language");
                                 break;
                            case "2" :
                                 System.out.print("Cell info dispaly");
                                 break;
                            case "3" : 
                                 System.out.print("Welcome note");
                                 break; 
                             case "4" : 
                                 System.out.print("Network selection");
                                 break;                               
                              case "5" : 
                                 System.out.print("Lights");
                                 break;                               
                               case "6" : 
                                 System.out.print("Confirm SIM service actions");
                                }
                                 break;   
                               case "3" :
                                  System.out.print("Security settings");

                                  String securitySettingsMenu = """
                                   1. PIN code request 
                                   2. Call barring service
                                   3. Fixed dialing
                                   4. Closed user group
                                   5. Phone security
                                   6. Change access codes
                                        """;
                                     System.out.print(securitySettingsMenu);
                
                                   System.out.print("Enter selection");
                                   String securitySettingsOptions = input.next();
                                    switch(securitySettingsOptions){
                                        case "1" :
                                             System.out.print("PIN code request ");
                                             break;
                                        case "2" :
                                             System.out.print("Call barring service");
                                             break;
                                        case "3" : 
                                             System.out.print("Fixed dialing");
                                             break; 
                                        case "4" : 
                                             System.out.print("Closed user group");
                                             break;                               
                                        case "5" : 
                                             System.out.print("Phone security");
                                             break;                               
                                       case "6" : 
                                             System.out.print("Change access codes");
                                    }
                                               break;  
                               case "4" :
                                    System.out.print("Factory factory settings");
                        }


               case "7" :
                    System.out.println("Call divert");
                    break;

                case "8" :
                    System.out.println("Games");
                    break;

                case "9" :
                    System.out.println("Calculator");
                    break;

                case "10" :
                    System.out.println("Reminders");
                    break;
                            
                case "11":
                    System.out.println("Clock");
                    String clock = """
                        1. Alarm clock
                        2. Clock settings
                        3. Date settings
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                    """;
                    System.out.println(clock);

                    System.out.println("Enter choice:");
                    String clockChoice = input.next();

                    switch(clockChoice){
                        case "1": System.out.println("Alarm clock"); break;
                        case "2": System.out.println("Clock settings"); break;
                        case "3": System.out.println("Date settings"); break;
                        case "4": System.out.println("Stopwatch"); break;
                        case "5": System.out.println("Countdown timer"); break;
                        case "6": System.out.println("Auto update"); break;
                    }
                    break;

            case "12": System.out.println("Profiles"); break;
            case "13": System.out.println("SIM services"); break;
        }
    }
}

                        






