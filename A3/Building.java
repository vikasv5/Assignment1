
// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings
// Buildings cannot have children.
public class Building extends BoardComponent
{
	public int buildingHealth;
	
	public Building()
	{
		super();
		buildingHealth = 2;
	}

	@Override
	public void Operation()
	{
	System.out.println("Operation in Building of building health:"+buildingHealth);	
        /*
        buildingHealth=buildingHealth-1;
        
        if(buildingHealth==0){
            System.out.println("removing the building");
            
            this.parent.Remove(this);
            GameBoard.Instance().DecrementBuildingCount();
        
        
        }*/
        
        
        
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}
        
     //   @Override
        public void update(){
        
        if(buildingHealth>0)buildingHealth--;
        
//        if(buildingHealth==0){
//            this.parent.Remove(this);
            GameBoard.Instance().DecrementBuildingCount();
        
        
        }
        
        public int getBuildingHealth(){
        return buildingHealth;
        
        }
        
        
}
