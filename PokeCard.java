import java.util.ArrayList;

public class PokeCard {
    int value;
    String colour;

    public PokeCard(int value, String colour) {
        this.value = value;
        this.colour = colour;
    }
  public String toString(){
        return String.format("[%d,%s]",value,colour);
  }
    //equals 判断两个对象是否相等
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        //返回obj对象能否被 PokeCard 类型的引用
        //obj对象的类型是不是 PokeCard 类型的小类型
        if (!(obj instanceof PokeCard)) {
            return false;
        }
        PokeCard other = (PokeCard) obj;
        return this.value == other.value && this.colour.equals(other.colour);
    }
}

