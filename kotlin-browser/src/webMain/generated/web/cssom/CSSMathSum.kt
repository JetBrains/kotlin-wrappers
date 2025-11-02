// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSMathSum`** interface of the CSS Typed Object Model API represents the result obtained by calling add(), sub(), or toSum() on CSSNumericValue.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathSum)
 */
open external class CSSMathSum(
    vararg values: CSSNumberish,
) : CSSMathValue {
    /**
     * The **`CSSMathSum.values`** read-only property of the CSSMathSum interface returns a CSSNumericArray object which contains one or more CSSNumericValue objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathSum/values)
     */
    val values: CSSNumericArray
}
