// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGMarkerElement`** interface provides access to the properties of <marker> elements, as well as methods to manipulate them. The <marker> element defines the graphics used for drawing marks on a shape.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement)
 */
open external class SVGMarkerElement
private constructor() :
    SVGElement,
    SVGFitToViewBox {
    /**
     * The **`markerHeight`** read-only property of the SVGMarkerElement interface returns an SVGAnimatedLength object containing the height of the <marker> viewport as defined by the markerHeight attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerHeight)
     */
    val markerHeight: SVGAnimatedLength

    /**
     * The **`markerUnits`** read-only property of the SVGMarkerElement interface returns an SVGAnimatedEnumeration object. This object returns an integer which represents the keyword values that the markerUnits attribute accepts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerUnits)
     */
    val markerUnits: SVGAnimatedEnumeration<MarkerUnits>

    /**
     * The **`markerWidth`** read-only property of the SVGMarkerElement interface returns an SVGAnimatedLength object containing the width of the <marker> viewport as defined by the markerWidth attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerWidth)
     */
    val markerWidth: SVGAnimatedLength

    /**
     * The **`orientAngle`** read-only property of the SVGMarkerElement interface returns an SVGAnimatedAngle object containing the angle of the orient attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/orientAngle)
     */
    val orientAngle: SVGAnimatedAngle

    /**
     * The **`orientType`** read-only property of the SVGMarkerElement interface returns an SVGAnimatedEnumeration object indicating whether the orient attribute is auto, an angle value, or something else.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/orientType)
     */
    val orientType: SVGAnimatedEnumeration<OrientType>

    /**
     * The **`refX`** read-only property of the SVGMarkerElement interface returns an SVGAnimatedLength object containing the value of the refX attribute of the <marker>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/refX)
     */
    val refX: SVGAnimatedLength

    /**
     * The **`refY`** read-only property of the SVGMarkerElement interface returns an SVGAnimatedLength object containing the value of the refY attribute of the <marker>.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/refY)
     */
    val refY: SVGAnimatedLength

    /**
     * The **`setOrientToAngle()`** method of the SVGMarkerElement interface sets the value of the orient attribute to the value in the SVGAngle passed in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/setOrientToAngle)
     */
    fun setOrientToAngle(angle: SVGAngle)

    /**
     * The **`setOrientToAuto()`** method of the SVGMarkerElement interface sets the value of the orient attribute to auto.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/setOrientToAuto)
     */
    fun setOrientToAuto()
    val SVG_MARKERUNITS_UNKNOWN: MarkerUnits
    val SVG_MARKERUNITS_USERSPACEONUSE: MarkerUnits
    val SVG_MARKERUNITS_STROKEWIDTH: MarkerUnits
    val SVG_MARKER_ORIENT_UNKNOWN: OrientType
    val SVG_MARKER_ORIENT_AUTO: OrientType
    val SVG_MARKER_ORIENT_ANGLE: OrientType
    val SVG_MARKER_ORIENT_AUTO_START_REVERSE: OrientType

    companion object {
        val SVG_MARKERUNITS_UNKNOWN: MarkerUnits
        val SVG_MARKERUNITS_USERSPACEONUSE: MarkerUnits
        val SVG_MARKERUNITS_STROKEWIDTH: MarkerUnits
        val SVG_MARKER_ORIENT_UNKNOWN: OrientType
        val SVG_MARKER_ORIENT_AUTO: OrientType
        val SVG_MARKER_ORIENT_ANGLE: OrientType
        val SVG_MARKER_ORIENT_AUTO_START_REVERSE: OrientType
    }

    sealed interface MarkerUnits
    sealed interface OrientType
}
