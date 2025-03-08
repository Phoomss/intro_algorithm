import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class SortArray {
    public static void main(String[] args) {
        // ---------- จัดเรียงอาร์เรย์ตัวเลข ----------
        int[] numArray = { 51, 3, 8, 20, 14 };
        Arrays.sort(numArray);

        int numIndex = Arrays.binarySearch(numArray, 51);
        System.out.println("Sorted Numeric Array:");
        for (int num : numArray) {
            System.out.println(num);
        }
        System.out.println("Index of 51: " + numIndex);

        System.out.println("\n---------------------\n");

        // ---------- จัดเรียงอาร์เรย์ข้อความ (ตัวอักษรอังกฤษ) ----------
        String[] strArray = { "Justins", "jame", "johe", "am", "albit", "cambal" };
        Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER); // เรียงแบบไม่แยกตัวพิมพ์เล็ก-ใหญ่

        int strIndex = Arrays.binarySearch(strArray, "Justins", String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted String Array:");
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("Index of 'Justins': " + strIndex);

        System.out.println("\n---------------------\n");

        // ---------- จัดเรียงอาร์เรย์ข้อความภาษาไทย ----------
        String[] thaiNames = { "ไก่", "หมู", "วัว", "แกะ", "แมว", "หมา" };

        Collator myCollator = Collator.getInstance(new Locale("th", "TH"));
        Arrays.sort(thaiNames, myCollator);

        int thaiIndex = Arrays.binarySearch(thaiNames, "แมว", myCollator);
        System.out.println("Sorted Thai String Array:");
        for (String name : thaiNames) {
            System.out.println(name);
        }
        System.out.println("Index of 'แมว': " + thaiIndex);
    }
}
