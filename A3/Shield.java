
/**
 *
 * @author Vikas
 */
public class Shield extends SquareDecorater{
    
    BoardComponent component;
    private int shieldHealth;
    
    public Shield(BoardComponent comp){
      
    this.component=comp;
    shieldHealth=2;
    }
    

    @Override
    public void Operation() {
        System.out.println("Operation in Shield and has health "+shieldHealth);
        
//        if(shieldHealth==0){
//       component.Remove(this);
//            System.out.println("Shield is removed"); 
//        }


    }

    @Override
    public void Add(BoardComponent child) {
     
    }

    @Override
    public void Remove(BoardComponent child) {
    
    }
    
    
}