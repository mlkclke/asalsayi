public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar :");

        for (int i = 2; i <= 100; i++) {
            if (asalSayi(i)) {
                System.out.println(i);
            }
        }
    }

    public static
    boolean asalSayi(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }
}