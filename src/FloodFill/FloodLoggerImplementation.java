package FloodFill;

public class FloodLoggerImplementation implements FloodLogger{
    @Override
    public void log(String floodState) {
        System.out.println(floodState);
        System.out.println();
    }
}
