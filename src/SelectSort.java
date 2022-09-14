import java.util.List;

public class SelectSort {
    public static List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            int minElementIndex = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < list.get(minElementIndex)) {
                    minElementIndex = j;
                }
            }
            int min = list.get(minElementIndex);
            list.set(minElementIndex, list.get(i));
            list.set(i, min);
        }
        return list;
    }
}
