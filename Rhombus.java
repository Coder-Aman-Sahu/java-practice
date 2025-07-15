class Rhombus {
    public static void solid_rhombus(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                if(i==1 || i==row || j==1 || j==row){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    public static void diamond(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row;i>=1;i--){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus(5);
        hollow_rhombus(5);
        diamond(5);
    }
}
