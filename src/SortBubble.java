import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class SortBubble {
    public  List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                int a = list.get(j);
                int b = list.get(j+1);
                if (a > b) {
                    list.set(j, b);
                    list.set(j+1, a);
                }
            }
        }
        return list;
    }
}
