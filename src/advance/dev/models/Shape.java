package advance.dev.models;

public abstract class Shape {
	private String name;
	public abstract double chuVi();
	public abstract double dienTich();
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name:%s - chuVi:%.2f - dienTich:%.2f", name, chuVi(), dienTich());
	}
}