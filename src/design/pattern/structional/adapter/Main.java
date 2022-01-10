package design.pattern.structional.adapter;

public class Main {
    public static void main(String[] args) {
       EnglishVietnameseDictionaryAdapter adapter=new EnglishVietnameseDictionaryAdapter();
       adapter.translate("hello");
    }
}
