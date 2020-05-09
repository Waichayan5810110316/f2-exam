public abstract class Shape2D implements AreaCalculable{
    private String name;
	public Shape2D(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}