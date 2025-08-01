// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSNumericValue`** interface of the CSS Typed Object Model API represents operations that all numeric values can perform.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue)
 */
open external class CSSNumericValue
private constructor() :
    CSSStyleValue {
    /**
     * The **`add()`** method of the CSSNumericValue interface adds a supplied number to the `CSSNumericValue`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/add)
     */
    fun add(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`div()`** method of the CSSNumericValue interface divides the `CSSNumericValue` by the supplied value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/div)
     */
    fun div(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`equals()`** method of the CSSNumericValue interface returns a boolean indicating whether the passed value are strictly equal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/equals)
     */
    fun equals(vararg value: CSSNumberish): Boolean

    /**
     * The **`max()`** method of the CSSNumericValue interface returns the highest value from among the values passed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/max)
     */
    fun max(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`min()`** method of the CSSNumericValue interface returns the lowest value from among those values passed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/min)
     */
    fun min(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`mul()`** method of the CSSNumericValue interface multiplies the `CSSNumericValue` by the supplied value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/mul)
     */
    fun mul(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`sub()`** method of the CSSNumericValue interface subtracts a supplied number from the `CSSNumericValue`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/sub)
     */
    fun sub(vararg values: CSSNumberish): CSSNumericValue

    /**
     * The **`to()`** method of the CSSNumericValue interface converts a numeric value from one unit to another.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/to)
     */
    fun to(unit: String): CSSUnitValue

    /**
     * The **`toSum()`** method of the CSSNumericValue interface converts the object's value to a CSSMathSum object to values of the specified unit.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/toSum)
     */
    fun toSum(vararg units: String): CSSMathSum

    /**
     * The **`type()`** method of the CSSNumericValue interface returns the type of `CSSNumericValue`, one of `angle`, `flex`, `frequency`, `length`, `resolution`, `percent`, `percentHint`, or `time`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/type)
     */
    fun type(): CSSNumericType

    companion object {
        /**
         * The **`parse()`** static method of the CSSNumericValue interface converts a value string into an object whose members are value and the units.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/parse_static)
         */
        fun parse(cssText: String): CSSNumericValue
    }
}
