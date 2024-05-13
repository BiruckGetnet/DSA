package q4;

public class Main {
    public static void main(String[] args) {
        char[] array={'d','g','h','t'};

        bubblesort(array);
        for (char i:array){
            System.out.print(i);
        }


    }
    public static void bubblesort(char[] array){
        for (int i=0; i<array.length-1; i++){
            for (int j=0; j<array.length-i-1; j++){
                if(array[j]> array[j+1]){

                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;


                }
            }
        }

    }
}
