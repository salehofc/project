package demo;
import java.util.Scanner;
import java.util.ArrayList;
//Define an abstract class named Person
abstract class Person {
	// Define private fields for first name, last name, address, ID, and phone number
	private String fName;
	private String lName;
	private String address;
	private String iD;
	private String pNumber;
	
	// Define a constructor that takes in five parameters and initializes the private fields
	public Person(String fName, String lName, String address, String iD, String pNumber) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.iD = iD;
		this.pNumber = pNumber;
	}
	
	// Define public setter methods for each of the private fields
	public void setFirstName(String f) {
		fName = f;
	}
	
	public void setLastName(String l) {
		lName = l;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public void setID(String i) {
		iD = i;
	}
	
	public void setPhoneNumber(String p) {
		pNumber = p;
	}
	
	// Define public getter methods for each of the private fields
	public String getFirstName() {
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public String getID() {
		return iD;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getNumber() {
		return pNumber;
	}
}

//Define a class named Customer that extends the Person class
class Customer extends Person {
	// Define a constructor that takes in five parameters and calls the constructor of the Person class
	public Customer(String fName, String lName, String address, String iD, String number) {
		super(fName, lName, address, iD, number);
	}
}

//Define a class named Renter that extends the Customer class
class Renter extends Customer {
	// Define a constructor that takes in five parameters and calls the constructor of the Customer class
	public Renter(String fName, String lName, String address, String iD, String number) {
		super(fName, lName, address, iD, number);
	}
}

//Define a class named Lessor that extends the Customer class
class Lessor extends Customer {
	// Define a constructor that takes in five parameters and calls the constructor of the Customer class
	public Lessor(String fName, String lName, String address, String iD, String number) {
		super(fName, lName, address, iD, number);
	}
}

//Define a class named AgencyManager that extends the Person class
class AgencyManager extends Person {
	// Define a constructor that takes in five parameters and calls the constructor of the Person class
	public AgencyManager(String fName, String lName, String address, String iD, String number) {
		super(fName, lName, address, iD, number);
	}
}

//This is a class definition for a Car object
class Car {
	
	// These are properties of the Car object
	private String carType;
	private String carModel;
	private String carEngine;
	private int carPrice;
	private String personID;  
	
	// This is a constructor method that sets the values of the Car object's properties
	public Car(String cT, String cM ,String cE , int cP , String pID){
		carType   = cT;
		carModel  = cM;
		carEngine = cE;
		carPrice  = cP;
		personID = pID;
	}
	
	// These are methods that return the values of the Car object's properties
	public String getCarType() {
		return carType;
	}
	
	public String getCarModel() {
		return carModel;
	}
	
	public String getCarEngine() {
		return carEngine;
	}
	
	public int getCarPrice() {
		return carPrice;
	}
	
	public String getPersonID() {
		return personID;
	}
}
//This is a class definition for the Demo object
public class Demo {
	
	// These are ArrayLists that store objects of the Lessor, Renter, Car, and rented Car classes
	static ArrayList<Lessor> lessorList = new ArrayList<Lessor>();
	static ArrayList<Renter> renterList = new ArrayList<Renter>();
	static ArrayList<Car> carList = new ArrayList<Car>();
	static ArrayList<Car> rentedCarsList = new ArrayList<Car>();
	
	// This is a String variable
	static String b;
	
	// This is the main method of the Demo class
	public static void main ( String[] args ) {
		
		// This creates a Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// This creates an AgencyManager object with empty string parameters
		AgencyManager a = new AgencyManager("","","","","");
		
		// These are an integer variable that stores the user's choice
		int choice = 0;
		int c = 0;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c6 = 0;
		int c7 = 0;
		int c8 = 0;
		int c9 = 0;
		int c10 = 0;
		
		
		// This code is a while loop that will run as long as the value of 'choice' is not equal to 5.
		while(choice != 5) {
		    // This line prints the option for the user to select "I'm Manager".
		    System.out.println("1: I'm Manager");
		    // This line prints the option for the user to select "I'm Customer".
		    System.out.println("2: I'm Customer");
		    // This line prints the option for the user to select "List".
		    System.out.println("3: List");
		    // This line prints the option for the user to select "Search".
		    System.out.println("4: Search");
		    // This line prints the option for the user to select "Exit".
		    System.out.println("5: Exit");
		    
		    // This line prompts the user to enter a number between 1 and 5.
		    System.out.println("Please enter a number(1-5) :");
		    // This line waits for the user to input a number and assigns it to the variable 'choice'.
		    choice = input.nextInt();
		    
		    // This line checks the value of 'choice' using a switch statement to determine which case to execute.
		    switch(choice){
		        // If the value of 'choice' is 1, this case will execute.
		        case 1:
			    // This code is a while loop that will run as long as the value of 'c1' is not equal to 8.
			    while(c1 != 8) {
			        // This line prints the option for the user to select Individual Profile.
			        System.out.println("1: Individual Profile");
			        // This line prints the option for the user to Add a Lessor.
			        System.out.println("2: Add lessor");
			        // This line prints the option for the user to Add a Renter.
			        System.out.println("3: Add renter");
			        // This line prints the option for the user to Add a Car.
			        System.out.println("4: Add car");
			        // This line prints the option for the user to Delete a Lessor.
			        System.out.println("5: Delete losser");
			        // This line prints the option for the user to Delete a Renter.
			        System.out.println("6: Delete renter");
			        // This line prints the option for the user to Delete a Car.
			        System.out.println("7: Delete car");
			        // This line prints the option for the user to go back to the Main Menu.
			        System.out.println("8: Back to Main Menu\n");
			        
			        // This line waits for the user to input a number and assigns it to the variable 'c1'.
			        c1 = input.nextInt();
			        
			        // This line checks the value of 'c1' using a switch statement to determine which case to execute.
			        switch(c1) {
			            // If the value of 'c1' is 1, this case will execute.
			            case 1:
			                // This line prompts the user to input their first name and sets it to the 'a' object's first name.
			                System.out.println("Enter your FirstName:");
			                a.setFirstName(input.next());
			                // This line prompts the user to input their last name and sets it to the 'a' object's last name.
			                System.out.println("Enter your LastName:");
			                a.setLastName(input.next());
			                // This line prompts the user to input their address and sets it to the 'a' object's address.
			                System.out.println("Enter your Address:");
			                a.setAddress(input.next());
			                // This line prompts the user to input their ID and sets it to the 'a' object's ID.
			                System.out.println("Enter your ID:");
			                a.setID(input.next());
			                // This line prompts the user to input their phone number and sets it to the 'a' object's phone number.
			                System.out.println("Enter your Phone Number:");
			                a.setPhoneNumber(input.next());
			                // This 'break' statement will exit the switch statement and return to the while loop.
			                break;
			            // If the value of 'c1' is 2, this case will execute.
			            case 2:
			                // This line calls the 'addLessor' method and passes in the 'input' object as an argument.
			                addLessor(input);
			                // This 'break' statement will exit the switch statement and return to the while loop.
			                break;
			            // If the value of 'c1' is 3, this case will execute.
			            case 3:
			                // This line calls the 'addRenter' method and passes in the 'input' object as an argument.
			                addRenter(input);
			                // This 'break' statement will exit the switch statement and return to the while loop.
			                break;
			            // If the value of 'c1' is 4, this case will execute.
			            case 4:
			                // This line calls the 'addCar' method and passes in the 'input' object as an argument.
			                addCar(input);
			                // This 'break' statement will exit the switch statement and return to the while loop.
			                break;
			             // If the value of 'c1' is 5, this case will execute.
			            case 5:
			            // This line calls the 'deleteLessor' method and passes in the 'input' object as an argument.
			            deleteLessor(input);
			            // This 'break' statement will exit the switch statement and return to the while loop.
			            break;

			            // If the value of 'c1' is 6, this case will execute.
			            case 6:
			            // This line calls the 'deleteRenter' method and passes in the 'input' object as an argument.
			            deleteRenter(input);
			            // This 'break' statement will exit the switch statement and return to the while loop.
			            break;

			            // If the value of 'c1' is 7, this case will execute.
			            case 7:
			            // This line calls the 'deleteCar' method and passes in the 'input' object as an argument.
			            deleteCar(input);
			            // This 'break' statement will exit the switch statement and return to the while loop.
			            break;

			            // If the value of 'c1' is 8, this case will execute.
			            case 8:
			            // This 'break' statement will exit the switch statement and return to the while loop.
			            break;
			            
			            // If none of these cases match, this default case will execute.
			            default:
			                // This line will print an error message if an invalid number is entered.
			                System.out.println("Invalid number entered, please try again.");
			        }
			    }
			    break;
			    
			    
			 // This line checks if the value of 'c1' is 2, if it is, this case will execute.
		        case 2:
		        	// This while loop will run as long as the value of 'c2' is not equal to 3.
		        	while (c2 != 3) {
		        		// This line prints the options for the user to select their role as either a lessor or a renter.
		        		System.out.println("1: I'm lessor");
		        		System.out.println("2: I'm renter");
		        		System.out.println("3: Back to Main Menu\n");
		        		// This line waits for the user to input a number and assigns it to the variable 'c2'.
		        		c2 = input.nextInt();
		        		// This line checks the value of 'c2' using a switch statement to determine which case to execute.
		        		switch (c2) {
		        			// If the value of 'c2' is 1, this case will execute.
		        			case 1:
		        				// This while loop will run as long as the value of 'c3' is not equal to 3.
		        				while (c3 != 3) {
		        					// This line prints the options for the user to either sign up, log in, or go back.
		        					System.out.println("1. Sign up");
		        					System.out.println("2. Login");
		        					System.out.println("3. Back");
		        					// This line waits for the user to input a number and assigns it to the variable 'c3'.
		        					c3 = input.nextInt();
		        					// This line checks the value of 'c3' using a switch statement to determine which case to execute.
		        					switch (c3) {
		        						// If the value of 'c3' is 1, this case will execute.
		        						case 1:
		        							// This line calls the 'addLessor' method and passes in the 'input' object as an argument.
		        							addLessor(input);
		        							break;
		        						// If the value of 'c3' is 2, this case will execute.
		        						case 2:
		        							// This while loop will run as long as the value of 'c6' is not equal to 1.
		        							while (c6 != 1) {
		        								// This line prompts the user to enter their ID or enter 0 to go back.
		        								System.out.println("Enter your ID or enter (0) to back");
		        								// This line waits for the user to input a string and assigns it to the variable 'b'.
		        								b = input.next();
		        								// If the value of 'b' converted to an integer is equal to 0, this code block will execute.
		        								if (Integer.valueOf(b) == 0) {
		        									c7 = 2;
		        									break;
		        								}
		        								// This line calls the 'findLessorById' method and passes in the 'b' variable as an argument and assigns the result to the 'c6' variable.
		        								c6 = findLessorById(b);
		        							}
		        							c6 = 0;
		        							// This while loop will run as long as the value of 'c7' is not equal to 2.
		        							while (c7 != 2) {
		        								// This line calls the 'showOwnerCar' method to display the cars owned by the lessor.
		        								showOwnerCar();
		        								System.out.println("1: Add car");
		        								System.out.println("2: Back\n");
		        								// This line waits for the user to input a number and assigns it to the variable 'c7'.
		        								c7 = input.nextInt();
		        								// This line checks the value of 'c7' using a switch statement to determine which case to execute.
		        								switch (c7) {
		        									// If the value of 'c7' is 1, this case will execute.
		        									case 1:
		        										// This line calls the 'addCar' method and passes in the 'input' object as an argument.
		        										addCar(input);
		        										break;
		        									// If the value of 'c7' is 2, this case will execute.
		        									case 2:
		        										break;
		        									// If the value of 'c7' does not match any of the cases, this default case will execute.
		        									default:
		        										System.out.println("Invalid Number.");
		        										break;
		        								}
		        							}
		        							c7 = 0;
		        							break;
		        						// If the value of 'c3' is 3, this case will execute.
		        						case 3:
		        							break;
		        						// If the value of 'c3' does not match any of the cases, this default case will execute.
		        						default:
		        							System.out.println("Invalid Number.");
		        							break;
		        					}
		        				}
		        				c3 = 0;
		        				break;
		        			// If the value of'c2' is 2, this case will execute.
		        			case 2:
		        				// This while loop will run as long as the value of 'c4' is not equal to 3.
		        				while (c4 != 3) {
		        					// This line prints the options for the user to either sign up, log in, or go back.
		        					System.out.println("1. Sign up");
		        					System.out.println("2. Login");
		        					System.out.println("3. Back");
		        					// This line waits for the user to input a number and assigns it to the variable 'c4'.
		        					c4 = input.nextInt();
		        					// This line checks the value of 'c4' using a switch statement to determine which case to execute.
		        					switch (c4) {
		        						// If the value of 'c4' is 1, this case will execute.
		        						case 1:
		        							// This line calls the 'addRenter' method and passes in the 'input' object as an argument.
		        							addRenter(input);
		        							break;
		        						// If the value of 'c4' is 2, this case will execute.
		        						case 2:
		        							// This while loop will run as long as the value of 'c8' is not equal to 1.
		        							while (c8 != 1) {
		        								// This line prompts the user to enter their ID or enter 0 to go back.
		        								System.out.println("Enter your ID or enter (0) to back");
		        								// This line waits for the user to input a string and assigns it to the variable 'b'.
		        								b = input.next();
		        								// If the value of 'b' converted to an integer is equal to 0, this code block will execute.
		        								if (Integer.valueOf(b) == 0) {
		        									c9 = 2;
		        									break;
		        								}
		        								// This line calls the 'findRenterById' method and passes in the 'b' variable as an argument and assigns the result to the 'c8' variable.
		        								c8 = findRenterById(b);
		        							}
		        							c8 = 0;
		        							// This while loop will run as long as the value of 'c9' is not equal to 2.
		        							while (c9 != 2) {
		        								// This line prints the options for the user.
		        								System.out.println("1: Rent a car");
		        								System.out.println("2: Back\n");
		        								// This line waits for the user to input a number and assigns it to the variable 'c9'.
		        								c9 = input.nextInt();
		        								// This line checks the value of 'c9' using a switch statement to determine which case to execute.
		        								switch (c9) {
		        									// If the value of 'c9' is 1, this case will execute.
		        									case 1:
		        										// This line calls the 'rentCar' method and passes in the 'input' object as an argument.
		        										rentCar(input);
		        										break;
		        									// If the value of 'c9' is 2, this case will execute.
		        									case 2:
		        										break;
		        									// If the value of 'c9' does not match any of the cases, this default case will execute.
		        									default:
		        										System.out.println("Invalid Number.");
		        										break;
		        								}
		        							}
		        							c9 = 0;
		        							break;
		        						// If the value of 'c4' is 3, this case will execute.
		        						case 3:
		        							break;
		        						// If the value of 'c4' does not match any of the cases, this default case will execute.
		        						default:
		        							System.out.println("Invalid Number.");
		        							break;
		        					}
		        				}
		        				c4 = 0;
		        				break;
		        			// If the value of 'c2' is 3, this case will execute.
		        			case 3:
		        				break;
		        			// If the value of 'c2' does not match any of the cases, this default case will execute.
		        			default:
		        				System.out.println("Invalid Number.");
		        				break;
		        		}
		        	}
		        	c2 = 0;
		        	break;
				
				
				
				
				
				
				
				
		        case 3:
		            // This while loop will run as long as the value of 'c' is not equal to 5.
		            while (c != 5) {
		                // This line prints the options for the user to either view available cars, rented cars, lessor list, renter list, or go back.
		                System.out.println("Please select an option:");
		                System.out.println("1. Available Cars");
		                System.out.println("2. Rented Cars");
		                System.out.println("3. Lessor list");
		                System.out.println("4. Renter list");
		                System.out.println("5. Back");
		                // This line waits for the user to input a number and assigns it to the variable 'c'.
		                c = input.nextInt();
		                // This line checks the value of 'c' using a switch statement to determine which case to execute.
		                switch (c) {
		                    // If the value of 'c' is 1, this case will execute.
		                    case 1:
		                        // This for loop iterates through the 'carList' and prints out each car's details.
		                        int i = 1;
		                        for (Car car : carList) {
		                            System.out.println(i + ". Car Type -> " + car.getCarType() + " Car Model -> " + car.getCarModel() + " Car price -> " + car.getCarPrice() + " Owner ID: " + car.getPersonID());
		                            i++;
		                        }
		                        i = 1;
		                        break;
		                    // If the value of 'c' is 2, this case will execute.
		                    case 2:
		                        // This for loop iterates through the 'rentedCarsList' and prints out each rented car's details.
		                        i = 0;
		                        for (Car car : rentedCarsList) {
		                            System.out.println(i + ". Car Type -> " + car.getCarType() + " Car Model -> " + car.getCarModel() + " Car price -> " + car.getCarPrice() + " Owner ID: " + car.getPersonID());
		                            i++;
		                        }
		                        i = 1;
		                        break;
		                    // If the value of 'c' is 3, this case will execute.
		                    case 3:
		                        // This for loop iterates through the 'lessorList' and prints out each lessor's details.
		                        i = 1;
		                        for (Person person : lessorList) {
		                            System.out.println(i + ". -> Name: " + person.getFirstName()+" " + person.getLastName() + "  Address: " + person.getAddress() + "National ID: " + person.getID() + "Phone number: " + person.getNumber() + "\n");
		                            i++;
		                        }
		                        break;
		                    // If the value of 'c' is 4, this case will execute.
		                    case 4:
		                        // This for loop iterates through the 'renterList' and prints out each renter's details.
		                        i = 1;
		                        for (Person person : renterList) {
		                            System.out.println(i + ". -> Name: " + person.getFirstName()+" " + person.getLastName() + "  Address: " + person.getAddress() + "National ID: " + person.getID() + "Phone number: " + person.getNumber() + "\n");
		                            i++;
		                        }
		                        break;
		                    // If the value of 'c' is 5, this case will execute and the while loop will end.
		                    case 5:
		                        break;
		                    // If the value of 'c' is not between 1 and 5, this default case will execute.
		                    default:
		                        System.out.println("Invalid option selected. Please try again.");
		                        break;
		                }
		            }
		            break;
				case 4 :
					
					
					
					
					
					
					
					// This while loop will continue to run until the user enters 3
					while (c9 != 3) {
					    // Displays the options for the user to select
					    System.out.println("Please select an option:");
					    System.out.println("1. Search car");
					    System.out.println("2. Search renter");
					    System.out.println("3. Back");

					    // Accepts input from the user
					    c9 = input.nextInt();

					    // Executes the code block based on the user's choice
					    switch (c9) {
					        case 1:
					            // This while loop will continue to run until the user enters 5
					            while (c8 != 5) {
					                // Displays the options for the user to select
					                System.out.println("1. Search car price");
					                System.out.println("2. Search car by model");
					                System.out.println("3. Search car by type");
					                System.out.println("4. Search car by engine");
					                System.out.println("5. Exit");
					                System.out.print("Enter your choice: ");

					                // Accepts input from the user
					                choice = input.nextInt();

					                // Executes the code block based on the user's choice
					                switch(choice) {
					                    case 1:
					                        // Accepts input from the user and displays cars with price under the input value
					                        System.out.print("Enter price to show cars underprice: ");
					                        int query = input.nextInt();
					                        for (Car car : carList) {
					                            if (car.getCarPrice()< query) {
					                                System.out.println("Car found:  Car Type ->" + car.getCarType() + "   Car Model ->" + car.getCarModel() + "      Car price ->"+car.getCarPrice() +"    Owner ID: " + car.getPersonID());
					                            }
					                        }
					                        break;
					                    case 2:
					                        // Accepts input from the user and displays cars with model year greater than or equal to the input value
					                        System.out.print("Enter model(production year) to show cars highr model: ");
					                        query = input.nextInt();
					                        for (Car car : carList) {
					                            if (Integer.valueOf(car.getCarModel()) >= query) {
					                                System.out.println("Car found:  Car Type ->" + car.getCarType() + "   Car Model ->" + car.getCarModel() + "      Car price ->"+car.getCarPrice() +"    Owner ID: " + car.getPersonID());
					                            }
					                        }
					                        break;
					                    case 3:
					                        // Accepts input from the user and displays cars with the same type as the input value
					                        System.out.print("Enter type(Sedan , SUV , CUV): ");
					                        String type = input.next();
					                        for (Car car : carList) {
					                            if (car.getCarModel().equals(type)) {
					                                System.out.println("Car found:  Car Type ->" + car.getCarType() + "   Car Model ->" + car.getCarModel() + "      Car price ->"+car.getCarPrice() +"    Owner ID: " + car.getPersonID());
					                            }
					                        }
					                        break;
					                    case 4:
					                        // Accepts input from the user and displays cars with engine capacity greater than or equal to the input value
					                        System.out.print("Enter car engine(by cc) to show cars with bigger engine: ");
					                        query = input.nextInt();
					                        for (Car car : carList) {
					                            if (Integer.valueOf(car.getCarEngine()) >= query) {
					                                System.out.println("Car found:  Car Type ->" + car.getCarType() + "   Car Model ->" + car.getCarModel() + "      Car price ->"+car.getCarPrice() +"    Owner ID: " + car.getPersonID());
					                            }
					                        }
					                        break;
					                    case 5:
					                        break;
					                    default:
					                        // Displays a message if an invalid number is entered
					                        System.out.println("Invalid number");
					                        break;
					                }
					            }
					            c8 = 0 ;
					            break;
					         // This is a switch statement with case 2
					        case 2:
					            // This is a while loop that runs until c10 equals 5
					            while (c10 != 5) {
					                // This prints out a message asking the user to select an option
					                System.out.println("Please select an option:");
					                // This prints out a message for option 1
					                System.out.println("1. Search renter by first name");
					                // This prints out a message for option 2
					                System.out.println("2. Search renter by last name");
					                // This prints out a message for option 3
					                System.out.println("3. Search renter by ID");
					                // This prints out a message for option 4
					                System.out.println("4. Search renter by phone number");
					                // This prints out a message for option 5
					                System.out.println("5. Search renter by Address");
					                // This prints out a message for option 6
					                System.out.println("6. Back");
					                // This takes user input and assigns it to c10
					                c10 = input.nextInt();
					                // This is a switch statement with multiple cases
					                switch (c10) {
					                    case 1:
					                        // This prints out a message asking the user to enter the renter's first name
					                        System.out.print("Enter renter's first name: ");
					                        // This takes user input and assigns it to query
					                        String query = input.next();
					                        // This loops through the renterList and checks if the renter's first name matches the query
					                        for (Renter renter : renterList) {
					                            if (renter.getFirstName().equals(query)) {
					                                // This prints out the renter's information if there is a match
					                                System.out.println("Renter found: Renter Name ->" + renter.getFirstName() + "  " + renter.getLastName() + "      ID ->"+renter.getID() +"    Phone Number: " + renter.getNumber()+ "     Address: "+ renter.getAddress());
					                            }
					                        }
					                        break;
					                    case 2:
					                        // This prints out a message asking the user to enter the renter's last name
					                        System.out.print("Enter renter's last name: ");
					                        // This takes user input and assigns it to query
					                        query = input.next();
					                        // This loops through the renterList and checks if the renter's last name matches the query
					                        for (Renter renter : renterList) {
					                            if (renter.getLastName().equals(query)) {
					                                // This prints out the renter's information if there is a match
					                                System.out.println("Renter found: Renter Name ->" + renter.getFirstName() + "  " + renter.getLastName() + "      ID ->"+renter.getID() +"    Phone Number: " + renter.getNumber()+ "     Address: "+ renter.getAddress());
					                            }
					                        }
					                        break;
					                    case 3:
					                        // This prints out a message asking the user to enter the renter's ID
					                        System.out.print("Enter renter's ID: ");
					                        // This takes user input and assigns it to query
					                        query = input.next();
					                        // This loops through the renterList and checks if the renter's ID matches the query
					                        for (Renter renter : renterList) {
					                            if (renter.getID().equals(query)) {
					                                // This prints out the renter's information if there is a match
					                                System.out.println("Renter found: Renter Name ->" + renter.getFirstName() + "  " + renter.getLastName() + "      ID ->"+renter.getID() +"    Phone Number: " + renter.getNumber()+ "     Address: "+ renter.getAddress());
					                            }
					                        }
					                        break;
					                    case 4:
					                        // This prints out a message asking the user to enter the renter's phone number
					                        System.out.print("Enter renter's phone number: ");
					                        // This takes user input and assigns it to query
					                        query = input.next();
					                        // This loops through the renterList and checks if the renter's phone number matches the query
					                        for (Renter renter : renterList) {
					                            if (renter.getNumber().equals(query)) {
					                                // This prints out the renter's information if there is a match
					                                System.out.println("Renter found: Renter Name ->" + renter.getFirstName() + "  " + renter.getLastName() + "      ID ->"+renter.getID() +"    Phone Number: " + renter.getNumber()+ "     Address: "+ renter.getAddress());
					                            }
					                        }
					                        break;
					                    case 5:
					                        // This prints out a message asking the user to enter the renter's address
					                        System.out.print("Enter renter's address: ");
					                        // This takes user input and assigns it to query
					                        query = input.next();
					                        // This loops through the renterList and checks if the renter's address matches the query
					                        for (Renter renter : renterList) {
					                            if (renter.getAddress().equals(query)) {
					                                // This prints out the renter's information if there is a match
					                                System.out.println("Renter found: Renter Name ->" + renter.getFirstName() + "  " + renter.getLastName() + "      ID ->"+renter.getID() +"    Phone Number: " + renter.getNumber()+ "     Address: "+ renter.getAddress());
					                            }
					                        }
					                        break;
					                    case 6:
					                        // This breaks out of the switch statement if option 6 is selected
					                        break;
					                     // This is the default case
					                    default:
					                        // This prints out an error message
					                        System.out.println("Invalid option selected.");
					                        // This breaks out of the switch statement
					                        break;
					                }
					            }
					                // This sets c10 back to 0
					                c10 = 0;
					                case 3:
					                    // This prints out a message telling the user they selected "Back"
					                    System.out.println("You selected 'Back'");
					                    // This breaks out of the switch statement
					                    break;
					                // This is the default case
					                default:
					                    // This prints out an error message
					                    System.out.println("Invalid option selected!");
					                    // This breaks out of the switch statement
					                    break;
					                }
			        }
				
				
					// This breaks out of the switch statement
			        break;
			        
				case 5 :
					// This breaks out of the switch statement
					break;
				default:
					// This prints out an error message
					System.out.println("Invalid number!");
					// This breaks out of the switch statement
					break;
			}

		}
		choice = 0;
	}
	// This is a static method that adds a Lessor object to the lessorList ArrayList
	static void addLessor(Scanner input) {
	    System.out.println("Enter Lessor's first name: ");
	    // This prompts the user to input the Lessor's first name
	    String lessorFirstName = input.next();
	    System.out.println("Enter Lessor's last name: ");
	    // This prompts the user to input the Lessor's last name
	    String lessorLastName = input.next();
	    System.out.println("Enter Lessor's address: ");
	    // This prompts the user to input the Lessor's address
	    String lessorAddress = input.next();
	    System.out.println("Enter Lessor's national ID: ");
	    // This prompts the user to input the Lessor's national ID
	    String lessorID = input.next();
	    System.out.println("Enter Lessor's phone number: ");
	    // This prompts the user to input the Lessor's phone number
	    String lessorPhoneNumber = input.next();
	    // This creates a new Lessor object with the user's input and adds it to the lessorList ArrayList
	    Lessor lessor = new Lessor(lessorFirstName, lessorLastName, lessorAddress, lessorID, lessorPhoneNumber);
	    lessorList.add(lessor);
	}

	// This is a static method that adds a Renter object to the renterList ArrayList
	static void addRenter(Scanner input) {
	    System.out.println("\nAdd Renter");
	    System.out.println("Enter Renter's first name: ");
	    // This prompts the user to input the Renter's first name
	    String renterFirstName = input.next();
	    System.out.println("Enter Renter's last name: ");
	    // This prompts the user to input the Renter's last name
	    String renterLastName = input.next();
	    System.out.println("Enter Renter's address: ");
	    // This prompts the user to input the Renter's address
	    String renterAddress = input.next();
	    System.out.println("Enter Renter's national ID: ");
	    // This prompts the user to input the Renter's national ID
	    String renterID = input.next();
	    System.out.println("Enter Renter's phone number: ");
	    // This prompts the user to input the Renter's phone number
	    String renterPhoneNumber = input.next();
	    // This creates a new Renter object with the user's input and adds it to the renterList ArrayList
	    Renter renter = new Renter(renterFirstName, renterLastName, renterAddress, renterID, renterPhoneNumber);
	    renterList.add(renter);
	}
	
	// This is a static method that finds a Renter object in the renterList ArrayList by ID
	static int findRenterById(String i) {
	    // This iterates through each Renter object in the renterList ArrayList
	    for (Renter renter : renterList) {
	        // This checks if the Renter object's ID matches the input ID
	        if (renter.getID().equals(i)) {
	            return 1 ;
	        }
	    }
	    // This prints an error message if the input ID is not found in the renterList ArrayList
	    System.out.println("ID Not Found");
	    return 0;
	}

	// This is a static method that finds a Lessor object in the lessorList ArrayList by ID
	static int findLessorById(String i) {
	    // This iterates through each Lessor object in the lessorList ArrayList
	    for (Lessor lessor : lessorList) {
	        // This checks if the Lessor object's ID matches the input ID
	        if (lessor.getID().equals(i)) {
	            return 1 ;
	        }
	    }
	    // This prints an error message if the input ID is not found in the lessorList ArrayList
	    System.out.println("ID Not Found");
	    return 0;
	}

	// This is a static method that adds a Car object to the carList ArrayList
	static void addCar(Scanner input) {
	    System.out.println("Enter Car Type (Sedan,SUV,CUV): ");
	    // This prompts the user to input the car type
	    String carType = input.next();
	    System.out.println("Enter Car Model (production year): ");
	    // This prompts the user to input the car model
	    String carModel = input.next();
	    System.out.println("Enter Car Engine (by cc): ");
	    // This prompts the user to input the car engine displacement
	    String carEngine = input.next();
	    System.out.println("Enter Car Price (by USD): ");
	    // This prompts the user to input the car price
	    int carPrice = input.nextInt();
	    System.out.println("Enter Owner ID: ");
	    // This prompts the user to input the owner's ID
	    String personID = input.next();
	    // This creates a new Car object with the user's input and adds it to the carList ArrayList
	    Car car = new Car(carType,carModel ,carEngine ,carPrice , personID);
	    carList.add(car);
	    System.out.println("\nCar added successfully!");
	}
	// This is a static method that deletes a Lessor object from the lessorList ArrayList
	static void deleteLessor(Scanner input) {
	    System.out.println("\nDelete Lessor");
	    // This checks if the lessorList ArrayList is empty
	    if (lessorList.isEmpty()) {
	        System.out.println("\nNo Lessor found.");
	        return;
	    }
	    // This iterates through each Lessor object in the lessorList ArrayList and prints their details
	    for (int i = 0; i < lessorList.size(); i++) {
	        Lessor lessor = lessorList.get(i);
	        System.out.printf("%d. %s %s %s \n",(i + 1) , lessor.getFirstName() , lessor.getLastName() , "(Lessor ID :" + lessor.getID() + ")" );
	    }
	    // This prompts the user to input the number of the Lessor object they want to delete
	    System.out.print("\nEnter the number of the lessor to delete: ");
	    int index = input.nextInt() - 1;

	    // This checks if the input number is valid
	    if (index < 0 || index >= lessorList.size()) {
	        System.out.println("\nInvalid Lessor number.");
	        return;
	    }

	    // This removes the selected Lessor object from the lessorList ArrayList
	    lessorList.remove(index);
	}

	// This is a static method that deletes a Renter object from the renterList ArrayList
	static void deleteRenter(Scanner input) {
	    System.out.println("\nDelete Renter");
	    // This checks if the renterList ArrayList is empty
	    if (renterList.isEmpty()) {
	        System.out.println("\nNo renter found.");
	        return;
	    }
	    // This iterates through each Renter object in the renterList ArrayList and prints their details
	    for (int i = 0; i < renterList.size(); i++) {
	        Renter renter = renterList.get(i);
	        System.out.printf("%d. %s %s %s \n",(i + 1) , renter.getFirstName() , renter.getLastName() , "(Renter ID :" + renter.getID() + ")" );
	    }
	    // This prompts the user to input the number of the Renter object they want to delete
	    System.out.print("\nEnter the number of the renter to delete: ");
	    int index = input.nextInt() - 1;

	    // This checks if the input number is valid
	    if (index < 0 || index >= renterList.size()) {
	        System.out.println("\nInvalid Renter number.");
	        return;
	    }

	    // This removes the selected Renter object from the renterList ArrayList
	    renterList.remove(index);
	}

	// This is a static method that deletes a Car object from the carList ArrayList
	static void deleteCar(Scanner input) {
	    System.out.println("\nDelete Car");
	    // This checks if the carList ArrayList is empty
	    if (carList.isEmpty()) {
	        System.out.println("\nNo cars found.");
	        return;
	    }

	    // This iterates through each Car object in the carList ArrayList and prints their details
	    for (int i = 0; i < carList.size(); i++) {
	        Car car = carList.get(i);
	        System.out.printf("%d. %s %s %s %s\n",(i + 1) ,car.getCarType(), car.getCarModel(), "("+car.getCarEngine()+"cc )","(Owner ID :"+car.getPersonID()+")" );
	    }

	    // This prompts the user to input the number of the Car object they want to delete
	    System.out.print("\nEnter the number of the car to delete: ");
	    int index = input.nextInt() - 1;

	    // This checks if the input number is valid
	    if (index < 0 || index >= carList.size()) {
	        System.out.println("\nInvalid car number.");
	        return;
	    }

	    // This removes the selected Car object from the carList ArrayList
	    carList.remove(index);

	    System.out.println("\nCar deleted successfully!");
	}

	// This is a static method that shows all Car objects owned by a specific person
	static void showOwnerCar() {
	    int i = 0;
	    System.out.println("Your Cars List:\n");
	    // This iterates through each Car object in the carList ArrayList and prints their details if they are owned by a specific person
	    for(Car car : carList) {
	        String q = car.getPersonID();
	        if(b.equals(q)){
	            System.out.printf("%d-> %s %s %s %s\n",(i + 1) ,car.getCarType(), car.getCarModel(), "("+car.getCarEngine()+"cc )","(Owner ID :"+car.getPersonID()+")\n" );
	            i++;
	        }
	    }
	}
	static void rentCar(Scanner input) {
	    // create an empty ArrayList to store cars that match the query
	    ArrayList<Car> carsToDisplay = new ArrayList<>();
	    // read the query price from the user
	    int query = input.nextInt();
	    // initialize a counter variable for the number of cars displayed
	    int i = 1;
	    // iterate over each car in the carList collection
	    for (Car car : carList) {
	        // if the car price is less than or equal to the query price
	        if (car.getCarPrice()<= query) {
	            // print out information about the car that matches the query
	            System.out.println(i + ": " + car.getCarType() + " ( Model: "+ car.getCarModel()+ ")("+car.getCarEngine()+"cc )"+"(Owner ID :"+car.getPersonID()+")\n");  
	            // increment the counter variable
	            i++;
	            // add the current car to the carsToDisplay list
	            carsToDisplay.add(car);
	        }
	    }
	    // prompt the user to select a car to rent
	    System.out.println("Select car to rent:");
	    // read the user's choice from the input
	    int choice = input.nextInt();
	    // get the selected car from the carsToDisplay list
	    Car selectedCar = carsToDisplay.get(choice-1);
	    // add the selected car to the rentedCarsList and remove it from the carList
	    rentedCarsList.add(selectedCar);
	    carList.remove(selectedCar);
	}
}