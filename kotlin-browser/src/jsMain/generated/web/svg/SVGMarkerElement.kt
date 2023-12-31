// Automatically generated - do not modify!

package web.svg

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement)
 */
sealed external class SVGMarkerElement :
    SVGElement,
    SVGFitToViewBox {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerHeight)
     */
    val markerHeight: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerUnits)
     */
    val markerUnits: SVGAnimatedEnumeration<MarkerUnits>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerWidth)
     */
    val markerWidth: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/orientAngle)
     */
    val orientAngle: SVGAnimatedAngle

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/orientType)
     */
    val orientType: SVGAnimatedEnumeration<OrientType>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/refX)
     */
    val refX: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/refY)
     */
    val refY: SVGAnimatedLength

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/setOrientToAngle)
     */
    fun setOrientToAngle(angle: SVGAngle)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/setOrientToAuto)
     */
    fun setOrientToAuto()
    val SVG_MARKERUNITS_UNKNOWN: MarkerUnits
    val SVG_MARKERUNITS_USERSPACEONUSE: MarkerUnits
    val SVG_MARKERUNITS_STROKEWIDTH: MarkerUnits
    val SVG_MARKER_ORIENT_UNKNOWN: OrientType
    val SVG_MARKER_ORIENT_AUTO: OrientType
    val SVG_MARKER_ORIENT_ANGLE: OrientType

    companion object {
        val SVG_MARKERUNITS_UNKNOWN: MarkerUnits
        val SVG_MARKERUNITS_USERSPACEONUSE: MarkerUnits
        val SVG_MARKERUNITS_STROKEWIDTH: MarkerUnits
        val SVG_MARKER_ORIENT_UNKNOWN: OrientType
        val SVG_MARKER_ORIENT_AUTO: OrientType
        val SVG_MARKER_ORIENT_ANGLE: OrientType
    }

    sealed interface MarkerUnits
    sealed interface OrientType
}
