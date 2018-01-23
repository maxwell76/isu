
import javax.swing.ImageIcon;


abstract public class AbsPlant {
    
    protected int food,water,light;
    protected String name;
    protected double price;
    
    public AbsPlant(){
        food = 0;
        water = 0;
        light = 0;
        price = 5;
    }
    
    public AbsPlant(String n, int f,int w,int l,  double p){
        name = n;
        food = f;
        water = w;
        light = l;
        price = p;
    }
    
    final public void addWater(int x){
        water+=x;
    }
    
    final public void setName(String na){
        name = na;
    }
    
    final public void addFood(int x){
        food+=x;
    }
    
    final public void addLight(int x){
        light+=x;
    }
    
    final public int getFood(){
        return food;
    }
    
    final public int getPrice(){
        return food;
    }
    
    final public int getWater(){
        return food;
    }
    
    final public int getLight(){
        return food;
    }
    
    final public String getName(){
        return name;
    }
    
}

