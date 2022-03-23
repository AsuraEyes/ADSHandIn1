import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client client;
    @BeforeEach
    void setUp(){
        client = new Client();
    }

    @Test
    void evaluateOneOperationExpression() {
        ArrayList<Token> expressions = new ArrayList<>();
        Operator operator = new Operator("PLUS");
        Operand op1 = new Operand(10);
        Operand op2 = new Operand(2);
        expressions.add(op1);
        expressions.add(op2);
        expressions.add(operator);

        assertEquals(12, client.evaluateExpression(expressions));
    }

    @Test
    void evaluateMultipleExpressions() {
        ArrayList<Token> expressions = new ArrayList<>();
        Operator operator = new Operator("MINUS");
        Operand op1 = new Operand(24);
        Operand op2 = new Operand(6);
        expressions.add(op1);
        expressions.add(op2);
        Operand op3 = new Operand(3);
        expressions.add(op3);
        expressions.add(operator);
        Operator operator2 = new Operator("DIVIDE");
        expressions.add(operator2);

        assertEquals(8, client.evaluateExpression(expressions));
    }
}