import java.util.Scanner;

public class WhileKelipatan20 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;
        double rata_rata = 0;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <= 50){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
                rata_rata= (double) jumlah/counter;
            }
            i++;        
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata rata dari seluruh kelipatan bilangan adalah %.2f", rata_rata); 
    }
}
