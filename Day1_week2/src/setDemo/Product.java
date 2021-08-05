package setDemo;
import java.util.Objects;

public class Product {

	private int id;
	private String providerName;
	private double cost;
	private float rating;
	private float quant;
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String providerName, double cost, float rating,float quant) {
		super();
		this.id = id;
		this.providerName = providerName;
		this.cost = cost;
		this.rating = rating;
		this.quant = quant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getQuant() {
		return quant;
	}

	public void setQuant(float rating) {
		this.quant = quant;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", providerName=" + providerName + ", cost=" + cost + ", rating=" + rating + ",quant="+quant+"]";
	}
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return id == other.id;
		}


		
	}


