package lambdafunction;
import java.util.*;
public class ProductsMain {
	
	public static void main(String args[]) {
		List<Products> product=new ArrayList<>();
		product.add(new Products(1, "laptops"  , 50000.50f , 10));
		product.add(new Products(2, "Computers", 20000.02f , 20));
		product.add(new Products(3, "Mobiles"  , 15000.77f , 29));
		product.add(new Products(4, "PDA"      , 1099.90f  , 15));
		product.add(new Products(5, "Pc"       , 1567.89f  , 58));
		product.add(new Products(6, "Batteries", 5000.09f  , 35));
		Collections.sort(product, (Products p1, Products p2) -> {
			String s1 = p1.getProductName();
			String s2 = p2.getProductName();
			return s1.compareTo(s2);
		});
		ProductsMain m=new ProductsMain();
		m.printMainProducts(product);
	}
	public void printMainProducts(List<Products> product) {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("S.No     Name            Cost            Quantity         TotalBill  ");
		System.out.println("--------------------------------------------------------------------------");
		int i=1;
		for(Products p:product) {
			Products.printProduct(i++,p);
		}
		System.out.println("---------------------------------------------------------------------------");
		Double TotalBill=product.stream().map(e ->e.getCost()*e.getQuantity()).reduce(0.0,(sum,bill)->sum + bill);
		
		System.out.println("Total                                                    "+TotalBill);
		System.out.println("5% GST                                                   "+TotalBill*0.05);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("final Bill                                               "+(TotalBill*0.05));
		System.out.println("----------------------------------------------------------------------------");
		
	}
}