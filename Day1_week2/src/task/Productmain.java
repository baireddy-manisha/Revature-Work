package task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Productmain {
		 public static void main(String[] args) {

			List<Product> productList = new ArrayList<>();
			productList.add(new Product(100, "Dell", 1200.22f, 2.3f,100));
			productList.add(new Product(101, "Hp", 1100.22f, 2.4f,50));
			productList.add(new Product(190, "Acer", 1100.22f, 2.3f,55));
			productList.add(new Product(200, "Lenovo", 1000.22f, 4.3f,60));
			productList.add(new Product(104, "Apple", 900.22f, 4.3f,70));
			productList.add(new Product(111, "Mac", 1400.22f, 4.3f,60));

			printProductList(productList);

			Collections.sort(productList);

			System.out.println("\nPrinting Products sorted based on id");
			printProductList(productList);

			Collections.sort(productList, new ProductNameComparator());
			System.out.println("\nPrinting products sorted based on provider name(Z-A)");
			printProductList(productList);

			Collections.sort(productList, (Product p1, Product p2) -> {
				Double d1 = p1.getCost();
				Double d2 = p2.getCost();
				return d1.compareTo(d2);
			});
			System.out.println("\nPrinting products sorted based on cost");
			printProductList(productList);
			
			Collections.sort(productList, (Product p1, Product p2) -> {
				Float f1=p1.getRating();
				Float f2=p2.getRating();
				int x=f2.compareTo(f1);
				if(x==0) {
					Double d1 = p1.getCost();
					Double d2 = p2.getCost();
					x=d1.compareTo(d2);
				}
				return x;
			});
			
			System.out.println("\nPrinting Buses products based on highest rating and if 2 or more have same rating then by lowest cost");
			printProductList(productList);
			
			Collections.sort(productList, (Product p1, Product p2) -> {
				Float f1 = p1.getQuant();
				Float f2 = p2.getQuant();
				return f1.compareTo(f2);
			});
			System.out.println("\nPrinting products sorted based on Quantity");
			printProductList(productList);
		 }

		public static void printProductList(List<Product> productList) {
			for (Product p : productList) {
				System.out.println(p);
			}
		}

	}


