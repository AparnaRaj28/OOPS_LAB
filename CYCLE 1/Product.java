
/*Define a class named product with datamembers pcode,pname and price.Create 3 objects of the class and then find the product having the
*lowest price */
class productdata
{
 int pcode,price;
 String name;
 public productdata(int c,String n,int p)
 {
	 pcode=c;
	 name=n;
	 price=p;
 }
// public int price()
// {
//	 return price;
// }
 public void display()
 {
	 System.out.println("Name:"+name);
	 System.out.println("Product code:"+pcode);
	 System.out.println("Price:"+price);
 }
}
class Product
{
 public static void main(String args[])
 {
	 productdata obj1=new productdata(1,"Aparna",100);
	 productdata obj2=new productdata(2,"Malu",200);
	 productdata obj3=new productdata(3,"sonu",300);
	 System.out.println("The details are:");
	 obj1.display();
	 obj2.display();
	 obj3.display();
	 if(obj1.price>obj2.price && obj1.price>obj3.price)
	 {
		 System.out.println("Product 1 has the highest price");
	 }
	 else if(obj2.price>obj3.price)
	 {
		System.out.println("Product 2 has the highest price"); 
	 }
	 else
	 {
		 System.out.println("Product 3 has the highest price");
	 }
	 
 }
}