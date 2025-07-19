public class pattern {
    //hallow Rectangle
    public static void hallowR(int row,int col){
        for(int i=1 ;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i ==1 ||i==4 || j==1 ||j==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
           System.out.println();
        }
    }

    public static void rightT(int row){
        for (int i =1 ; i<= row ; i++){
            for(int j= 1; j <= (row - i);j++){
                System.out.print(" ");
            }
            for(int k= 1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void oneP(int col){
        for(int i =0; i<col;i++){
            for(int j=1; j <=col-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }

    public static void floyd(int row){
        int sum = 0;
        for(int i = 1; i<=row;i++){
            for(int j= 1; j<=i;j++){
                sum = sum +1;
                System.out.print(sum +" ");
            }
            System.out.print("\n");
        }
    }

    public static void zeroOneT(int row){
        for (int i = 1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 ==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }


    public static void butterfly(int row){
        int gap = row-2;
        int sumu = 1;
        for(int i =1;i<=row;i++){

            if(i<=(row/2)){
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j = 1;j<=gap;j++){
                    System.out.print(" ");
                    
                }
                gap = gap-2;
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            if(row/2<i && i<=row ){
                gap = gap+2;
                
                for(int j=1;j<=(i-sumu);j++){
                    System.out.print("*");
                }
                for(int j=1;j<=gap;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(i-sumu);j++){
                    System.out.print("*");
                }
                System.out.println();
                sumu = sumu+2;
            }
              
        }
    }

    public static void hRohmbus(int n){
       
        for(int i =1;i<=n;i++){
            for(int g = 1;g <=(n-i);g++){
                System.out.print(" ");
            }
            if(i==1 || i ==n){
                for(int j=n;j>0;j--){
                System.out.print("*");
            }
            }else{
                
                    System.out.print("*");
                    for(int g =1;g<=(n-2);g++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                
            }
            
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i = 1;i<=n;i++){
            for(int g=1;g<=(n-i);g++){
                System.out.print(" ");
            }
            for(int j= 1;j<=(i+(i-1));j++){
                System.out.print("*");
            }
            for(int g=1;g<=(n-(i-1));g++){
                System.out.print(" ");
            }
            System.out.println();
        }


        for(int i = n;i>0;i--){
            for(int g=1;g<=(n-(i-1));g++){
                System.out.print(" ");
            }
            for(int j= 1;j<=(i+(i-1));j++){
                System.out.print("*");
            }
            for(int g=1;g<=(n-i);g++){
                System.out.print(" ");
            }
            
            
            System.out.println();
        }
    }





    public static void main (String [] args){
        diamond(4);

    }
}
