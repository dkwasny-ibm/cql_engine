package org.opencds.cqf.cql.elm.execution;

import org.opencds.cqf.cql.execution.Context;

/*
Upper(argument String) String

The Upper operator returns the upper case of its argument.
If the argument is null, the result is null.
*/

public class UpperEvaluator extends org.cqframework.cql.elm.execution.Upper {

    public static Object upper(Object operand) {
        if (operand == null) {
            return null;
        }

        if (operand instanceof String) {
            return ((String) operand).toUpperCase();
        }
        throw new IllegalArgumentException(String.format("Cannot perform Upper operation with argument of type '%s'.", operand.getClass().getName()));
    }

    @Override
    public Object evaluate(Context context) {
        Object operand = getOperand().evaluate(context);

        return upper(operand);
    }
}
