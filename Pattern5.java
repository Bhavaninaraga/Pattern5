public class Pattern5 {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if(i%2==0 && j%2==0){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}
