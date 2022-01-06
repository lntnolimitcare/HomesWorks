package abstruction;

public abstract class Shape {// I can not create object interface & abstruct class
    int color;
    abstract void drawing();

    public void fill(){// this is   zero percent abstruction
      System.out.println(" Non abstract method in abstract class");
    }
}
