
/**
 *
 * @author Vikas
 */
public class SpawnBuildingCommand extends Command{

    public SpawnBuildingCommand(Object receiver, String[] args) {
        super(receiver, args);
    }

    @Override
    public void Execute() {
     Square square = (Square) receiver;

     IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
     System.out.println("Spawning Building at (" + args[0] + "," + args[1] + ")");
     
     square.Add(factory.MakeBuilding());
     
    }
    
}
