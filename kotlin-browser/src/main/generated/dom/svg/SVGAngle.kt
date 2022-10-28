// Automatically generated - do not modify!

package dom.svg

sealed external class SVGAngle {
    val unitType: Number
    var value: Double
    var valueAsString: String
    var valueInSpecifiedUnits: Number
    fun convertToSpecifiedUnits(unitType: Number)
    fun newValueSpecifiedUnits(
        unitType: Number,
        valueInSpecifiedUnits: Number,
    )

    val SVG_ANGLETYPE_DEG: Number
    val SVG_ANGLETYPE_GRAD: Number
    val SVG_ANGLETYPE_RAD: Number
    val SVG_ANGLETYPE_UNKNOWN: Number
    val SVG_ANGLETYPE_UNSPECIFIED: Number
}
