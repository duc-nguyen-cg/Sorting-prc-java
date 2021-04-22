public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list){
        int min;
        for (int i = 0; i < list.length; i++){
            min = i;
            for (int j = i+1; j< list.length; j++){
                if (list[j] < list[min]){
                    min = j;
                }
            } //find min

            if (min != i){
                double temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            } //set the min element to the far left
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + "  ");
    }
}
