// Automatically generated - do not modify!

package web.svg

/**
 * Correspond to the <length> basic data type.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength)
 */
sealed external class SVGLength {
    val unitType: UnitType
    var value: Double
    var valueAsString: String
    var valueInSpecifiedUnits: Double
    fun convertToSpecifiedUnits(unitType: UnitType)
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
