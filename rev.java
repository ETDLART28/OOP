public class rev {
    public static void main(String[]args){
        System.out.println("kasakya goul");
      
        double[][] numb1={{100,69,001,16},{67,3.16,22}}; //fixed missing number in array
        
            for (double[] num:numb1){
                for(double n:num){
                    System.out.print(n); 
                }
            System.out.println(); //removed printing of array memory address and added next line}
      System.out.println(numb1[0][1]); 

            boolean [][] array=
            {{true,false,true},
            {false,true,false}};

            int rowsLenght=array.length;
            int colsLenght=array[0].length;

            System.out.print("rows" +rowsLenght);
            System.out.print("cols"+colsLenght);    
            System.out.println();
            
            for (int i =0;i< rowsLenght;i++){
                for(int j= 0; j< colsLenght;j++){
                    if (array[i][j]){
                        System.out.print(" T ");}
                        else{
                            System.out.print(" F ");}
                        }

                     System.out.println();
                
                    
    }}}
}


