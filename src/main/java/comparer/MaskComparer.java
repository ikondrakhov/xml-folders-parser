package comparer;

public class MaskComparer extends Comparer {
    @Override
    public Boolean compare(String s) {
        return s.matches(this.searchValue);
    }
}