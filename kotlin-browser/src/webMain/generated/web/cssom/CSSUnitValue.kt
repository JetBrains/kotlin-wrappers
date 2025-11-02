// Automatically generated - do not modify!

package web.cssom

/**
 * The **`CSSUnitValue`** interface of the CSS Typed Object Model API represents values that contain a single unit type. For example, "42px" would be represented by a CSSNumericValue.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnitValue)
 */
open external class CSSUnitValue(
    /**
     * The **`CSSUnitValue.value`** property of the CSSUnitValue interface returns a double indicating the number of units.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnitValue/value)
     */
    var value: Double,
    /**
     * The **`CSSUnitValue.unit`** read-only property of the CSSUnitValue interface returns a string indicating the type of unit.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSUnitValue/unit)
     */
    val unit: String,
) : CSSNumericValue
