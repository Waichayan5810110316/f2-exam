public abstract class Shape3D implements AreaCalculable,VolumnCalculable{
	private String name;
	public Shape3D(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

}