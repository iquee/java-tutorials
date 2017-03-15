An application that creates an instance of Thread must provide the code that will run in that thread. There are two ways to do this:
- Provide a Runnable object. The Runnable interface defines a single method, run, meant to contain the code executed in the thread.
- Subclass of Thread. The Thread class itself implements Runnable, though its run method does nothing. An application can subclass Thread and override its own implementation of run.
The method .start() initiate a new thread. It's more common to use a implementation of Runnable interface.

By default we can't control the execution order of threads. This controller is manipulated by JVM