public class Main {

    public static void main(String[] args) {
rev("hello");
    }
    public static void rev(String word){
        word="hello";
        String rev="";
        char a[]=word.toCharArray();
        int length=word.length();
        for(int i=length-1;i>=0;i--){
            rev+=a[i];
        }
        System.out.println(rev);
    }
}
