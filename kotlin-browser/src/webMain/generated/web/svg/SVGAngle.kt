// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGAngle`** interface is used to represent a value that can be an <angle> or <number> value.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle)
 */
open external class SVGAngle
private constructor() {
    /**
     * The **`unitType`** property of the SVGAngle interface is one of the unit type constants and represents the units in which this angle's value is expressed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/unitType)
     */
    val unitType: UnitType

    /**
     * The **`value`** property of the SVGAngle interface represents the floating point value of the <angle> in degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/value)
     */
    var value: Float

    /**
     * The **`valueAsString`** property of the SVGAngle interface represents the angle's value as a string, in the units expressed by unitType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/valueAsString)
     */
    var valueAsString: String

    /**
     * The **`valueInSpecifiedUnits`** property of the SVGAngle interface represents the value of this angle as a number, in the units expressed by the angle's unitType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/valueInSpecifiedUnits)
     */
    var valueInSpecifiedUnits: Float

    /**
     * The **`convertToSpecifiedUnits()`** method of the SVGAngle interface allows you to convert the angle's value to the specified unit type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/convertToSpecifiedUnits)
     */
    fun convertToSpecifiedUnits(unitType: UnitType)

    /**
     * The **`newValueSpecifiedUnits()`** method of the SVGAngle interface sets the value to a number with an associated unitType, thereby replacing the values for all of the attributes on the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/newValueSpecifiedUnits)
     */
    fun newValueSpecifiedUnits(
        unitType: UnitType,
        valueInSpecifiedUnits: Float,
    )

    val SVG_ANGLETYPE_UNKNOWN: UnitType
    val SVG_ANGLETYPE_UNSPECIFIED: UnitType
    val SVG_ANGLETYPE_DEG: UnitType
    val SVG_ANGLETYPE_RAD: UnitType
    val SVG_ANGLETYPE_GRAD: UnitType

    companion object {
        val SVG_ANGLETYPE_UNKNOWN: UnitType
        val SVG_ANGLETYPE_UNSPECIFIED: UnitType
        val SVG_ANGLETYPE_DEG: UnitType
        val SVG_ANGLETYPE_RAD: UnitType
        val SVG_ANGLETYPE_GRAD: UnitType
    }

    sealed interface UnitType
}
