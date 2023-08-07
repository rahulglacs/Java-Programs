public class pattern {
            public static void main(String[] args){
              /*  int n=4;
                int m=5;
                for (int i=1; i<=n; i++) {
                    for (int j=1; j<=m; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                

                //question 2

                int n=4;
                int m=5;
                for (int i=1; i<=n; i++) {
                    for ( int j=1; j<=m; j++) {
                        if(i==1 || j==1 || i==n || j==m) {
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                     System.out.println();
                }
                

                // questions 3

                int n=4;
                for(int i=1; i<=n; i++) {
                    for (int j=1; j<=i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                // question 4

                int n=4;
                for(int i=n; i>=n; i--) {
                    for(int j=1; j<=i; j++) {j 
                        System.out.print("*");
                    }
                    System.out.println();
                }
                */

                // question 5

                int n=4;
                for (int i=1; i<=n; i++) {
                    for (int j=1; j<=(n-i); j++) {
                        System.out.print(" ");
                        
            }  
              
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

        
        
            
