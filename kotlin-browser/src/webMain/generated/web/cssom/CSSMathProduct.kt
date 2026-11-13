// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSMathProduct`** interface of the CSS Typed Object Model API represents the product of two or more CSSNumericValue values — in cases where the result can't be represented as a single value.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathProduct)
 */
open external class CSSMathProduct(
    vararg values: CSSNumberish,
) : CSSMathValue {
    /**
     * The **`values`** read-only property of the CSSMathProduct interface returns a CSSNumericArray containing the CSSNumericValue objects being multiplied together.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathProduct/values)
     */
    open val values: CSSNumericArray
}
