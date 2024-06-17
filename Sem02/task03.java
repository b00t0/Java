/*
 Задание No3
📌 Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение).
 */


public class task03 {
    public static void main(String[] args) {
        String word = "tenet";
        System.out.println(isPalindrome(word));
    }

    static boolean isPalindrome(String inpuStr) {
        for (int i = 0; i < inpuStr.length() / 2; i++) {
            if (inpuStr.charAt(i) != inpuStr.charAt(inpuStr.length() - 1 - i))
                return false;
        }
        return true;    
        }
    }
