package FindtheIndexoftheFirstOccurrenceinaString28;

public class FindtheIndexoftheFirstOccurrenceinaString {
    private static final int d = 256; // Количество возможных символов (для ASCII это 256)
    private static final int q = 101; // Простое число для уменьшения коллизий в хэшировании

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // если needle пустая, возвращаем 0
        }

        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen > hLen) {
            return -1; // если needle больше чем haystack
        }

        int pHash = 0; // хэш для needle
        int tHash = 0; // хэш для haystack
        int h = 1;

        // Вычисляем h = pow(d, nLen-1) % q
        for (int i = 0; i < nLen - 1; i++) {
            h = (h * d) % q;
        }

        // Вычисляем начальный хэш для needle и первой подстроки haystack
        for (int i = 0; i < nLen; i++) {
            pHash = (d * pHash + needle.charAt(i)) % q;
            tHash = (d * tHash + haystack.charAt(i)) % q;
        }


        System.out.println(pHash);
        System.out.println(tHash);


        for (int i = 0; i <= hLen - nLen; i++) {
            // Если хэши совпадают, проверяем символы
            if (pHash == tHash) {
                boolean found = true;
                for (int j = 0; j < nLen; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    System.out.println(i + " i");
                    return i;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
