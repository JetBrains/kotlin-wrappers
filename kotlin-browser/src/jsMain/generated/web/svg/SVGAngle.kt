// Automatically generated - do not modify!

package web.svg

/**
 * Used to represent a value that can be an <angle> or <number> value. An SVGAngle reflected through the animVal attribute is always read only.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle)
 */
sealed external class SVGAngle {
    val unitType: Short
    var value: Double
    var valueAsString: String
    var valueInSpecifiedUnits: Double
    fun convertToSpecifiedUnits(unitType: Number)
    fun newValueSpecifiedUnits(
        unitType: Number,
        valueInSpecifiedUnits: Number,
    )

    val SVG_ANGLETYPE_UNKNOWN: Short
    val SVG_ANGLETYPE_UNSPECIFIED: Short
    val SVG_ANGLETYPE_DEG: Short
    val SVG_ANGLETYPE_RAD: Short
    val SVG_ANGLETYPE_GRAD: Short

    companion object {
        val SVG_ANGLETYPE_UNKNOWN: Short
        val SVG_ANGLETYPE_UNSPECIFIED: Short
        val SVG_ANGLETYPE_DEG: Short
        val SVG_ANGLETYPE_RAD: Short
        val SVG_ANGLETYPE_GRAD: Short
    }
}
