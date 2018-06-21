
public interface BT<T> {
	boolean empty();

	boolean full();

	boolean find(Relative rel);

	T retrieve();

	void update(T val);

	boolean insert(T val, Relative rel);

	void deleteSub();

	int depth();
}
