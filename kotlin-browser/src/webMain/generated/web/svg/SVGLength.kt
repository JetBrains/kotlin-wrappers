// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGLength`** interface correspond to the <length> basic data type.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength)
 */
open external class SVGLength
private constructor() {
    /**
     * The **`unitType`** property of the SVGLength interface that represents type of the value as specified by one of the SVG_LENGTHTYPE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/unitType)
     */
    val unitType: UnitType

    /**
     * The **`value`** property of the SVGLength interface represents the floating point value of the <length> in user units.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/value)
     */
    var value: Float

    /**
     * The **`valueAsString`** property of the SVGLength interface represents the <length>'s value as a string, in the units expressed by unitType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/valueAsString)
     */
    var valueAsString: String

    /**
     * The **`valueInSpecifiedUnits`** property of the SVGLength interface represents floating point value, in the units expressed by unitType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/valueInSpecifiedUnits)
     */
    var valueInSpecifiedUnits: Float

    /**
     * The **`convertToSpecifiedUnits()`** method of the SVGLength interface allows you to convert the length's value to the specified unit type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/convertToSpecifiedUnits)
     */
    fun convertToSpecifiedUnits(unitType: UnitType)

    /**
     * The **`newValueSpecifiedUnits()`** method of the SVGLength interface resets the value as a number with an associated unitType, thereby replacing the values for all of the attributes on the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/newValueSpecifiedUnits)
     */
    fun newValueSpecifiedUnits(
        unitType: UnitType,
        valueInSpecifiedUnits: Float,
    )

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_unknown)
         */
        val SVG_LENGTHTYPE_UNKNOWN: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_number)
         */
        val SVG_LENGTHTYPE_NUMBER: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_percentage)
         */
        val SVG_LENGTHTYPE_PERCENTAGE: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_ems)
         */
        val SVG_LENGTHTYPE_EMS: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_exs)
         */
        val SVG_LENGTHTYPE_EXS: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_px)
         */
        val SVG_LENGTHTYPE_PX: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_cm)
         */
        val SVG_LENGTHTYPE_CM: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_mm)
         */
        val SVG_LENGTHTYPE_MM: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_in)
         */
        val SVG_LENGTHTYPE_IN: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_pt)
         */
        val SVG_LENGTHTYPE_PT: UnitType

        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength#svg_lengthtype_pc)
         */
        val SVG_LENGTHTYPE_PC: UnitType
    }

    sealed /* enum */
    interface UnitType
}
