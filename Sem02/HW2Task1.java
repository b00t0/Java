/*
Дана строка sql-запроса:

select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в 
виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.

Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами


*/

public class HW2Task1 {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String result = answer(QUERY, PARAMS);
        System.out.println(result);
    }
    
    public static String answer(String query, String params) {
        params = params.replace("{", "").replace("}", "").replace(":", ",").replace(" ", "").replaceAll("\"", "");
        String[] jsonArray = params.split(",");
        StringBuilder sb = new StringBuilder();
        
        sb.append(query);
        
        boolean firstCondition = true;

        for (int i = 0; i < jsonArray.length; i += 2) {
            String key = jsonArray[i];
            String value = jsonArray[i + 1];

            if (!value.equals("null")) {
                if (!firstCondition) {
                    sb.append(" and ");
                }
                sb.append(key).append("='").append(value).append("'");
                firstCondition = false;
            }
        }

        return sb.toString();
    }
}