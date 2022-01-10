package design.pattern.structional.adapter;

public class EnglishVietnameseDictionaryAdapter implements VietnameseTarget {
    EnglishDictionary englishDictionary = new EnglishDictionary();
    VietnameseDictionary vietnameseDictionary = new VietnameseDictionary();

    @Override
    public void validate(String word) {
        englishDictionary.exist(word);
    }

    @Override
    public void translate(String word) {
        vietnameseDictionary.translate(word);
    }
}
