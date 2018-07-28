public class openCommand implements CommandInterface {
    @Override
    public String getHelp() {
        return "open -f <path> [-create=0/1]";
    }
}
