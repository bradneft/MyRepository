package example4;

public class Product {
	private int id;
	private String name;
	private double rank;
	private double cost;
	
	public Product(int id, String name, double rank) {
		this.id=id;
		this.name=name;
		this.rank=rank;
	}
	public Product(int id, String name, double rank, double cost) {
		this(id,name,rank);
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Product [id="+id+", name="+name+", rank="+rank+", cost="+cost+"]";
		
	}
}
