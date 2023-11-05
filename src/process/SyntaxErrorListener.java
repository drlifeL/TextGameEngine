package process;


import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

import java.util.Collections;
import java.util.List;

/**
 * @author TODO
 * @since 2023/10/21
 */
public class SyntaxErrorListener extends BaseErrorListener {


    private static boolean hasError = false;

    public static boolean hasError() {
        return hasError;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        hasError = true;
        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Syntax Error!");
        System.err.println("Token " + "\"" + ((Token) offendingSymbol).getText() + "\""
                +
                "（line " + line + " , column " + (charPositionInLine + 1) + " )"
                +
                ": " + msg
        );
        System.err.println("Rule Stack: " + stack);

    }

}
