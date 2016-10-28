import java.util.Scanner;
import java.util.ArrayList;

class DigitalRoot {

  public static String sliceRange(String s, int startIndex, int endIndex) {
    if(startIndex < 0 ) startIndex  = s.length() + startIndex;
    if(endIndex < 0)    endIndex    = s.length() + endIndex;
    return s.substring(startIndex, endIndex);
  }

  public static void main(String[] args) {

    System.out.println("Write a whole number to get the digital root.");

    Scanner sc      = new Scanner(System.in);
    String  num     = sc.nextLine();
    Integer digRoot = 0;

    ArrayList<String> spliceNum = new ArrayList<String>();

    for(int x = 0; x < num.length(); x++) {
      spliceNum.add(x, sliceRange(num, x, x+1));
    }

    for(int x = 0; x < spliceNum.size(); x++) {
      digRoot = digRoot + Integer.parseInt(spliceNum.get(x));
    }

    System.out.println("Here is your digital root.");
    System.out.println(digRoot);

  }

}
