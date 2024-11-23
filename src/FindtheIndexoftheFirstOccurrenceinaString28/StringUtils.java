package FindtheIndexoftheFirstOccurrenceinaString28;

public class StringUtils {

    public static int Strstr(String haystack, String needle) {
        // Если needle пустая строка, возвращаем haystack
        int res = -1;

        // Проходим по каждой позиции в haystack
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            boolean found = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                res = i;
            }
        }

        // Если needle не нашлась, возвращаем null
        return res;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = Strstr(haystack, needle);
        System.out.println(result); // Выведет: world
    }
}