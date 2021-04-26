package CatchEmAll;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    public static Exception exception = new FileNotFoundException("fnf");

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        }catch (FileNotFoundException e){
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Resource is missing");
            illegalArgumentException.initCause(e);
            throw (illegalArgumentException);
        } catch (IOException e){
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Resource error");
            illegalArgumentException.initCause(e);
            throw (illegalArgumentException);
        }
        catch (ArithmeticException | NumberFormatException e){
            System.err.println(e.getMessage());
        }
    }
}

