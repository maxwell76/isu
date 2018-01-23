
public class tomato extends AbsPlant{
    
    private int tomatoes;
    
    public tomato(){
        super();
        tomatoes = 0;
    }
    
    public tomato(int f,int w,int l, String n, double p, int t){
        tomatoes = t;
    }
    
    
    
    public void growTomatoes(){
        tomatoes++;
    }
    
    public int getTomatoes(){
        return tomatoes;
    }
    
}
