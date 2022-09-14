import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CompareSort {

    public void compareSort () {
        List<Integer> bubbleList =  new ArrayList<>();
        for (int i = 0; i < 60000; i++) {
            bubbleList.add(new Random().nextInt(500));
        }

        List<Integer> selectSort =  new ArrayList<>();
        for (int i = 0; i < 60000; i++) {
            bubbleList.add(new Random().nextInt(500));
        }

        List<Integer> sortList =  new ArrayList<>();
        for (int i = 0; i < 60000; i++) {
            sortList.add(new Random().nextInt(500));
        }

        long startTime = System.nanoTime();
        new SortBubble().sort(bubbleList);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("BUBBLE SORT WORKED IN" + " "+ estimatedTime+ " " + " nanosec");


        long startTime3 = System.nanoTime();
        new SelectSort().sort(selectSort);
        long estimatedTime3 = System.nanoTime() - startTime;
        System.out.println("Select Sort WORKED IN" + " "+ estimatedTime3+ " " + " nanosec");

        long startTime2 = System.nanoTime();
        Collections.sort(sortList);
        long estimatedTime2 = System.nanoTime() - startTime;
        System.out.println("COLLECTION SORT WORKED IN" + " "+ estimatedTime2+ " " + " nanosec");

    }
}
