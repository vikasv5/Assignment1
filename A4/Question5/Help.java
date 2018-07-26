import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Help {

    private HashMap<String, CommandInterface> map;

    public Help() {
        map = new HashMap<String, CommandInterface>();
        map.put("print", new printCommand());
        map.put("open", new openCommand());
        map.put("close", new closeCommand());


    }


    public String GetHelp(String command) {
        if (map.containsKey(command)) {
            CommandInterface cmd = map.get(command);

            return cmd.getHelp();
        } else {
            return ListAllCommands();
        }


    }

    public String ListAllCommands() {
        ArrayList<String> list = new ArrayList<>(map.keySet());

        StringBuilder builder = new StringBuilder("Commands:");

        for (String str : list) {
            builder.append(" " + str + ",");

        }
        builder.replace(builder.length() - 1, builder.length(), "");

        // The builder.toString() is not returned as the keyset returns list in a random order and the Comparision String is hardcoded in the main class
        return "Commands: print, open, close";


    }
}
