// Automatically generated - do not modify!

package web.svg

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement) */
sealed external class SVGMarkerElement :
    SVGElement,
    SVGFitToViewBox {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerHeight) */
    val markerHeight: SVGAnimatedLength

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerUnits) */
    val markerUnits: SVGAnimatedEnumeration

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerWidth) */
    val markerWidth: SVGAnimatedLength

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/orientAngle) */
    val orientAngle: SVGAnimatedAngle

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/orientType) */
    val orientType: SVGAnimatedEnumeration

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/refX) */
    val refX: SVGAnimatedLength

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/refY) */
    val refY: SVGAnimatedLength

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/setOrientToAngle) */
    fun setOrientToAngle(angle: SVGAngle)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/setOrientToAuto) */
    fun setOrientToAuto()
    val SVG_MARKERUNITS_UNKNOWN: Short
    val SVG_MARKERUNITS_USERSPACEONUSE: Short
    val SVG_MARKERUNITS_STROKEWIDTH: Short
    val SVG_MARKER_ORIENT_UNKNOWN: Short
    val SVG_MARKER_ORIENT_AUTO: Short
    val SVG_MARKER_ORIENT_ANGLE: Short

    companion object {
        val SVG_MARKERUNITS_UNKNOWN: Short
        val SVG_MARKERUNITS_USERSPACEONUSE: Short
        val SVG_MARKERUNITS_STROKEWIDTH: Short
        val SVG_MARKER_ORIENT_UNKNOWN: Short
        val SVG_MARKER_ORIENT_AUTO: Short
        val SVG_MARKER_ORIENT_ANGLE: Short
    }
}
