// Automatically generated - do not modify!

package web.cssom

sealed external class CSSNumericValue :
    CSSStyleValue {
    fun add(vararg values: CSSNumberish): CSSNumericValue
    fun div(vararg values: CSSNumberish): CSSNumericValue
    fun equals(vararg value: CSSNumberish): Boolean
    fun max(vararg values: CSSNumberish): CSSNumericValue
    fun min(vararg values: CSSNumberish): CSSNumericValue
    fun mul(vararg values: CSSNumberish): CSSNumericValue
    fun sub(vararg values: CSSNumberish): CSSNumericValue
    fun to(unit: String): CSSUnitValue
    fun toSum(vararg units: String): CSSMathSum
    fun type(): CSSNumericType

    companion object {
        fun parse(cssText: String): CSSNumericValue
    }
}
