public class ArrayCommonElementFinder {
    public static void main(String[] args){
        String[] stringArray1 = {"A", "B", "C", "D", "E"};
        String[] stringArray2 = {"F", "A", "G", "C", "H"};

        System.out.println(ArrCommonElementFinder(stringArray1, stringArray2));
    }
    public static String ArrCommonElementFinder(String[] array1, String[] array2){
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < array1.length; i++){
            for(int x = 0; x < array2.length; x++){
                if (array1[i].compareTo(array2[x])==0){
                    a.append(array2[x]);
                }
            }
        }
        return a.toString();
    }
}