import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Object[] myArray = new Object[]{1, "String", 3.14, true};

        System.out.println("Mảng ban đầu: " + Arrays.toString(myArray));

        // Thêm phần tử
        myArray = ArrayOperations.addElement(myArray, 42);
        System.out.println("Mảng sau khi thêm: " + Arrays.toString(myArray));

        // Xóa phần tử
        myArray = ArrayOperations.removeElement(myArray, 1);
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(myArray));

        // Cập nhật phần tử
        myArray = ArrayOperations.updateElement(myArray, 2, "Updated");
        System.out.println("Mảng sau khi cập nhật: " + Arrays.toString(myArray));


    }

}