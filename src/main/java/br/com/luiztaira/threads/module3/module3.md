Thread safety is a computer programming concept applicable to multi-threaded code.
Thread-safe code only manipulates shared data structures in a manner that guarantees safe execution by multiple threads.

Others interfaces that implements Thread-safe:

List<?> list = new Vector<?>();
Map mapaThreadSafe = new Hashtable();
Map mapaThreadSafe = new ConcurrentHashMap();
Set conjunto = Collections.synchronizedSet(new HashSet());

About Queue interface:
- ArrayBlockingQueue is an implementation of thread-safe