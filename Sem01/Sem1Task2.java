// Задание No2
// 📌 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.


public class Sem1Task2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxCount) {  // 1) maxCount = count > maxCount ? count: maxCount;
                    maxCount = count;    // 2) maxCount = Math.max(count, maxCount);
                }
            } else {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
