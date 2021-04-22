import java.util.Scanner;

public class InsertionSortByStep {
    public static void inserttionSortByStep(int[] list){
        int pos, temp;
        for (int i = 1; i < list.length; i++){
            temp = list[i];
            pos = i;
            while (pos > 0 && temp < list[pos-1]){
                list[pos] = list[pos-1];
                pos--;

                //show small steps
                for (int j = 0; j < list.length; j++) {
                    System.out.print(list[j] + "\t");
                }
                System.out.println();
            }
            list[pos] = temp;

            /* Show the list after sort */
            System.out.print("List after the  " + i + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");
        inserttionSortByStep(list);
    }
}

