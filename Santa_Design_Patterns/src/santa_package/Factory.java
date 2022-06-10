package santa_package;

public abstract class Factory {
	
	public abstract Toy createToy(String toyName);
	
	
	public static Toy getToy(String type){
        if ("Doll".equalsIgnoreCase(type)){
            return new Doll("pink","Bella");
        }else if("Bike".equalsIgnoreCase(type)){
            return new Bicycle("blue", "Bibi");
        }
        return null;
    }


}
