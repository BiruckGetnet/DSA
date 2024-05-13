package q6;

public class Main {
    public static void main(String[] args) {
        int[] array={3,7,1,9,4};
        int index=new int;
        deleteElement(array,index);




    }
    public static int deleteElement(int[] array, int index){
        int newArray=new int[];
        for (int i=0; i<index; i++){
            newArray[i]=array[i];
        }
        for(int i=index; i<array.length-1; i++){
            newArray[i]=array[i+1];
        }
    }

}
