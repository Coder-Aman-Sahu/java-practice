class Patterns {
    public static void hollowRectangle(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void half_pyramid(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
       
    }
    public static void half_pyramid_num(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floyd_triangle(int row){
        int num=0;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                num++;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        hollowRectangle(5,12);
        half_pyramid(8);
        half_pyramid_num(5);
        floyd_triangle(5);
    }
}
