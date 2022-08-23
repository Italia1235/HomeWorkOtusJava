public class Main {

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 1};
        int[] test2 = {12, 23, 3, 44, 5, 6, 1};
        int[] test3 = {42,-1, 4, -5, 6, -12,1 };
        //System.out.println(-1<3);
        SortBubble m = new SortBubble();
//        m.sort(test2);
//        m.checkSort(test2);
        m.sort(test3);
        m.checkSort(test3);
//        m.sort(test1);
//        m.checkSort(test1);

    }


}

