public class Majiang implements Comparable<Majiang>{
    public String colour;
    public String value;
    
    public Majiang(String colour,String value){
        this.colour = colour;
        this.value = value;
    }
    
    @Override
            public int compareTo(Majiang o) {
        return this.value.compareTo(o.value);
    }

}