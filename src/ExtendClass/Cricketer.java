package ExtendClass;

 public abstract class Cricketer {
	private  String name;
	private  String country;
	
	public  void setName(String s){
		name=s;
		}
	
	public  String getName(){
		return name;
	}
	public   void setCountry(String k){
		country=k;
		
		}
	public  String getCountry(){
		return country;
	}
	
	public abstract void setType(String l);
	public abstract String getType();
	

}
