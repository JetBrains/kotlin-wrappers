// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGLength`** interface correspond to the \<length> basic data type.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength)
 */
external class SVGLength
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/unitType)
     */
    val unitType: UnitType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/value)
     */
    var value: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/valueAsString)
     */
    var valueAsString: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/valueInSpecifiedUnits)
     */
    var valueInSpecifiedUnits: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/convertToSpecifiedUnits)
     */
    fun convertToSpecifiedUnits(unitType: UnitType)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/newValueSpecifiedUnits)
     */
    fun newValueSpecifiedUnits(
        unitType: UnitType,
        valueInSpecifiedUnits: Float,
    )

    val SVG_LENGTHTYPE_UNKNOWN: UnitType
    val SVG_LENGTHTYPE_NUMBER: UnitType
    val SVG_LENGTHTYPE_PERCENTAGE: UnitType
    val SVG_LENGTHTYPE_EMS: UnitType
    val SVG_LENGTHTYPE_EXS: UnitType
    val SVG_LENGTHTYPE_PX: UnitType
    val SVG_LENGTHTYPE_CM: UnitType
    val SVG_LENGTHTYPE_MM: UnitType
    val SVG_LENGTHTYPE_IN: UnitType
    val SVG_LENGTHTYPE_PT: UnitType
    val SVG_LENGTHTYPE_PC: UnitType

    companion object {
        val SVG_LENGTHTYPE_UNKNOWN: UnitType
        val SVG_LENGTHTYPE_NUMBER: UnitType
        val SVG_LENGTHTYPE_PERCENTAGE: UnitType
        val SVG_LENGTHTYPE_EMS: UnitType
        val SVG_LENGTHTYPE_EXS: UnitType
        val SVG_LENGTHTYPE_PX: UnitType
        val SVG_LENGTHTYPE_CM: UnitType
        val SVG_LENGTHTYPE_MM: UnitType
        val SVG_LENGTHTYPE_IN: UnitType
        val SVG_LENGTHTYPE_PT: UnitType
        val SVG_LENGTHTYPE_PC: UnitType
    }

    sealed interface UnitType
}
