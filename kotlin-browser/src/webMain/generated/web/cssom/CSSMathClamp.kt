// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSMathClamp`** interface of the CSS Typed Object Model API represents the CSS clamp() function. It inherits properties and methods from its parent CSSNumericValue.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathClamp)
 */
open external class CSSMathClamp(
    lower: CSSNumberish,
    value: CSSNumberish,
    upper: CSSNumberish,
) : CSSMathValue {
    /**
     * The **`lower`** read-only property of the CSSMathClamp interface returns a CSSNumericValue object containing the minimum value of a CSSMathClamp object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathClamp/lower)
     */
    open val lower: CSSNumericValue

    /**
     * The **`upper`** read-only property of the CSSMathClamp interface returns a CSSNumericValue object containing the maximum value of a CSSMathClamp object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathClamp/upper)
     */
    open val upper: CSSNumericValue

    /**
     * The **`value`** read-only property of the CSSMathClamp interface returns a CSSNumericValue object containing the preferred value of a CSSMathClamp object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSMathClamp/value)
     */
    open val value: CSSNumericValue
}
