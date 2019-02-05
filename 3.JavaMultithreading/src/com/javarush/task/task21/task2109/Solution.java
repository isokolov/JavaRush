package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof A)) return false;

            A a = (A) o;

            if (getI() != a.getI()) return false;
            return getJ() == a.getJ();
        }

        @Override
        public int hashCode() {
            int result = getI();
            result = 31 * result + getJ();
            return result;
        }

        @Override
        public A clone() throws CloneNotSupportedException {
            return (A)super.clone();
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof B)) return false;
            if (!super.equals(o)) return false;

            B b = (B) o;

            return getName().equals(b.getName());
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + getName().hashCode();
            return result;
        }

        @Override
        public B clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B implements Cloneable {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        @Override
        public C clone() /*throws CloneNotSupportedException*/ {
            C c = new C(getI(), getJ(), getName());
            return c;
        }


    }

    public static void main(String[] args) {
        /*A a = new A(3, 2);
        B b = new B(4, 5, "ttt");
        C c = new C(6, 7, "eee");
        C d = c.clone();*/
    }
}
