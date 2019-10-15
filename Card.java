public class Card {
   public int value;
   public String colour;

    public Card(int value,String colour){
        this.colour = colour;
        this.value = value;
    }

    @Override
    public int hashCode(){
        return value^colour.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
       
        if(obj == null){
            return false;
        }
        //if (obj.getClass() == this.getClass())
        if(!(obj instanceof Card)){
            return false;
        }

        Card c = (Card)obj;
        return value == c.value && colour.equals(c.colour);
    }
}
