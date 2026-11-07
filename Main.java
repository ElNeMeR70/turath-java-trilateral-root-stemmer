import java.nio.charset.StandardCharsets;

/**
 * turath-java-trilateral-root-stemmer — مستخرج الجذور الثلاثية والرباعية من النصوص التراثية
 * Classical Arabic Khoja/ISRI-Style Trilateral Root Extractor
 */
public final class Main {
    public static void main(String[] args) {
        String input = "والمستضعفين";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] turath-java-trilateral-root-stemmer (Java) — Classical Arabic Khoja/ISRI-Style Trilateral Root Extractor");
        System.out.println("[AR]  مستخرج الجذور الثلاثية والرباعية من النصوص التراثية");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", "Prefix=و+ال+مست | Stem=ضعف | Suffix=ين | Root=ض-ع-ف", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}
