package www.wangchong.homework;

/**
 * 泛型重构线性表
 */
public class GenericitySequence<T> implements Sequence{
    private static final int DEFAULT_CAPACITY = 10;
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 6;
    private T[] elementData;
    int size;

    public GenericitySequence() {

    }

    @Override
    public <T> void add(T data) {

    }

    @Override
    public <T> T remove(T index) {
        return null;
    }

    @Override
    public <T> T get(int index) {
        return null;
    }

    @Override
    public <T> boolean contains(T data) {
        return false;
    }

    @Override
    public <T> T set(int index, T newData) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public <T> T[] toArray() {
        return null;
    }
}
