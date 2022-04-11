public class exp1
{
	public static void main(String args[])
	{
		product p1= new product();
		p1.pcode="car123";
		p1.pname="Benz";
		p1.price=100000;
		System.out.println("************Displaying p1 *************");
		p1.display();
		product p2= new product("Jaguar","Car426",25000);
		System.out.println("************Displaying p2 *************");
		p2.display();
		product p3= new product("Maruthi","Car800",50000);
		System.out.println("************Displaying p3 *************");
		p3.display();
		product p=p3.getprice()< (p1.price< p2.price ? p1.price:p2.price) ? p3:(p1.price < p2.price ? p1:p2);
		System.out.println("\n************Displaying product with lowest price************");
		p.display();
	}
} 
		