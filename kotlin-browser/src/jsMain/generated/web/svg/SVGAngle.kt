// Automatically generated - do not modify!

package web.svg

/**
 * Used to represent a value that can be an <angle> or <number> value. An SVGAngle reflected through the animVal attribute is always read only.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle)
 */
external class SVGAngle
private constructor() {
    val unitType: UnitType
    var value: Float
    var valueAsString: String
    var valueInSpecifiedUnits: Float
    fun convertToSpecifiedUnits(unitType: UnitType)
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
