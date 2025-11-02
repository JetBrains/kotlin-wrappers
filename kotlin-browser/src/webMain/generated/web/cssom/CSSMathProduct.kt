// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSMathProduct`** interface of the CSS Typed Object Model API represents the result obtained by calling add(), sub(), or toSum() on CSSNumericValue. It inherits properties and methods from its parent CSSNumericValue.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathProduct)
 */
open external class CSSMathProduct(
    vararg values: CSSNumberish,
) : CSSMathValue {
    /**
     * The **`CSSMathProduct.values`** read-only property of the CSSMathProduct interface returns a CSSNumericArray object which contains one or more CSSNumericValue objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathProduct/values)
     */
    val values: CSSNumericArray
}
