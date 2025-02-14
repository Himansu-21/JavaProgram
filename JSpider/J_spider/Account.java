/* define a class account
 * declare instance variable
 *       name, accountNum , balance
 * define parametrized constructor
 *      initialize instance variable
 * define main method
 *      create atleast 2 Account objects 
 *      Print instance variables
 */


public class Account {
    String name;
    int  accountNum;
    double balance;

    Account(String n , int a , double b){
        this.name = n;
        this.accountNum = a;
        this.balance = b;
    }

    public static void main(String[] args) {
      Account a1 = new  Account("akash",20650100, 7500); 
      Account a2 = new  Account("bikash",20650159, 9000); 

      System.out.println(a1.name +" " + a1.accountNum + " " + a1.balance);
      System.out.println(a2.name +" " + a2.accountNum + " " + a2.balance);

    }
    
}
