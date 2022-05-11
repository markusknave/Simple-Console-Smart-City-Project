package FinalProject;

import java.util.Scanner;

public class studentMenu {
	
	//Function called if Indichoose = Student
	public static void choiceS() {
	
	//To ignore unnecessary warnings
	@SuppressWarnings("resource")
	
	Scanner input1 = new Scanner(System.in);
	
	//Choice attributes
	String option="", option1="yes"; String option2="no";

	while(true) {
		System.out.println("\n\t Choose your School");
		System.out.println("\n 1) Leyte Normal University \n 2) University of The Phillipines Visayas Tacloban College "
				+ "\n 3.) Eastern Visayas State UNiversity \n 4.)Asian Develpment Foundation College \n 5.) ACLC College Tacloban \n 6.) Log Out\n");
	
		int choice3=input1.nextInt();
		if(choice3==1) {
			System.out.println("\nDo you wish to enroll in this Course? Yes or No");
			option=input1.next().toLowerCase();
			if(option.equals(option1)){
				System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in:Paterno St, Downtown, Tacloban City\n\t Website: https://tac.upv.edu.ph\\n\\t Contact# (+63) 289818500");
			}
			else if(option.equals(option2)) {
				System.out.println();
				
			}
			else {
				System.out.print("\nInput Error");
			}
	}
		else if (choice3==2) {
			System.out.println("\nDo you wish to enroll in this Course? Yes or No");
			option=input1.next().toLowerCase();
			if(option.equals(option2)){
				System.out.println("\t\t\tHere Are Some Contact Information about this School\n\t Located in: Paterno St, Downtown, Tacloban City\n\tContact#: (+63) 53832-3205 \n \nWebsite: https://www.lnu.edu.ph\n\t www.facebook.com/lnu.official");
			
			}
			else if(option.equals(option2)) {
				System.out.println();	
				
			}
			else {
				System.out.print("\nInput Error");
			}
		}
		else if (choice3==3) {
			System.out.println("\nDo you wish to enroll in this Course? Yes or No");
			option=input1.next().toLowerCase();
			if(option.equals(option1)){
				System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: Paterno St, Downtown, Tacloban City\n\t Contact#: (+63) 53832-3205 \n\t Website: https://www.lnu.edu.ph\n\t www.facebook.com/lnu.official");
			
			}
			else if(option.equals(option2)) {
				System.out.println();	
				
			}
			else {
				System.out.print("\nInput Error");
	}
			}
		else if (choice3==4) {
			System.out.println("\nDo you wish to enroll in this Course? Yes or No");
			option=input1.next().toLowerCase();
			if(option.equals(option1)){
				System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: Paterno St, Downtown, Tacloban City\n\t Contact#: (+63) 53832-3205 \n\t Website: https://www.lnu.edu.ph\n\t www.facebook.com/lnu.official");
				
			}
			else if(option.equals(option2)) {
				System.out.println();	
				
			}
			else {
				System.out.print("\nInput Error");
	} 
			}
		else if (choice3==5) {
			System.out.println("\nDo you wish to enroll in this Course? Yes or No");
			option=input1.next().toLowerCase();
			if(option.equals(option1)){
				System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: Paterno St, Downtown, Tacloban City\n\tContact#: (+63) 53832-3205 \n\t Website: https://www.lnu.edu.ph\n\t www.facebook.com/lnu.official");
				
			}
			else if(option.equals(option2)) {
				System.out.println();	
				
			}
			else {
				System.out.print("\nInput Error");
	}}
		else if (choice3==6) {
			System.out.println("\nDo you wish to enroll in this Course? Yes or No");
			option=input1.next().toLowerCase();
			if(option.equals(option1)){
				System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: Paterno St, Downtown, Tacloban City\n\tContact#: (+63) 53832-3205 \n\t Website: https://www.lnu.edu.ph\n\t www.facebook.com/lnu.official");
			
			}
			else if(option.equals(option2)) {
				System.out.println();	
				
			}
			else {
				System.out.print("\nInput Error");
				
	}}
		else if (choice3==7) {
			System.out.println("\nDo you wish to enroll in this Course? Yes or No");
			option=input1.next().toLowerCase();
			if(option.equals(option1)){
				System.out.println("\nHere Are Some Contact Information about this School\n\t Contact#: (+63) 53832-3205 \n\t Website: https://www.lnu.edu.ph\n\t www.facebook.com/lnu.official");
								}
			else if(option.equals(option2)) {
				System.out.println();	
				
			}
			else {
				System.out.print("\nInput Error");
	}}
		else if (choice3==8) {
			System.out.println("\nDo you wish to enroll in this Course? Yes or No");
			option=input1.next().toLowerCase();
			if(option.equals(option1)){
				System.out.println("\nHere Are Some Contact Information about this School\n\tLocated in: Paterno St, Downtown, Tacloban City\n\t Contact#: (+63) 53832-3205 \n\t Website: https://www.lnu.edu.ph\n\t www.facebook.com/lnu.official");
			
			}
			else if(option.equals(option2)) {
				System.out.println();	
				
			}
			else {
				System.out.print("\nInput Error");
	}}}
		if (choice2==2) {
			System.out.println("Choose your Course");
			System.out.println("1.)University of the Phillipines Visayas Tacloban City "+""+"\nTuition: Bachelors 8.000,-12.000"+""+"\n Available Courses: BS in Computer Science");
			System.out.println("2.)University of the Phillipines Visayas Tacloban City "+""+"\nTuition: Bachelors 8.000,-12.000"+""+"\n Available Courses: BS in Biology");
			System.out.println("3.)University of the Phillipines Visayas Tacloban City "+""+"\nTuition: Bachelors 8.000,-12.000"+""+"\n Available Courses: BS in Accountancy");
			System.out.println("4.)University of the Phillipines Visayas Tacloban City "+""+"\nTuition: Bachelors 8.000,-12.000"+""+"\n Available Courses: Bachelor of of Secondary Education");
			System.out.println("5.)University of the Phillipines Visayas Tacloban City "+""+"\nTuition: Bachelors 8.000,-12.000"+""+"\n Available Courses: BS in  Management");
			System.out.println("6.)University of the Phillipines Visayas Tacloban City "+""+"\nTuition: Bachelors 8.000,-12.000"+""+"\n Available Courses: BA in Psychology");
			System.out.println("7.University of the Phillipines Visayas Tacloban City) "+""+"\nTuition: Bachelors 8.000,-12.000"+""+"\n Available Courses: BA in Economics ");
			System.out.println("8.)University of the Phillipines Visayas Tacloban City "+""+"\nTuition: Bachelors 8.000,-12.000"+""+"\n Available Courses: BA in Communication Arts");

		
			
			int choice4=input1.nextInt();
			if(choice4==1) {
				System.out.println("\nDo you wish to enroll in this Course? Yes or No");
				option=input1.next().toLowerCase();
				if(option.equals(option1)){
					System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Magsaysay Blvd, Downtown, Tacloban City, Leyte\n\t Website: https://tac.upv.edu.ph\n\t Contact# (+63) 289818500 ");					
				}
				else if(option.equals(option2)) {
					System.out.println();	
					
				}
				else {
					System.out.print("\nInput Error");
				}
			}
			else if (choice4==2) {
				System.out.println("\nDo you wish to enroll in this Course? Yes or No");
				option=input1.next().toLowerCase();
				if(option.equals(option1)){
					System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Magsaysay Blvd, Downtown, Tacloban City, Leyte\n\t Website: https://tac.upv.edu.ph\n\t Contact# (+63) 289818500");
					
				}
				else if(option.equals(option2)) {
					System.out.println();	
				}
				else {
					System.out.print("\nInput Error");
				}
			}
			else if (choice4==2) {
				System.out.println("\nDo you wish to enroll in this Course? Yes or No");
				option=input1.next().toLowerCase();
				if(option.equals(option1)){
					System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Magsaysay Blvd, Downtown, Tacloban City, Leyte\n\t Website: https://tac.upv.edu.ph\\n\\t Contact# (+63) 289818500");
					
				}
				else if(option.equals(option2)) {
					System.out.println();	
				}
				else {
					System.out.print("\nInput Error");
					}
				}
					else if (choice4==3) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Magsaysay Blvd, Downtown, Tacloban City, Leyte\n\t Website: https://tac.upv.edu.ph\n\t Contact# (+63) 289818500");
							
						}
						else if(option.equals(option2)) {
							System.out.println();	
						}
						else {
							System.out.print("\nInput Error");
						}
					}
					else if (choice4==4) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Magsaysay Blvd, Downtown, Tacloban City, Leyte\n\t Website: https://tac.upv.edu.ph\n\t Contact# (+63) 289818500");
							
						}
						else if(option.equals(option2)) {
							System.out.println();	
						}
						else {
							System.out.print("\nInput Error");
						}
					}
					else if (choice4==5) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Magsaysay Blvd, Downtown, Tacloban City, Leyte\n\t Website: https://tac.upv.edu.ph\n\t Contact# (+63) 289818500");
							
						}
						else if(option.equals(option2)) {
							System.out.println();	

						}
						else {
							System.out.print("\nInput Error");
						}
					}
					else if (choice4==6) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Magsaysay Blvd, Downtown, Tacloban City, Leyte\n\t Website: https://tac.upv.edu.ph\n\t Contact# (+63) 289818500");
							
						}
						else if(option.equals(option2)) {
							System.out.println();	

						}
						else {
							System.out.print("\nInput Error");
						}
					}
					else if (choice4==7) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Magsaysay Blvd, Downtown, Tacloban City, Leyte\n\t Website: https://tac.upv.edu.ph\n\t Contact# (+63) 289818500");
							
						}
						else if(option.equals(option2)) {
							System.out.println();	

						}
						else {
							System.out.print("\nInput Error");
						}
					}
					else if (choice4==8) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Magsaysay Blvd, Downtown, Tacloban City, Leyte\n\t Website: https://tac.upv.edu.ph\n\t Contact# (+63) 289818500");
							
						}
						else if(option.equals(option2)) {
							System.out.println();	

						}
						else {
							System.out.print("\nInput Error");
						}
					}}
	         	if (choice2==3) {
	         		System.out.println("Choose your Course");
	         		
	         		System.out.println("1.)Eastern Visayas State University "+""+"\nTuition: Bachelors 10.000,-14.000"+""+"\n Available Courses: BS in Business Administration");
					System.out.println("2.)Eastern Visayas State University "+""+"\nTuition: Bachelors 10.000,-14.000"+""+"\n Available Courses: BS in Information Technology");
					System.out.println("3.)Eastern Visayas State University "+""+"\nTuition: Bachelors 10.000,-14.000"+""+"\n Available Courses: BS in Accountancy");
					System.out.println("4.)Eastern Visayas State University "+""+"\nTuition: Bachelors 10.000,-14.000"+""+"\n Available Courses: BS in Civil Engineering");
					System.out.println("5.)Eastern Visayas State University "+""+"\nTuition: Bachelors 10.000,-14.000"+""+"\n Available Courses: BS in  Marine Engineering");
					System.out.println("6.)Eastern Visayas State University "+""+"\nTuition: Bachelors 10.000,-14.000"+""+"\n Available Courses: Bachelor of Industrial Technology");
					System.out.println("7.)Eastern Visayas State University "+""+"\nTuition: Bachelors 10.000,-14.000"+""+"\n Available Courses: BA in Electronic and Communications Engeneering ");
					System.out.println("8.)Eastern Visayas State University "+""+"\nTuition: Bachelors 10.000,-14.000"+""+"\n Available Courses: BS in Electronic and Communications Engineering");

					int choice5=input1.nextInt();
					if(choice5==1) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: Salazar St, Downtown, Tacloban\n\t Website: https://www.evsu.edu.ph\n\t Contact# (053) 3211084 ");					
						}
						else if(option.equals(option2)) {
							System.out.println();	

						}
						else {
							System.out.print("\nInput Error");
						}
				}
					if(choice5==2) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t   Located in: Salazar St, Downtown, Tacloban\n\t Website: https://www.evsu.edu.ph\n\t Contact# (053) 3211084 ");					
						}
						else if(option.equals(option2)) {
							System.out.println();	
							
						}
						else {
							System.out.print("\nInput Error");
						}
				}
					if(choice5==3) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Salazar St, Downtown, Tacloban\n\t Website: https://www.evsu.edu.ph\n\t Contact# (053) 3211084 ");					
						}
						else if(option.equals(option2)) {
							System.out.println();	
							
						}
						else {
							System.out.print("\nInput Error");
						}
				}
					if(choice5==4) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t   Located in: Salazar St, Downtown, Tacloban\n\t Website: https://www.evsu.edu.ph\n\t Contact# (053) 3211084 ");					
						}
						else if(option.equals(option2)) {
							System.out.println();	
							
						}
						else {
							System.out.print("\nInput Error");
						}
				}
					if(choice5==5) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Salazar St, Downtown, Tacloban\n\t Website: https://www.evsu.edu.ph\n\t Contact# (053) 3211084 ");					
						}
						else if(option.equals(option2)) {
							System.out.println();	
							
						}
						else {
							System.out.print("\nInput Error");
						}
				}
					if(choice5==6) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t  Located in: Salazar St, Downtown, Tacloban\n\t Website: https://www.evsu.edu.ph\n\t Contact# (053) 3211084 ");					
						}
						else if(option.equals(option2)) {
							System.out.println();	
							
						}
						else {
							System.out.print("\nInput Error");
						}
				}
					if(choice5==7) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: Salazar St, Downtown, Tacloban\n\t Website: https://www.evsu.edu.ph\n\t Contact# (053) 3211084");					
						}
						else if(option.equals(option2)) {
							System.out.println();	
							
						}
						else {
							System.out.print("\nInput Error");
						}
				}
					if(choice5==8) {
						System.out.println("\nDo you wish to enroll in this Course? Yes or No");
						option=input1.next().toLowerCase();
						if(option.equals(option1)){
							System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: Salazar St, Downtown, Tacloban\n\t Website: https://www.evsu.edu.ph\n\t Contact# (053) 3211084 ");					
						}
						else if(option.equals(option2)) {
							System.out.println();	
							
						}
						else {
							System.out.print("\nInput Error");
						}
				}}
					if (choice2==4) {
		         		System.out.println("Choose your Course");
		         		
		         		System.out.println("1.)Asian Develpment Foundation College "+""+"\n Available Courses: Bachelor of Computer in Science");
						System.out.println("2.)Asian Develpment Foundation College "+""+"\n Available Courses: Bachelor of Science in AccountingTechnology");
						System.out.println("3.)Asian Develpment Foundation College "+""+"\n Available Courses: BS in Accountancy");
						System.out.println("4.)Asian Develpment Foundation College "+""+"\n Available Courses: BS in in Criminology");
						System.out.println("5.)Asian Develpment Foundation College "+""+"\n Available Courses: BS in  Secondary Education");
						System.out.println("6.)Asian Develpment Foundation College "+""+"\n Available Courses: Bachelor of Industrial Technology");
						System.out.println("7.)Asian Develpment Foundation College "+""+"\n Available Courses: BS Tourism Management  ");
						System.out.println("8.)Asian Develpment Foundation College"+""+"\n Available Courses: BS in  Arts in Psychology");
  
						int choice6=input1.nextInt();
						if(choice6==1) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: BLISS Sagkahan, Tacloban City, Leyte\n\t Website: adfcollege.net\n\t Contact# (053) 3257654 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice6==2) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: BLISS Sagkahan, Tacloban City, Leyte\n\t Website: adfcollege.net\n\t Contact# (053) 3257654 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice6==3) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: BLISS Sagkahan, Tacloban City, Leyte\n\t Website: adfcollege.net\n\t Contact# (053) 3257654 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice6==4) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: BLISS Sagkahan, Tacloban City, Leyte\n\t Website: adfcollege.net\n\t Contact# (053) 3257654 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice6==5) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: BLISS Sagkahan, Tacloban City, Leyte\n\t Website: adfcollege.net\n\t Contact# (053) 3257654 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice6==6) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: BLISS Sagkahan, Tacloban City, Leyte\n\t Website: adfcollege.net\n\t Contact# (053) 3257654 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice6==7) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: BLISS Sagkahan, Tacloban City, Leyte\n\t Website: adfcollege.net\n\t Contact# (053) 3257654 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice6==8) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in: BLISS Sagkahan, Tacloban City, Leyte\n\t Website: adfcollege.net\n\t Contact# (053) 3257654 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}}
					if (choice2==5) {
		         		System.out.println("Choose your Course");
		         		
		         		System.out.println("1.)ACLC College Tacloban "+""+"\n Available Courses: BS in Computer Science");
						System.out.println("2.)ACLC College Tacloban "+""+"\n Available Courses: BS in Information Technology");
						System.out.println("3.)ACLC College Tacloban "+""+"\n Available Courses: BS in Information Technology");
						System.out.println("4.)ACLC College Tacloban "+""+"\n Available Courses: BS in Accounting");
						System.out.println("5.)ACLC College Tacloban "+""+"\n Available Courses: BS in  Business Administration");
						System.out.println("6.)ACLC College Tacloban "+""+"\n Available Courses: BS in Entreprenuership");
						System.out.println("7.)ACLC College Tacloban "+""+"\n Available Courses: BS in Acounting Technology  ");
						System.out.println("8.)ACLC College Tacloban "+""+"\n Available Courses: BS in Real Estate Management");
  
						int choice7=input1.nextInt();
						if(choice7==1) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in:M.H. Del PIlar St.Downtown, Tacloban City\n\t Website: https://www.aclc.edu.ph\n\t Contact# (053) 3211888321 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice7==2) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in:M.H. Del PIlar St.Downtown, Tacloban City\n\t Website: https://www.aclc.edu.ph\n\t Contact# (053) 3211888321 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice7==3) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\tLocated in:M.H. Del PIlar St.Downtown, Tacloban City\n\t Website: https://www.aclc.edu.ph\n\t Contact# (053) 3211888321 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice7==4) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in:M.H. Del PIlar St.Downtown, Tacloban City\nt Website: https://www.aclc.edu.ph\n\t Contact# (053) 3211888321 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice7==5) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in:M.H. Del PIlar St.Downtown, Tacloban City\n\t Website: https://www.aclc.edu.ph\n\t Contact# (053) 3211888321 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice7==6) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in:M.H. Del PIlar St.Downtown, Tacloban City\n\t Website: https://www.aclc.edu.ph\n\t Contact# (053) 3211888321 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice7==7) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in:M.H. Del PIlar St.Downtown, Tacloban City\n\t Website: https://www.aclc.edu.ph\n\t Contact# (053) 3211888321 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
					}
						if(choice7==8) {
							System.out.println("\nDo you wish to enroll in this Course? Yes or No");
							option=input1.next().toLowerCase();
							if(option.equals(option1)){
								System.out.println("\nHere Are Some Contact Information about this School\n\t Located in:M.H. Del PIlar St.Downtown, Tacloban City\n\t Website: https://www.aclc.edu.ph\n\t Contact# (053) 3211888321 ");					
							}
							else if(option.equals(option2)) {
								System.out.println();	
								
							}
							else {
								System.out.print("\nInput Error");
							}
						}
					}
					
					//To Logout
					if(choice2 == 6) {
						System.out.println("\tlogging out".toUpperCase() + "\n");
						new userAccount();
						break;
							}
				}
			}
		}
