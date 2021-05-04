

/*Define a class named Account with the details such as acc-no,holders name,acc type,balance.Use the following methods:
 * Credit:To deposit a particular amount
 * Debit:To withdraw a particular amount.Make sure that the minimum balance is to be Rs 1000 always.
 * Balance check:to view the balance
 * Create two objects and perform the above transactions.
 */
public class Account 
{
 int accnum,balance=1000;
 String name;
 public Account(int num,String nme,int bal)
 {
	 accnum=num;
	 name=nme;;
	 balance=balance+bal;
	 
 }
 public void credit(int c_amt)
 {
	 int credit_amount=c_amt;
	 balance=balance+credit_amount;
	 System.out.println("Amount credited");
 }
 public void debit(int d_amt)
 {
	 int debit_amount=d_amt;
	 balance=balance-debit_amount;
	 System.out.println("Amount debited");
	
 }
 public void check_balance()
 {
	 System.out.println("Balance is:"+balance);
 }
 public void display()
 {   
	 System.out.println();
	 System.out.println("Account detials are:");
	 System.out.println("Account num:"+accnum+" "+"Holders name:"+name+" "+"Balance:"+balance);
	 System.out.println();
 }
 public static void main(String args[])
 {
	 Account obj1=new Account(123,"Aparna",200);
	 Account obj2=new Account(345,"Sonu",300);
	 obj1.credit(200);
	 obj1.check_balance();
	 obj1.debit(100);
	 obj1.check_balance();
	 obj1.display();

	 
 }
}
