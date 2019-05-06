package www.wangchong.java;

public class MethodReferences {
    @FunctionalInterface
    interface IUtil<P,R> {
        public R switchPara(P p);
    }
    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
