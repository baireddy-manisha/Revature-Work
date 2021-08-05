package setDemo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ProductMain {
		public static void main(String[] args) {

			Set<Product> productList = new HashSet<>();
			productList.add(new Product(100 , "Dell" ,  1200.22f, 2.3f,100));
			productList.add(new Product(101 , "Hp"   ,  1100.22f, 2.4f,50));
			productList.add(new Product(190 , "Acer" ,  1100.22f, 2.3f,55));
			productList.add(new Product(200 ,"Lenovo",  1000.22f, 4.3f,60));
			productList.add(new Product(104 , "Apple",  900.22f , 4.3f,70));
			productList.add(new Product(111 , "HP"   ,  1400.22f, 4.3f,60));
			productList.add(new Product(104 , "Apple",  900.22f , 4.3f,70));
			productList.add(new Product(101 , "Hp"   ,  1100.22f, 2.4f,50));
			productList.add(new Product(190 , "Acer" ,  1100.22f, 2.3f,55));
			productList.add(new Product(100 , "Dell" ,  1200.22f, 2.3f,100));
			
			printProductList(productList);
		
		}

		public static void printProductList(Set<Product> productList) {

			Iterator<Product> i=productList.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}

	}


