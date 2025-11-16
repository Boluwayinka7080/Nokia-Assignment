import java.util.Scanner;
public class NokiaIteration{
    public static void main(String[] args){
        mainMenu();
    }


    public static void mainMenu(){
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
                        mainMenu();
                    case "2": 
                        System.out.println("Search Nos.");
                        mainMenu();
                    case "3":
                        System.out.println("Add name");
                        mainMenu();
                    case "4":
                        System.out.println("Erase");
                        mainMenu();
                    case "5":
                        System.out.println("Edit");
                        mainMenu();  
                    case "6":
                        System.out.println("Assign name");
                        mainMenu();   
                    case "7":
                        System.out.println("Send b'card");
                        mainMenu();
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
                                mainMenu();
                            case "2":
                                System.out.println("Memory status");
                                mainMenu();
                         
                       } 
                        mainMenu();
                    case "9":
                        System.out.println("Speed Dials");
                        mainMenu();
                    case "10":
                        System.out.println("Voice Tags");
                        mainMenu();
                }
                mainMenu();

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
                            mainMenu();
                        case "2":
                            System.out.println("Inbox");
                            mainMenu();
                        case "3":
                            System.out.println("Outbox");
                            mainMenu();
                        case "4":
                            System.out.println("Picture messages");
                            mainMenu();
                        case "5":
                            System.out.println("Templates");
                            mainMenu();
                        case "6":
                            System.out.println("Smileys");
                            mainMenu();

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
                                            mainMenu();
                                        case "2":
                                            System.out.println("Message sent as");
                                            mainMenu();
                                        case "3":
                                            System.out.println("Message validity");
                                            mainMenu();
                                    }
                                    mainMenu();

                                case "2":
                                    System.out.println("Common");
                                    String common = """
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                    """;
                                    System.out.println(common);
                                    mainMenu();
                            }
                            mainMenu();

                        case "8":
                            System.out.println("Info service");
                            mainMenu();
                        case "9":
                            System.out.println("Voice mailbox number");
                            mainMenu();
                        case "10":
                            System.out.println("Service command editor");
                            mainMenu();
                    }
                   

             case "3" :
                    System.out.println("Chat"); 
                    mainMenu();


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
                            mainMenu();
                        case "2":
                            System.out.println("Received calls options");
                            mainMenu();
                        case "3":
                            System.out.println("Dialed numbers options");
                            mainMenu();
                        case "4":
                            System.out.println("Erase call list");
                            mainMenu();
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
                                    mainMenu();
                                case "2":
                                    System.out.println("All calls duration");
                                    mainMenu();
                                case "3":
                                    System.out.println("Received calls duration");
                                    mainMenu();
                                case "4":
                                    System.out.println("Dialed calls duration");
                                    mainMenu();
                                case "5":
                                    System.out.println("Timers cleared");
                                    mainMenu();
                                default:
                                    System.out.println("Invalid input");
                            }
                            mainMenu();
        
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
                                    mainMenu();
                                case "2":
                                    System.out.println("All calls cost");
                                    mainMenu();
                                case "3":
                                    System.out.println("Counters cleared");
                                    mainMenu();
                            }
                            mainMenu();

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
                                    mainMenu();
                                case "2":
                                    System.out.println("Shows costs in");
                                    mainMenu();
                            }
                            mainMenu();

                       case "8":
                            System.out.println("Prepaid credit");
                            mainMenu();
                    }
                    mainMenu();


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
                          mainMenu();
                    case "2" :
                          System.out.print("Ringing volume");
                          mainMenu();
                    case "3" :
                          System.out.print("Incoming call");
                          mainMenu();
                    case "4" :
                          System.out.print("Composer"); 
                          mainMenu();
                    case "5" :
                          System.out.print("Messages alert tones");
                          mainMenu();
                    case "6" :
                          System.out.print("Keypad tones");
                          mainMenu();
                    case "7" :
                          System.out.print("Warning and game tone");
                         mainMenu();
                    case "8" :
                          System.out.print("Vibrating alert");
                          mainMenu();
                    case "9" :
                          System.out.print("Screen saver");
                          mainMenu();
                    }
                mainMenu();


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
                                         mainMenu();
                                    case "2" :
                                         System.out.print("Speed dialing");
                                         mainMenu();
                                    case "3" : 
                                         System.out.print("Call waiting options");
                                         mainMenu(); 
                                     case "4" : 
                                         System.out.print("Own number sending");
                                         mainMenu();                               
                                      case "5" : 
                                         System.out.print("Phone line in use");
                                         mainMenu();                               
                                       case "6" : 
                                         System.out.print("Automatic answer");
                                         mainMenu();
                                 }
                                 mainMenu();   
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
                                 mainMenu();
                            case "2" :
                                 System.out.print("Cell info dispaly");
                                 mainMenu();
                            case "3" : 
                                 System.out.print("Welcome note");
                                 mainMenu();
                             case "4" : 
                                 System.out.print("Network selection");
                                 mainMenu();                               
                              case "5" : 
                                 System.out.print("Lights");
                                 mainMenu();                               
                               case "6" : 
                                 System.out.print("Confirm SIM service actions");
                                }
                                 mainMenu();  
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
                                             mainMenu();
                                        case "2" :
                                             System.out.print("Call barring service");
                                             mainMenu();
                                        case "3" : 
                                             System.out.print("Fixed dialing");
                                             mainMenu(); 
                                        case "4" : 
                                             System.out.print("Closed user group");
                                             mainMenu();                               
                                        case "5" : 
                                             System.out.print("Phone security");
                                             mainMenu();                               
                                       case "6" : 
                                             System.out.print("Change access codes");
                                    }
                                               mainMenu();  
                               case "4" :
                                    System.out.print("Factory factory settings");
                        }


               case "7" :
                    System.out.println("Call divert");
                    mainMenu();

                case "8" :
                    System.out.println("Games");
                    mainMenu();

                case "9" :
                    System.out.println("Calculator");
                    mainMenu();

                case "10" :
                    System.out.println("Reminders");
                    mainMenu();
                            
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
                        case "1": 
                            System.out.println("Alarm clock"); 
                            mainMenu();
                        case "2": 
                            System.out.println("Clock settings"); 
                            mainMenu();
                        case "3": 
                            System.out.println("Date settings"); 
                            mainMenu();
                        case "4": 
                            System.out.println("Stopwatch"); 
                            mainMenu();
                        case "5": 
                            System.out.println("Countdown timer"); 
                            mainMenu();
                        case "6": 
                            System.out.println("Auto update");
                            mainMenu();
                    }
                    mainMenu();

            case "12": 
                    System.out.println("Profiles"); 
                    mainMenu();
            case "13": 
                    System.out.println("SIM services"); 
                    mainMenu();
        }
    }
}

                        






