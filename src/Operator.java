public class Operator extends Token {
    private Operation operation;

    public Operator(String s){
        switch(s) {
            case "PLUS":
                operation = Operation.PLUS;
                break;
            case "MINUS":
                operation = Operation.MINUS;
                break;
            case "MULTIPLY":
                operation = Operation.MULTIPLY;
                break;
            case "DIVIDE":
                operation = Operation.DIVIDE;
                break;
            default:
                System.out.println("Enter input");
        }
    }

    public void accept(CalculatorVisitor visitor){
        super.accept(visitor);
    }

    public Operation getOperation(){
        return operation;
    }

}
