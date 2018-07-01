import java.util.ArrayList;
import java.util.Iterator;

// Square is a composite, making up the Composite pattern (contains components)
public class Square extends BoardComponent
{
	public  ArrayList<BoardComponent> children;
	private BoardComponent parent;
	
	public Square()
	{
		super();
		children = new ArrayList<BoardComponent>();
	}
        
        public ArrayList<BoardComponent> getChildren(){
        return children;
        }
        

	@Override
	public void Operation()
	{
             System.out.println("Operation in Square");
		for (int i = 0; i < children.size(); i++)
		{
                   
			BoardComponent child = children.get(i);
			child.Operation();
		}
	}

	@Override
	public void Add(BoardComponent child)
	{
		// I am now this child's parent.
		children.add(child);
		child.SetParent(this);
	}

	@Override
	public void Remove(BoardComponent child)
	{
		children.remove(child);
	}
        
      //  @Override
        public void update()
        {
            for(Iterator<BoardComponent> childIter = children.iterator(); childIter.hasNext();){
            boolean removeChild;             
                    BoardComponent child= childIter.next();
                if((child instanceof Shield)   )
            {
            Shield s= (Shield)child;
            s.update();
            if(s.getShieldHealth()==0){
            children.remove(child);
                System.out.println("Removing Shield");
            }
            
            }
            
            
        
            if( child instanceof Building){
            Building b= (Building)child;
            
            b.update();
            if(b.getBuildingHealth()==0){
            //children.remove(child);
            System.out.println("Removing Building");
            }
                
            
            }
        }
        
        }
        
        
}
