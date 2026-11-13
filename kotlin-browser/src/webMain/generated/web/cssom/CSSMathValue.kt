// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSMathValue`** interface of the CSS Typed Object Model API is the base interface for objects representing complex numeric values produced by the CSS calc(), min(), max(), and clamp() functions.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue)
 */
open external class CSSMathValue
private constructor() :
    CSSNumericValue {
    /**
     * The **`operator`** read-only property of the CSSMathValue interface returns the operator that the current subtype represents. For example, if the current CSSMathValue subtype is CSSMathSum, this property will return the string "sum".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathValue/operator)
     */
    open val operator: CSSMathOperator
}
