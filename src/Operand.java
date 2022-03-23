public class Operand extends Token{

    private int value;

    public Operand(int number){
        value = number;
    }

    public void accept(CalculatorVisitor visitor){
        super.accept(visitor);
    }

    public int getValue(){
        return value;
    }


}
