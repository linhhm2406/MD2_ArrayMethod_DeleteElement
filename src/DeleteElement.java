import java.util.Scanner;

public class DeleteElement {
    public static int find(int number, int[] array) {
        int index=-1;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void deleteElement (int index, int[] array){
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length-1] =0;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        int[] array;

        System.out.print("Nhap vao so luong phan tu trong mang : ");
        size = input.nextInt();

        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }

        System.out.print("Mang vua nhap ban dau la : ");
        displayArray(array);

        System.out.println();

        System.out.print("Nhap vao phan tu muon xoa: ");
        int elementToDelete = input.nextInt();
        if (find(elementToDelete,array)!=-1){
            int indexToDelete = find(elementToDelete,array);
            deleteElement(indexToDelete,array);
            System.out.print("Mang sau khi bi xoa phan tu la : ");
            displayArray(array);
        } else {
            System.out.println("Phan tu muon xoa khong nam trong mang");
            System.out.print("Mang khong bi xoa phan tu : ");
            displayArray(array);
        }
    }
    public static void displayArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
