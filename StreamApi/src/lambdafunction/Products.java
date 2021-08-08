package lambdafunction;

 
public class Products implements Comparable<Products> {
	private int id;
	private String productName;
	private double cost;
	private int quantity;
	private double TotalBill;
		public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String productName, float cost, int quantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
		
			}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public double getCost() {
		return cost;
	}

	public int getQuantity() {
		return quantity;
	}	
	   
	public static void printProduct(int i,Products product) {
		System.out.printf("%d    %-7s       %-8.2f   %-4d    %10.2d\n",i,product.productName,product.cost,product.quantity,product.TotalBill);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", providerName=" + productName + ", cost=" + cost + ",quantity="+quantity+"]";
	}

	@Override
	public int compareTo(Products p) {
		Integer i1=this.id;
		Integer i2=p.id;
		return i1.compareTo(i2);
	}
	
}

