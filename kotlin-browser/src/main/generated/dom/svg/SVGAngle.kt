// Automatically generated - do not modify!

package dom.svg

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

    val SVG_ANGLETYPE_DEG: Short
    val SVG_ANGLETYPE_GRAD: Short
    val SVG_ANGLETYPE_RAD: Short
    val SVG_ANGLETYPE_UNKNOWN: Short
    val SVG_ANGLETYPE_UNSPECIFIED: Short

    companion object {
        val SVG_ANGLETYPE_DEG: Short
        val SVG_ANGLETYPE_GRAD: Short
        val SVG_ANGLETYPE_RAD: Short
        val SVG_ANGLETYPE_UNKNOWN: Short
        val SVG_ANGLETYPE_UNSPECIFIED: Short
    }
}
