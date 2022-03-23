import List.LinkedStack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        Token tal1 = new Operand(10);
        Token tal2 = new Operand(2);
        Token plusToken = new Operator("DIVIDER");

        ArrayList<Token> tokenList = new ArrayList<>();
        tokenList.add(tal1);
        tokenList.add(tal2);
        tokenList.add(plusToken);
        LinkedStack<Token> stack = new LinkedStack<Token>();
        System.out.println("Main input: "+ stack);

        c.evaluateExpression(tokenList);
    }
}
