/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

/**
 *
 * @author caleb
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
        
        shieldHealth=shieldHealth-1;
        if(shieldHealth==0){
        
        }
        component.Operation();
    }

    @Override
    public void Add(BoardComponent child) {
     component.Add(child);
    }

    @Override
    public void Remove(BoardComponent child) {
    component.Remove(child);
    }
    
    
}
