//
//     Задание No2
//     📌 Напишите метод, который сжимает строку.
//     📌 Пример: вход aaaabbbcdd.
//


public class task02 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        String newStr = compressString(str);
        System.out.println(newStr);
    }

    public static String compressString(String str) {
        int count = 1;
        StringBuilder res = new StringBuilder();
        char currentChar = str.charAt(count);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                res.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        res.append(currentChar).append(count);
        return res.toString();
    }
}
