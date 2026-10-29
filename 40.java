import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== РЕШЕНИЕ 40 РЕКУРСИВНЫХ ЗАДАЧ НА JAVA ===\n");

        // 1. Вывод от 1 до N
        System.out.print("1. Вывод от 1 до 5: ");
        print1ToN(5);
        System.out.println();

        // 2. Вывод от N до 1
        System.out.print("2. Вывод от 5 до 1: ");
        printNTo1(5);
        System.out.println();

        // 3. Сумма чисел от 1 до N
        System.out.println("3. Сумма чисел от 1 до 5: " + sum1ToN(5));

        // 4. Факториал
        System.out.println("4. Факториал 5!: " + factorial(5));

        // 5. Возведение в степень
        System.out.println("5. Power (2^10): " + power(2, 10));

        // 6. Сумма цифр
        System.out.println("6. Сумма цифр 583: " + sumOfDigits(583));

        // 7. Количество цифр
        System.out.println("7. Кол-во цифр 12345: " + countDigits(12345));

        // 8. Произведение цифр
        System.out.println("8. Произведение цифр 234: " + productOfDigits(234));

        // 9. Максимальная цифра
        System.out.println("9. Макс. цифра 583: " + maxDigit(583));

        // 10. Минимальная цифра
        System.out.println("10. Мин. цифра 583: " + minDigit(583));

        // 11. Числа Фибоначчи
        System.out.println("11. 7-е число Фибоначчи: " + fibonacci(7));

        // Массив для тестов
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};

        // 12. Сумма элементов массива
        System.out.println("12. Сумма элементов массива: " + arraySum(arr, 0));

        // 13. Максимум массива
        System.out.println("13. Максимум массива: " + arrayMax(arr, 0));

        // 14. Минимум массива
        System.out.println("14. Минимум массива: " + arrayMin(arr, 0));

        // 15. Подсчёт чётных чисел
        System.out.println("15. Кол-во чётных чисел в массиве: " + countEven(arr, 0));

        // 16. Проверка на возрастание
        int[] sortedArr = {1, 2, 3, 4, 5};
        System.out.println("16. Массив [1,2,3,4,5] отсортирован? " + isSortedAscending(sortedArr, 0));

        // 17. НОД
        System.out.println("17. НОД(48, 18): " + gcd(48, 18));

        // 18. НОК
        System.out.println("18. НОК(12, 18): " + lcm(12, 18));

        // 19. Перевод в двоичную систему
        System.out.print("19. Двоичное представление 13: ");
        toBinary(13);
        System.out.println();

        // 20. Сумма квадратов
        System.out.println("20. Сумма квадратов от 1 до 4: " + sumOfSquares(4));

        // 21. Переворот строки
        System.out.println("21. Переворот 'Java': " + reverseString("Java"));

        // 22. Проверка палиндрома
        System.out.println("22. 'казак' - палиндром? " + isPalindrome("казак"));

        // 23. Подсчёт символов
        System.out.println("23. Кол-во 'a' в 'banana': " + countChar("banana", 'a', 0));

        // 24. Подсчёт гласных
        System.out.println("24. Кол-во гласных в 'Hello World': " + countVowels("Hello World", 0));

        // 25. Удаление символа
        System.out.println("25. Удалить 'a' из 'banana': " + removeChar("banana", 'a'));

        // 26. Замена символов
        System.out.println("26. Заменить 'a' на 'o' в 'banana': " + replaceChar("banana", 'a', 'o'));

        // 27. Проверка одинаковых символов
        System.out.println("27. 'aaaaa' из одинаковых? " + isAllSameChars("aaaaa", 0));

        // 28. Подсчёт слов
        System.out.println("28. Кол-во слов в 'Java recursion practice exercise': " + countWords("Java recursion practice exercise"));

        // 29. Проверка анаграммы по частотам
        System.out.println("29. 'silent' и 'listen' анаграммы? " + isAnagram("silent", "listen"));

        // 30. Сравнение строк посимвольно
        System.out.println("30. Сравнение 'test' и 'test': " + compareStrings("test", "test", 0));

        // 31. Быстрое возведение в степень
        System.out.println("31. Fast Power (2^10): " + fastPower(2, 10));

        // 32. Бинарный поиск
        int[] sortedForBS = {10, 20, 30, 40, 50, 60};
        System.out.println("32. Бинарный поиск 40: индекс " + binarySearch(sortedForBS, 40, 0, sortedForBS.length - 1));

        // 33. Сортировка слиянием
        int[] mergeArr = {5, 2, 8, 1, 9};
        mergeSort(mergeArr, 0, mergeArr.length - 1);
        System.out.println("33. Merge Sort: " + Arrays.toString(mergeArr));

        // 34. Быстрая сортировка
        int[] quickArr = {10, 7, 8, 9, 1, 5};
        quickSort(quickArr, 0, quickArr.length - 1);
        System.out.println("34. Quick Sort: " + Arrays.toString(quickArr));

        // 35. Ханойская башня
        System.out.println("35. Ханойская башня (3 диска):");
        hanoiTower(3, 'A', 'C', 'B');

        // 36. Все подмножества
        System.out.println("36. Все подмножества [1, 2]:");
        printSubsets(new int[]{1, 2}, 0, new ArrayList<>());

        // 37. Перестановки строки
        System.out.println("37. Все перестановки 'ABC':");
        printPermutations("ABC", "");

        // 38. Задача о лабиринте
        int[][] maze = {
            {0, 1, 0, 0},
            {0, 0, 0, 1},
            {1, 0, 1, 0},
            {0, 0, 0, 0}
        };
        boolean[][] visited = new boolean[4][4];
        System.out.println("38. Путь в лабиринте существует? " + solveMaze(maze, 0, 0, 3, 3, visited));

        // 39. N ферзей
        System.out.println("39. Решения для 4 ферзей:");
        solveNQueens(new int[4], 0, 4);

        // 40. Генератор выражений
        System.out.println("40. Выражения из '123' со значением 6:");
        generateExpressions("123", 6, 0, 0, 0, "");
    }

    // --- РЕАЛИЗАЦИЯ ВСЕХ 40 ЗАДАЧ ---

    // 1. Вывод от 1 до N
    public static void print1ToN(int n) {
        if (n < 1) return;
        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    // 2. Вывод от N до 1
    public static void printNTo1(int n) {
        if (n < 1) return;
        System.out.print(n + " ");
        printNTo1(n - 1);
    }

    // 3. Сумма чисел от 1 до N
    public static int sum1ToN(int n) {
        if (n <= 1) return n;
        return n + sum1ToN(n - 1);
    }

    // 4. Факториал
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 5. Возведение в степень
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // 6. Сумма цифр
    public static int sumOfDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    // 7. Количество цифр
    public static int countDigits(int n) {
        n = Math.abs(n);
        if (n < 10) return 1;
        return 1 + countDigits(n / 10);
    }

    // 8. Произведение цифр
    public static int productOfDigits(int n) {
        n = Math.abs(n);
        if (n < 10) return n;
        return (n % 10) * productOfDigits(n / 10);
    }

    // 9. Максимальная цифра
    public static int maxDigit(int n) {
        n = Math.abs(n);
        if (n < 10) return n;
        return Math.max(n % 10, maxDigit(n / 10));
    }

    // 10. Минимальная цифра
    public static int minDigit(int n) {
        n = Math.abs(n);
        if (n < 10) return n;
        return Math.min(n % 10, minDigit(n / 10));
    }

    // 11. Числа Фибоначчи
    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 12. Сумма элементов массива
    public static int arraySum(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + arraySum(arr, index + 1);
    }

    // 13. Максимум массива
    public static int arrayMax(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.max(arr[index], arrayMax(arr, index + 1));
    }

    // 14. Минимум массива
    public static int arrayMin(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];
        return Math.min(arr[index], arrayMin(arr, index + 1));
    }

    // 15. Подсчёт чётных чисел
    public static int countEven(int[] arr, int index) {
        if (index == arr.length) return 0;
        int count = (arr[index] % 2 == 0) ? 1 : 0;
        return count + countEven(arr, index + 1);
    }

    // 16. Проверка на возрастание
    public static boolean isSortedAscending(int[] arr, int index) {
        if (index >= arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isSortedAscending(arr, index + 1);
    }

    // 17. НОД
    public static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    // 18. НОК
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / gcd(a, b);
    }

    // 19. Перевод в двоичную систему
    public static void toBinary(int n) {
        if (n > 1) toBinary(n / 2);
        System.out.print(n % 2);
    }

    // 20. Сумма квадратов
    public static int sumOfSquares(int n) {
        if (n <= 1) return n * n;
        return n * n + sumOfSquares(n - 1);
    }

    // 21. Переворот строки
    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // 22. Проверка палиндрома
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    // 23. Подсчёт символов
    public static int countChar(String str, char c, int index) {
        if (index == str.length()) return 0;
        int match = (str.charAt(index) == c) ? 1 : 0;
        return match + countChar(str, c, index + 1);
    }

    // 24. Подсчёт гласных
    public static int countVowels(String str, int index) {
        if (index == str.length()) return 0;
        char ch = Character.toLowerCase(str.charAt(index));
        boolean isVowel = "aeiouyаеёиоуыэюя".indexOf(ch) != -1;
        return (isVowel ? 1 : 0) + countVowels(str, index + 1);
    }

    // 25. Удаление символа
    public static String removeChar(String str, char c) {
        if (str.isEmpty()) return "";
        char first = str.charAt(0);
        String rest = removeChar(str.substring(1), c);
        return (first == c) ? rest : first + rest;
    }

    // 26. Замена символов
    public static String replaceChar(String str, char target, char replacement) {
        if (str.isEmpty()) return "";
        char first = str.charAt(0);
        char newChar = (first == target) ? replacement : first;
        return newChar + replaceChar(str.substring(1), target, replacement);
    }

    // 27. Проверка одинаковых символов
    public static boolean isAllSameChars(String str, int index) {
        if (str.length() <= 1 || index >= str.length() - 1) return true;
        if (str.charAt(index) != str.charAt(index + 1)) return false;
        return isAllSameChars(str, index + 1);
    }

    // 28. Подсчёт слов
    public static int countWords(String str) {
        str = str.trim();
        if (str.isEmpty()) return 0;
        int spaceIndex = str.indexOf(' ');
        if (spaceIndex == -1) return 1;
        return 1 + countWords(str.substring(spaceIndex).trim());
    }

    // 29. Проверка анаграммы по частотам
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> counts1 = new HashMap<>();
        Map<Character, Integer> counts2 = new HashMap<>();
        countCharFrequencies(s1, 0, counts1);
        countCharFrequencies(s2, 0, counts2);
        return counts1.equals(counts2);
    }

    private static void countCharFrequencies(String s, int index, Map<Character, Integer> map) {
        if (index == s.length()) return;
        char c = s.charAt(index);
        map.put(c, map.getOrDefault(c, 0) + 1);
        countCharFrequencies(s, index + 1, map);
    }

    // 30. Сравнение строк
    public static boolean compareStrings(String s1, String s2, int index) {
        if (s1.length() != s2.length()) return false;
        if (index == s1.length()) return true;
        if (s1.charAt(index) != s2.charAt(index)) return false;
        return compareStrings(s1, s2, index + 1);
    }

    // 31. Быстрое возведение в степень
    public static long fastPower(long a, long n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            long half = fastPower(a, n / 2);
            return half * half;
        } else {
            return a * fastPower(a, n - 1);
        }
    }

    // 32. Бинарный поиск
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] > target) return binarySearch(arr, target, low, mid - 1);
        return binarySearch(arr, target, mid + 1, high);
    }

    // 33. Рекурсивная сортировка слиянием
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { arr[k] = L[i]; i++; }
            else { arr[k] = R[j]; j++; }
            k++;
        }
        while (i < n1) { arr[k] = L[i]; i++; k++; }
        while (j < n2) { arr[k] = R[j]; j++; k++; }
    }

    // 34. Быстрая сортировка
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }

    // 35. Ханойская башня
    public static void hanoiTower(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("   Переместить диск 1 с " + from + " на " + to);
            return;
        }
        hanoiTower(n - 1, from, aux, to);
        System.out.println("   Переместить диск " + n + " с " + from + " на " + to);
        hanoiTower(n - 1, aux, to, from);
    }

    // 36. Все подмножества множества
    public static void printSubsets(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println("   " + current);
            return;
        }
        printSubsets(arr, index + 1, current);
        current.add(arr[index]);
        printSubsets(arr, index + 1, current);
        current.remove(current.size() - 1);
    }

    // 37. Все перестановки строки
    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println("   " + ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutations(ros, ans + ch);
        }
    }

    // 38. Задача о лабиринте
    public static boolean solveMaze(int[][] maze, int r, int c, int targetR, int targetC, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= maze.length || c >= maze[0].length || maze[r][c] == 1 || visited[r][c]) {
            return false;
        }
        if (r == targetR && c == targetC) return true;
        visited[r][c] = true;

        if (solveMaze(maze, r + 1, c, targetR, targetC, visited) ||
            solveMaze(maze, r - 1, c, targetR, targetC, visited) ||
            solveMaze(maze, r, c + 1, targetR, targetC, visited) ||
            solveMaze(maze, r, c - 1, targetR, targetC, visited)) {
            return true;
        }

        visited[r][c] = false;
        return false;
    }

    // 39. Задача о N ферзях
    public static void solveNQueens(int[] board, int row, int n) {
        if (row == n) {
            System.out.println("   " + Arrays.toString(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafeQueen(board, row, col)) {
                board[row] = col;
                solveNQueens(board, row + 1, n);
            }
        }
    }

    private static boolean isSafeQueen(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    // 40. Рекурсивный генератор выражений
    public static void generateExpressions(String num, int target, int pos, long eval, long multed, String expr) {
        if (pos == num.length()) {
            if (eval == target) {
                System.out.println("   " + expr);
            }
            return;
        }
        for (int i = pos; i < num.length(); i++) {
            if (i != pos && num.charAt(pos) == '0') break;
            long cur = Long.parseLong(num.substring(pos, i + 1));
            if (pos == 0) {
                generateExpressions(num, target, i + 1, cur, cur, expr + cur);
            } else {
                generateExpressions(num, target, i + 1, eval + cur, cur, expr + "+" + cur);
                generateExpressions(num, target, i + 1, eval - cur, -cur, expr + "-" + cur);
                generateExpressions(num, target, i + 1, eval - multed + multed * cur, multed * cur, expr + "*" + cur);
            }
        }
    }
}