// Automatically generated - do not modify!

package web.svg

/**
 * The `SVGAngle` interface is used to represent a value that can be an &lt;angle&gt; or &lt;number&gt; value.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle)
 */
external class SVGAngle
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/unitType)
     */
    val unitType: UnitType

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/value)
     */
    var value: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/valueAsString)
     */
    var valueAsString: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/valueInSpecifiedUnits)
     */
    var valueInSpecifiedUnits: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/convertToSpecifiedUnits)
     */
    fun convertToSpecifiedUnits(unitType: UnitType)

    /**
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
