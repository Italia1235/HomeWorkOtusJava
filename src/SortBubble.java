class SortBubble {
    int temp;
    boolean unsorted = true;
    public void sort(int[] array) {
        while(unsorted){
            unsorted = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    unsorted = true;
                }
            }
        }

    }
    public void checkSort(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }
}