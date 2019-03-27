package tree;
public class BoundsException extends Exception
{
    void printError()
    {
        printStackTrace();
        System.err.println("element to be deleted not found!");
    }
}
