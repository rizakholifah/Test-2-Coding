public class Soal2{
    public static void main(String[] args){
        for(int i = 1;i<=100;i++){
            if(i%2==0 && i%3==0){
                System.out.print("INDONESIA ");
            }
            else if(i%2==1){
                System.out.print("Ganjil ");
            }
            else if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}