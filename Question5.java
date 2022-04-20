import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int val = in.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = val; i > 0; i--) {
      int to_list = in.nextInt();
      list.add(to_list);
    }
    /* Holder */
    ArrayList<Integer> val_hold = new ArrayList<Integer>();
    val_hold.add(0);
    val_hold.add(0);

    for (int i = 0; i < list.size(); i++) {
      int counter = 0;
      int check = list.get(i);
      for (int x = 0; x < list.size(); x++) {
        if (list.get(x) == check) {
          counter += 1;
        }
      }
      if (val_hold.get(1) < counter)
      {
        val_hold.set(0, check);
        val_hold.set(1, counter);
      }
    }

    System.out.println(val_hold.get(0));
  }
}
