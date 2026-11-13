// Automatically generated - do not modify!

package web.cssom

import web.errors.DOMExceptionType.SyntaxError
import web.errors.JsThrows

/**
 * The **`CSSNumericValue`** interface of the CSS Typed Object Model API represents operations that all numeric values can perform.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue)
 */
open external class CSSNumericValue
private constructor() :
    CSSStyleValue {
    /**
     * The **`add()`** method of the CSSNumericValue interface adds a supplied number to the CSSNumericValue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/add)
     */
    open fun add(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`div()`** method of the CSSNumericValue interface divides the CSSNumericValue by the supplied value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/div)
     */
    open fun div(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`equals()`** method of the CSSNumericValue interface returns true if every value passed to it is the same as the CSSNumericValue, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/equals)
     */
    open fun equals(vararg value: CSSNumberish): Boolean

    /**
     * The **`max()`** method of the CSSNumericValue interface returns the highest value from among the values passed. The passed values must be of the same type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/max)
     */
    open fun max(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`min()`** method of the CSSNumericValue interface returns the lowest value from among those values passed. The passed values must be of the same type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/min)
     */
    open fun min(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`mul()`** method of the CSSNumericValue interface multiplies the CSSNumericValue by the supplied values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/mul)
     */
    open fun mul(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`sub()`** method of the CSSNumericValue interface subtracts a supplied number from the CSSNumericValue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/sub)
     */
    open fun sub(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`to()`** method of the CSSNumericValue interface converts a numeric value from one unit to another.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/to)
     */
    @JsThrows(SyntaxError::class)
    open fun to(unit: String): CSSUnitValue

    /**
     * The **`toSum()`** method of the CSSNumericValue interface converts the object's value to a CSSMathSum of CSSUnitValues using only the specified units, if possible. If called with no units, it simplifies the value into a minimal sum of CSSUnitValues instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/toSum)
     */
    @JsThrows(SyntaxError::class)
    open fun toSum(vararg units: String): CSSMathSum

    /**
     * The **`type()`** method of the CSSNumericValue interface returns the type of CSSNumericValue, one of angle, flex, frequency, length, resolution, percent, percentHint, or time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/type)
     */
    open fun type(): CSSNumericType

    companion object {
        /**
         * The **`parse()`** static method of the CSSNumericValue interface converts a value string into an object whose members are value and the units.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/parse_static)
         */
        @JsThrows(SyntaxError::class)
        fun parse(cssText: String): CSSNumericValue
    }
}
