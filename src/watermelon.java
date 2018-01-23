
public class watermelon extends AbsPlant{
    private int radius;
    public watermelon(){
        super();
        radius=0;
    }
    
    public watermelon(int f,int w,int l, String n, double p,int r){
        super(n,f,w,l,p);
        radius =r;
    }
    
    public void grow(){
        radius+=2;
    }
    public int getRadius(){
        return radius;
    }
    
    
    
}
