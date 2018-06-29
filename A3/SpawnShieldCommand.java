

/**
 *
 * @author Vikas
 */
public class SpawnShieldCommand extends Command{

    public SpawnShieldCommand(Object receiver, String[] args) {
        super(receiver, args);
    }

    @Override
    public void Execute() {
    Square square = (Square) receiver;        
    IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
    System.out.println("Spawning Shield at (" + args[0] + "," + args[1] + ")");
    square.Add(factory.MakeShield(square));
    
    }
    
}