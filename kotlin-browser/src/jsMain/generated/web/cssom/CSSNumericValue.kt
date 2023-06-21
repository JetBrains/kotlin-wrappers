// Automatically generated - do not modify!

package web.cssom

sealed external class CSSNumericValue :
    CSSStyleValue {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/add) */
    fun add(vararg values: CSSNumberish): CSSNumericValue

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/div) */
    fun div(vararg values: CSSNumberish): CSSNumericValue

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/equals) */
    fun equals(vararg value: CSSNumberish): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/max) */
    fun max(vararg values: CSSNumberish): CSSNumericValue

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/min) */
    fun min(vararg values: CSSNumberish): CSSNumericValue

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/mul) */
    fun mul(vararg values: CSSNumberish): CSSNumericValue

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/sub) */
    fun sub(vararg values: CSSNumberish): CSSNumericValue

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/to) */
    fun to(unit: String): CSSUnitValue

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/toSum) */
    fun toSum(vararg units: String): CSSMathSum

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/type) */
    fun type(): CSSNumericType

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSNumericValue/parse_static) */
        fun parse(cssText: String): CSSNumericValue
    }
}
