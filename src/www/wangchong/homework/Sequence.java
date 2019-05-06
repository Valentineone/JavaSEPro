package www.wangchong.homework;

public interface Sequence {
    <T> void  add(T data);
    <T> T remove(T index);
    <T> T get(int index);
    <T> boolean contains(T data);
    <T> T set(int index, T newData);
    int size();
    void clear();
    <T> T[] toArray();
}
