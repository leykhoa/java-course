import java.util.Arrays;

public class ArrayOperations {


//Add a element
    public static Object[] addElement(Object[] arr, Object element) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length -1] = element;
        return arr;
    }
// Remove a element
    public static Object[] removeElement(Object[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return arr;
        }
        Object[] newArr = new Object[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);
        return newArr;
    }
// Update a element
    public static Object[] updateElement(Object[] arr, int index, Object element) {
        if (index < 0 || index >= arr.length) {
            return arr;
        }
        arr[index] = element;
        return arr;
    }

    // Thêm các phương thức khác nếu cần
}
