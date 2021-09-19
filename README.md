# CollinsonVendingMachine
VendingMachine Java Test for Collinson

**CollinsonVendingMachineAssignment**: This is a sample Java project for Collinson used for designing and functioning of a Vending machine.
Once the project has be downloaded we can the run the following command to kick start the application:

**How to Run**
**Command**
mvn test –PmainClass

The above command first does the mvn test but we have created a profile in pom file (mainClass) which triggers the main class of the application 

**Flow of Vending Machine**
After the application is started we get the intro message i.e.  “Welcome to Collinson Vending Machine”
And the list of items in the vending machine are displayed alone with its price i.e. 
1)	COKE –Price: 25 Cents
2)	PEPSI –Price: 35 Cents
3)	SODA –Price: 45 Cents
The user now needs to enter the id of the item he wants to purchase i.e. (1 or 2 or 3)
After the we need to enter the coins in the vending machine (1,5,10,25) 
We need to enter the coins in a comma separated manner i.e. if we want to pass 2 twenty-five cents coins we will do 0,0,0,2 or if we want to pass 1 one cent and 3 ten cents coins we will do 1,0,3,0
The balance amount if any is returned to the user and the message for the same is shown and the programs ends. 

