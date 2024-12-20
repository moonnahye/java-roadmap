package generic.animal;

public class Animal {
    private String name;
    private int size;

    public Animal(String name, int size) {
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void sound(){
        System.out.println("동물 울음 소리");
    }

    @Override
    public String toString() {
        return "Anima{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}