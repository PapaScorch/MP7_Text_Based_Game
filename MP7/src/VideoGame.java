import java.util.Scanner; // Imports the keyboard reading function
public class VideoGame {
	
private static void pause(final int sec) { //pauses the game for a certain number of seconds
  	try {
 	 Thread.sleep(1000*sec);
	    } catch (InterruptedException ie) {
	   ie.printStackTrace();
	    }  
}

private static boolean comparison(final String requirement) {
	Scanner input = new Scanner(System.in);
	boolean equal = input.next().toUpperCase().equals(requirement);
	input.close();
	return equal;
}


  public static void main(String args[]){
    Scanner UI = new Scanner(System.in); // Scanner for user input
  
    // Introduction text
    System.out.println("You are a professional hacker-for-hire, currently waiting for your next job.");
    System.out.println("You head to your office, and as you take a sip of your coffee your computer notifies you of an email.");
    System.out.println("You sit down at your desk and open your email. Sign in by typing in your password.");
    System.out.print("Password: ");
  
    // Sign-in section
    boolean signedIn = false;
    while (!signedIn) {
    if (comparison("INCORRECT")) {
      signedIn = true;
    } else {
      System.out.println("Wrong password. Your password is incorrect.");
    }
  }
    System.out.println("");
    // Accept the job offer section
    System.out.println("You typed in your password. Looking through your emails, you find one from");
    System.out.println("a Mr. Iago Janus. It's your first client in a while. You read his email:");
    System.out.println("Hello, I am writing to you because I had heard of your amazing skills. I am in need of your services.");
    System.out.println("My lazy coworker, Rele Slow, is getting promoted in three days at our company Reol,");
    System.out.println("but I am the one who should rightfully have that position.");
    System.out.println("Our dumb manager Mr. Kaleel and him seem to get along so well that he is just giving it to him.");
    System.out.println("If you can hack into the system and give me the promotion instead of him, I will pay you handsomely.");
    System.out.println("I'll even throw in a little bonus if you can give me a raise. I want to take my family for a nice vacation.");
    
    pause(5);
    
    System.out.println("You lean back in your chair and consider the offer.");
    System.out.print("Do you accept? Yes or No: ");
    
    // Job offer section
    boolean accepted = false;
    while (!accepted) {
      if (comparison("YES")) { 
      accepted = true;
      System.out.println("");
      System.out.println("You accept the job offer and ask for more information regarding the job.");
      } else {
      System.out.println("");
      System.out.println("You decide not to take the offer, and wait for another.");
      
        // Sleep the text for 4 seconds
      pause(4);

        System.out.println("You return to your email after an hour of looking online for work. You don't");
        System.out.println("have any new emails, and decide to re-read Mr. Janus' email.");
        System.out.println("");
                           
        // Sleep the text for 10 seconds
        pause(10);
        
        System.out.println("Hello, I am writing to you because I had heard of your amazing skills. I am in need of your services.");
        System.out.println("My lazy coworker, Rele Slow, is getting promoted in three days at our company Reol,");
        System.out.println("but I am the one who should rightfully have that position.");
        System.out.println("Our dumb manager Mr. Kaleel and him seem to get along so well that he is just giving it to him.");
        System.out.println("If you can hack into the system and give me the promotion instead of him, I will pay you handsomely.");
        System.out.println("I'll even throw in a little bonus if you can give me a raise. I want to take my family for a nice vacation.");
        System.out.println("Do you accept? Yes or No: ");
   	  }
      }
// End the job offer section loop
    
       // Job accepted introduction
    
       System.out.println("");
       System.out.println("You send an email to Mr. Janus, accepting his job.");
    
    	        // Sleep the text for 5 seconds
       pause(7);
       System.out.println("Great, I am glad you are taking the offer. Here is what I can tell you:");
       System.out.println("Our manager keeps all his files and employee information within his personal account.");
       System.out.println("To get into his personal account, you'd probably need to be connected to the company server remotely.");
       System.out.println("I know we have a firewall up, so it might be tough to get through. Anyways, once you're in,");
       System.out.println("login to the manager's account and access the files for that worthless employee and switch");
       System.out.println("his promotion status to be on a wait list. After that, if you can, access my account and change my salary");
       System.out.println("just a little bit. Enough to make a difference but not too much to catch any attention.");
       System.out.println("The employee database works off of all employee's last names so it shouldn't be hard to navigate");
       System.out.println("once you're in. Anyways, good luck with everything. I know I can count on you.");
    
       
        // Sleep the text for 5 seconds
       pause(10);
   	    
      // Server access section
       System.out.println("");
      System.out.println("To start, you need to connect to the server as a remote access connect.");
      System.out.println("Type in remoteserveraccess to connect to the server.");
      
           boolean connected = false;
                while (!connected) {
                  if (UI.next().toUpperCase().equals("REMOTESERVERACCESS")) {
                          connected = true;
                  } else {
                    System.out.println("UNKNOWN COMMAND: TYPE IN A RECOGNIZABLE COMMAND:");
                  }
                }
	
    // Begin fire-wall section
    System.out.println("REMOTE ACCESS COMMAND: ENTER IP ADDRESS CONNECT:");
    System.out.println("");
      
        // Sleep the text for 3 seconds
    pause(3);
    
    System.out.println("You think to yourself, maybe the standard IP address will connect me to the network.");
    System.out.println("Type 192.168.0.1");
                       
    			boolean IPConnect = false;
                       while (!IPConnect) {
                    	 String attempt = UI.next().toUpperCase();
                         if (attempt.equals("192.168.0.1")) {
                           IPConnect = true;
                         } else {
                           System.out.println("IP ADDRESS " + attempt + " IS NOT RECOGNIZED. ENTER IP ADDRESS CONNECT:");
                         }
                       }
    
    // Begin the connect to the company name 
    System.out.println("IP ADDRESS CONNECT SUCCESSFUL. ENTER SERVER CONNECT NAME:");
    System.out.println("");
    System.out.println("What could the server name possibly be? Surely it can't be too difficult, maybe it is just the company name?");
    
    boolean serverConnect = false;
    while (!serverConnect) {
      String server = UI.next().toUpperCase();
      if (server.equals("REOL")) {
          serverConnect = true;
      } else {
            System.out.println("UNIDENTIFIED SERVER CONNECT NAME " + server + ". ENTER SERVER CONNECT NAME:");
            }
          }
    
    //Begin fire-wall mini-game
    System.out.println("ERROR. FIREWALL BREACH DETECTED. SECURITY PROTOCOL");
    System.out.println("MAXIMUMOVERDRIVE.EXE ENABLED. MANUAL OVERRIDE DISABLED.");
    System.out.println("TO ENABLE MANUAL OVERRIDE, TYPE ENABLEOVERRIDE:");
    System.out.println("");
    System.out.println("Really? They would tell you how to disable the firewall? This company REALLY needs better security...");
    
    boolean firewallOverride = false;
    while (!firewallOverride) {
      String override = UI.next().toUpperCase();
      if (override.equals("ENABLEOVERRIDE")) {
        firewallOverride = true;
      } else {
        System.out.println("COMMAND " + override + " DISABLED UNTIL MANUAL OVERRIDE IS ENABLED.");
      }
    }
    
    System.out.println("TO CONFIRM OVERRIDE CHANGE, ENTER NUMBER THAT MATCHES TEMPORARY KEY I.D. 13895:");
    System.out.println("");
    System.out.println("I don't have the temporary key to unlock it since I'm not an employee.");
    System.out.println("");
    System.out.println("I guess I have to do this the hard way. (Type disablesecurity to continue)");
    
    boolean security = false;
    while (!security) {
      String securitytyped = UI.next().toUpperCase();
      if (securitytyped.equals("DISABLESECURITY")) {
        security = true;
      } else {
        System.out.println("OVERRIDE METHOD " + securitytyped + " IS NOT RECOGNIZED. ENTER NUMBER THAT MATCHES TEMPORARY KEY I.D. 13895:");
      }
    }
    System.out.println("");
    System.out.println("ERROR. FIREWALL DISABLE DETECTED. SECURITY PROTOCOL WE_NEED_BETTER_SECURITY.EXE DEPLOYED.");
    System.out.println("");
    System.out.println("*Well at least somebody knew the security here was terrible*");
    System.out.println("");
    
    //begin minigame
    
    int attemptsLeft = 7;
    System.out.println("PLEASE ENTER THE CORRECT NUMBER BETWEEN 1-100 TO DISABLE THE FIREWALL. YOU HAVE: " + attemptsLeft + " ATTEMPTS REMAINING BEFORE FIREWALL RESET:");
    System.out.println("I guess I need to guess this in 7 tries? This seems impossible!!! (enter guess as a number)");
    pause(3);
    System.out.println("But wait, it seems like I can analyze its responses and figure out if I need to guess a larger or smaller number.");
    System.out.println("Looks like it's time to earn my paycheck.");
      
      boolean breach = false;
      int RNG = (int) (Math.random()*100) + 1;
    while (!breach) {
      if (attemptsLeft == 0) {
        RNG = (int) (Math.random()*100) + 1;
        attemptsLeft = 7;
      System.out.println("");
      System.out.println("ERROR: MAXIMUM ATTEMPTS REACHED. FIREWALL NUMBER RESET.");
      System.out.println("YOU HAVE: " + attemptsLeft + " ATTEMPTS REMAINING BEFORE FIREWALL RESET:");
      }
      int rngAttempt = UI.nextInt();
      if (rngAttempt == RNG) {
        breach = true;
      } else {
        if (rngAttempt < RNG) {
          attemptsLeft--;
          System.out.println("Hmm it looks like that number was too low. I need to guess a larger number.");
          System.out.println("YOU HAVE: " +attemptsLeft + " ATTEMPTS REMAINING BEFORE FIREWALL RESET:");
        } else {
          if (rngAttempt > RNG) {
            attemptsLeft--;
            System.out.println("Hmm it looks like that number was too high. I need to guess a smaller number.");
            System.out.println("YOU HAVE: " +attemptsLeft + " ATTEMPTS REMAINING BEFORE FIREWALL RESET:");
          
        }
        }
      }
    }
    
    //Begin the easy part!
    System.out.print("Firewall disabled. Connecting to server Reol");
    
    // Sleep the text for 1 second multiple times
    pause(1);
    System.out.print(".");
    
    pause(1);
    System.out.print(".");
    
    pause(1);
    System.out.print(".");
    
    pause(1);
    System.out.print(".");
        
    System.out.println("Connected to server Reol. Which master account would you like to access?");
    
    boolean managerAccount = false;
    while (!managerAccount) {
      String managerSearch = UI.next().toUpperCase();
      if (managerSearch.equals("KALEEL")) {
        managerAccount = true;
      } else {
        System.out.println("The employee Mr./Mrs./Ms. " + managerSearch + " does not exist in the database.");
        System.out.println("Please select a current master account holder.");
      }
    }
      
    System.out.println("Logged in to master account Kaleel, which employee file would you like to access?");
      
      boolean slowFired = false;
      boolean raiseGiven = false;
      int janusSalary = 79000;
      while (!slowFired || !raiseGiven) {
        String employeeSearch = UI.next().toUpperCase();
        if (employeeSearch.equals("SLOW") && !slowFired) {
          System.out.println("Employee Information:");
          System.out.println("Name: Rele Slow");
          System.out.println("Date of birth: January 23, 1977");
          System.out.println("Office location: Room 2327-B");
          System.out.println("Current salary (annual): 88200");
          System.out.println("Job comments: Scheduled for promotion");
          
          pause(2);
          System.out.println("I guess it's as easy as using a method to fire Slow then. (Type in editjobcomments)");
        
        
        while(!slowFired) {
          String command = UI.next().toUpperCase();
          if (command.equals("EDITJOBCOMMENTS")) {
            System.out.println("Now I can edit this to say that he's going to be fired");
            System.out.println("(Type 'Employment_Terminated')");
            if (comparison("EMPLOYMENT_TERMINATED")) {
              slowFired = true;
              pause(2);
            
          System.out.println("So he's officially fired... awesome!");
            } else {
              System.out.println("I'm on the job, I can't afford to play around");
            } 
          } else {
              System.out.println("COMMAND " + command + " NOT RECOGNIZED");
            }
          }
        }
            
       
        
        
        if (employeeSearch.equals("SLOW") && slowFired) {
          System.out.println("Employee Information:");
          System.out.println("Name: Rele Slow");
          System.out.println("Date of birth: January 23, 1977");
          System.out.println("Office location: EVICTED");
          System.out.println("Current salary (annual): 0");
          System.out.println("Job comments: EMPLOYMENT TERMINATED");
        }
        
        //instructions start and work here
        
        if (employeeSearch.equals("JANUS") && !raiseGiven) {
          System.out.println("Employee Information:");
          System.out.println("Name: Iago Janus");
          System.out.println("Date of birth: August 4, 1989");
          System.out.println("Office location: Room 1843-A");
          System.out.println("Current salary (annual): " + janusSalary);
          System.out.println("Job comments: Great worker, always meets deadlines. Runner-up for promotion.");
          
          pause(2);
          System.out.println("");
        System.out.println("I can probably use a method here to increase his pay. (Type in raise_janus to increase this employee's pay)");
        }
        
        //instructions end and work here
        
        
        if (employeeSearch.equals("RAISE_JANUS") && raiseGiven == false) {
            System.out.println("How much would you like to increase this employee's salary by?");
            int raise = UI.nextInt();
            janusSalary += raise;
            System.out.print("Updating database information");
       
            // Puts in a ... after some time, should work and not interrupt
    pause(1);
    System.out.print(".");   
    pause(1);
    System.out.print("."); 
    pause(1);
    System.out.print(".");
    pause(1);
    System.out.print(".");
        //end section of the ... part
          
          System.out.println("Employee Information:");
          System.out.println("Name: Iago Janus");
          System.out.println("Date of birth: August 4, 1989");
          System.out.println("Office location: Room 1843-A");
          System.out.println("Current salary (annual): " + janusSalary);
          System.out.println("Job comments: Great worker, always meets deadlines. Runner-up for promotion");
          raiseGiven = true;
            
          pause(2);
          System.out.println("");
            System.out.println("I guess that takes care of giving him a raise.");
          }
            
        //Janus given a raise ends the code
         
        //begins secured section of easter egg (working)
        if (employeeSearch.equals("PATEL")) {
          System.out.println("Employee Information:");
          System.out.println("Name: Max Patel");
          System.out.println("Date of birth: May 11, 1999");
          System.out.println("Office location: Room 467-B");
          System.out.println("Current salary (annual): 73,400");
          System.out.println("Job comments: Why did I even hire this kid?");
          
          pause(2);
          System.out.println("I do not need to be here, let's just finish this job.");
         }
        if (employeeSearch.equals("PEASE")) {
            System.out.println("Employee Information:");
            System.out.println("Name: Zachary Pease");
            System.out.println("Date of birth: September 13, 1996");
            System.out.println("Office location: Room 999-C");
            System.out.println("Current salary (annual): 74,300");
            System.out.println("Job comments: Nobody can find his office, so nobody knows if he really works here or not.");
            pause(2);
            System.out.println("I do not need to be here, let's just finish this job.");
        }
        
        //closes off section of easter egg (working)
        }
     //closes off the while loop here
      
      if (raiseGiven && slowFired) {
      System.out.println("");
      System.out.println("Thank you for playing the tutorial level and look out for future updates");
      
      
      
      System.out.println("in approximately: never. :(");
      
      }
      
           
           
// Do not add anything after these lines    
         UI.close();
        }
  }

