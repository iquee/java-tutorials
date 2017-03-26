package br.com.luiztaira.introduction;

class Box<T> {

    private T t;

    public void setObject(T t) {
        this.t = t;
    }

    public T getObject() {
        return this.t;
    }
}

class TestGenerics {

    public static void main(String[] args) {
        Box<Integer> box = new Box();
        box.setObject(1);

        Box<String> box2 = new Box();
        box2.setObject("hello");

        System.out.println(box.getObject());
        System.out.println(box2.getObject());
    }
}
