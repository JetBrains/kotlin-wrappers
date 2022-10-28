// Automatically generated - do not modify!

package dom.svg

sealed external class SVGLength {
    val unitType: Number
    var value: Double
    var valueAsString: String
    var valueInSpecifiedUnits: Number
    fun convertToSpecifiedUnits(unitType: Number)
    fun newValueSpecifiedUnits(
        unitType: Number,
        valueInSpecifiedUnits: Number,
    )

    val SVG_LENGTHTYPE_CM: Number
    val SVG_LENGTHTYPE_EMS: Number
    val SVG_LENGTHTYPE_EXS: Number
    val SVG_LENGTHTYPE_IN: Number
    val SVG_LENGTHTYPE_MM: Number
    val SVG_LENGTHTYPE_NUMBER: Number
    val SVG_LENGTHTYPE_PC: Number
    val SVG_LENGTHTYPE_PERCENTAGE: Number
    val SVG_LENGTHTYPE_PT: Number
    val SVG_LENGTHTYPE_PX: Number
    val SVG_LENGTHTYPE_UNKNOWN: Number
}
