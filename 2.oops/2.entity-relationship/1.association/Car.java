public class Car{
	private String brand;
	private String color;
	private String make;
	private double price;

	
	public Car(String brnad,String color,String make, double price, Engine engine){
		this.brand = brand;
		this.color = color;
		this.make = make;
		this.price = price;
		this.engine = engine;
	}


	private Engine engine=new Engine(1200.00,4,5000);

	private MediaPlayer mediaPlayer;

	public String getBrand(){
		return brand;
	}

	public String getMake(){
		return make;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	// READ ONLY
	public Engine getEngine(){
		return engine;
	}

	//READ ONLY
	public MediaPlayer getMediaPlayer(){
		return mediaPlayer;
	}

	//WRITE ONLY
	public void setMediaPlayer(MediaPlayer mediaPlayer){
		this.mediaPlayer = mediaPlayer;
	}

	public void displayCarInfo(){
		System.out.println("Car Details");
		System.out.println("------------------");
		System.out.println("Brand : "+getBrand());
		System.out.println("Make : "+getMake());
		System.out.println("Price"+getPrice());
        System.out.println("Color"+getColor());
	}



}