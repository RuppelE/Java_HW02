//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
import java.io.PrintWriter;

public class SecondTask { static void bubbleSort(int[] array, PrintWriter printWriter) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // Запись текущего состояния массива в лог-файл
            printArray(array, printWriter);

            // Если внутренний цикл не выполнил ни одной замены, массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    private static void printArray(int[] array, PrintWriter printWriter) {
        for (int num : array) {
            printWriter.print(num + " ");
        }
        printWriter.println();
    }

}
