// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSMathSum`** interface of the CSS Typed Object Model API represents the sum of two or more CSSNumericValue values — in cases where the result can't be represented as a single value.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathSum)
 */
open external class CSSMathSum(
    vararg values: CSSNumberish,
) : CSSMathValue {
    /**
     * The **`values`** read-only property of the CSSMathSum interface returns a CSSNumericArray containing the CSSNumericValue objects being summed together.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathSum/values)
     */
    open val values: CSSNumericArray
}
