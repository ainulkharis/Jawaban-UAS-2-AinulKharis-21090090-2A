import java.util.Scanner;

public class QuickSort {

    private int[] data;

    public QuickSort(int[] data) {

        Scanner input = new Scanner(System.in);
        this.data = data;
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                QuickSortAscending();
                break;
            case 2:
                QuickSortDescending();
                break;
        }
    }

    public QuickSort() {

    }

    public void QuickSortAscending() {
        System.out.println("Sebelum : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("Sesudah : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    public void QuickSortDescending() {
        System.out.println("Sebelum : ");
    }

    public static void main(String[] args) {
        QuickSort _myQS = new QuickSort();
        _myQS.QuickSortAscending();
        _myQS.QuickSortDescending();
        System.out.println();
    }
}
