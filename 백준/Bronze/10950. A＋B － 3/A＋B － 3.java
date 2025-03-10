import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];
        int b[] = new int[num];
        for(int i=0; i<num; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        sumNum(a,b);
    }

    static void sumNum( int a[], int b[]){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i] + b[i]);
        }
    }

}
