package day6;

public class textProsseor {
    public static void main(String[] args) {
//        countWords("My name is rahma kamal");
//        reverseText("Rahma");
        addSpace("MyNameIsRahmaKamal");
    }
    public static void countWords(String text){
        String [] words =text.split(" ");
        System.out.println("the number of words is "+words.length);
        for (String word:words){
            System.out.println(word);
        }

    }
    public static void reverseText(String text){
        for (int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }

    }
    public static void addSpace(String text){
        StringBuilder modifiedText =new StringBuilder(text);
        for(int i=1;i<modifiedText.length();i++){
            if(Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;

            }
        }
        System.out.println(modifiedText);

    }
}
