import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static int findSum2(List<Integer> numbers, int target){
        int result = -1;
        for(int a : numbers){
            for(int b : numbers){
                if(a + b == target)
                {
                    result = a*b;
                }
            }
        }
        return result;
    }
    final int sumTarget = 2020;
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     List<Integer> numbers = new ArrayList<Integer>();
    
     while(scan.hasNext()){
        int nmbr = scan.nextInt();
        numbers.add(nmbr);
    }
    int result = findSum2(numbers, 2020);
    scan.close();
    }

    // this is a stupid test line
}
