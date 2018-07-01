
import java.util.ArrayList;


public class AsteroidImpact implements subjectSquare{

    private ArrayList<BoardComponent> components;
    
    
    public AsteroidImpact(){
    components= new ArrayList<BoardComponent>();
    
    
    }
    
    @Override
    public void addSquare(BoardComponent comp) {
   components.add(comp);
    }

    @Override
    public void deleteSquare(BoardComponent comp) {
   components.remove(comp);
    }

    @Override
    public void notifySquare(BoardComponent comp) {
    //Parent component of Asteroid
    
    Square s=(Square)comp;
     
    
        s.update();
        
        
    
    }
    
}
