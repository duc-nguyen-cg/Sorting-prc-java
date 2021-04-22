public class InsertionSort {
    public static void insertionSort(int[] list){
        int pos, temp;
        for (int i = 1; i < list.length; i++){
            temp = list[i];
            pos = i;

            while (pos > 0 && temp < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = temp;
        }
    }


    public static void main(String[] args) {
        int[] list = {6,3,2,7,8,10,1};
        insertionSort(list);
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + "  ");
        }
    }
}
