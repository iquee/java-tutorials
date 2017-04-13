# Adapter

> This pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

- Convert the interface of a class into another interface that clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
- Wrap an existing class with a new interface.
- Impedance match an old component to a new system

- Examples of Adapter Design Patterns in Java libraries
    - java.util.Arrays#asList()
    - java.util.Collections#list()
    - java.io.InputStreamReader(InputStream) (returns a Reader)
    - java.io.OutputStreamWriter(OutputStream) (returns a Writer)