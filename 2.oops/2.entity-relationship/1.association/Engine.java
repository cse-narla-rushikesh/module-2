public class Engine {

    private double cc;
    private int cylinderCount;
    private int hp;

    public Engine(double cc, int cylinderCount, int hp){
    	this.cylinderCount = cylinderCount;
    	this.cc = cc;
    	this.hp = hp;
    }



    // Getter for cc
    public double getCc() {
        return cc;
    }
    // Getter for cylinderCount
    public int getCylinderCount() {
        return cylinderCount;
    }

    // Getter for hp
    public int getHp() {
        return hp;
    }

    public void displayEngineInfo(){
    	System.out.println("Engine Details");
    	System.out.println("-------------------");
    	System.out.println("cc : "+getCc());
    	System.out.println("Cylinder Count : "+getCylinderCount());
    	System.out.println("HP : "+getHp());
    	System.out.println();
    }
}