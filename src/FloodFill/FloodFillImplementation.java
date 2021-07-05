package FloodFill;

public class FloodFillImplementation implements FloodFill{
    @Override
    public void flood(String map, FloodLogger logger) {
       FloodFill.getInstance();
    }

    public static void main(String[] args) {
        String s = "█░░█░█\n" +
                "█░░░█░\n" +
                "██████\n" +
                "██░░██\n" +
                "░█████\n" +
                "░█████";
        FloodFill.getInstance().flood(s, new FloodLoggerImplementation());
    }
}
