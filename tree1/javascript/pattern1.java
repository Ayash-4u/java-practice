public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        int space=1; int star=n/2 +1;
    
        for(int i = 1; i<=n ; i++){
            for(int k = 1; k<=star; k++){
                System.out.print("*\t"); }
            for(int k =0; k< space ; k++){
                System.out.print("\t"); }
                for(int k = 1 ; k<=star; k++){
                    System.out.print("*\t"); }
               
                 
           if(i<=n/2){
            
          
                star--;
                space+=2;
                
           }
           else{
           
                star++;
                space -= 2;
                
           }
           System.out.println();
           
    }
    
}
}
