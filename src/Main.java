/*
import org.json.JSONObject; //данную библиотеку пришлость установить дополнительно, но другого решения не нашла
//Задание
//1) Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//*это самое сложное задание на понимание, надеюсь поняла задание верно, подпишу коменты как что поняла...
public class Main {
    public static void main(String[] args) {
        String jsonFilterData = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        //задаем JSON-строку, содержащую данные для фильтрации.
        JSONObject filterData = new JSONObject(jsonFilterData);
        //создаем объект JSONObject, чтобы получить данные из JSON-строки
        StringBuilder whereClause = new StringBuilder("select * from students where ");
        //создаем объект StringBuilder с начальным значением "select * from students where ".

        for (String key : filterData.keySet()) {
            String value = filterData.getString(key);
            if (!value.equals("null")) {
                whereClause.append(key).append(" = '").append(value).append("' AND ");
                //Цикл `for` проходит по каждому ключу в объекте filterData.
                // Если значение не равно "null", добавляем условие фильтрации в whereClause используя StringBuilder.
            }
        }
        System.out.println("Сформированная часть WHERE запроса:");
        System.out.println(whereClause.toString());
        //Таким образом, программа формирует часть WHERE запроса на основе данных для фильтрации и выводит ее.
        // Если значение параметра равно "null", оно не будет включено в запрос.
    }
}
*/
// second task

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, 3, 2, 8, 5, 1};

        // Создание лог-файла
        try (FileWriter fileWriter = new FileWriter("log.txt");
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            // Исходный массив
            printArray(array, printWriter);

            // Сортировка пузырьком
            SecondTask.bubbleSort(array, printWriter);

            // Отсортированный массив
            printArray(array, printWriter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printArray(int[] array, PrintWriter printWriter) {
    }
}
