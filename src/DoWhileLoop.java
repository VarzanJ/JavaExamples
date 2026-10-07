public class DoWhileLoop {
    static void main(String[] args) {

        int a = 1;

        do {
            if (a % 2 == 1 ){
                System.out.println(a);
            }

            a++;

        }
        while (a <= 10);
    }
}
