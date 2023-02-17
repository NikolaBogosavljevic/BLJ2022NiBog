public class Main {
    public static void main(String[] args) {
        String[] wordList = {"Rahmen", "sind", "toll!"};
        frameWordList(wordList);
    }
    public static void frameWordList(String[] wordList){
        System.out.println("*************");
        for (int i = 0; i < wordList.length; i++){
            System.out.println("*\t"+wordList[i]+"\t*");
        }
        System.out.println("*************");
    }
}
