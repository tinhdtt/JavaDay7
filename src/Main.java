import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        intArray();
    }

    static void intArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Mảng int");
        System.out.print("Nhập số phần tử của mảng = ");
        int size = sc.nextInt();
        Integer intArray[] = new Integer[size];

        for (int i = 0; i < size; i++) {
            System.out.print("\n Nhập phần tủ ở vị trí " + i + "= ");
            intArray[i] = sc.nextInt();
        }
        System.out.print("\n In mảng \n");
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("Phần tử thứ %d: %s\n", i, intArray[i]);
        }
        int indexmin = 0;
        int indexmax = 0;
        int indexsecond = 0;
        int min = intArray[0];
        int max = intArray[0];
        int second = intArray[0];


        for (int i = 0; i < size; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
                indexmin = i;
            }
            if (intArray[i] > max) {
                max = intArray[i];
                indexmax = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất có index = " + indexmin + " và value = " + min);
        System.out.println("Giá trị lớn nhất có index = " + indexmax + " và value = " + max);


        for (int i = 0; i < size; i++) {
            int number = intArray[i];
            if (max < number ) {
                second = max;
                max = number;
            }
            indexsecond = i;
        }
        System.out.println("Giá trị lớn thứ hai có index = " + indexsecond + " và value = " + second);
    }
}
