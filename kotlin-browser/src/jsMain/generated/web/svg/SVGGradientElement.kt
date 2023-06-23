// Automatically generated - do not modify!

package web.svg

/**
 * The SVGGradient interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement)
 */
sealed external class SVGGradientElement :
    SVGElement,
    SVGURIReference {
    val gradientTransform: SVGAnimatedTransformList
    val gradientUnits: SVGAnimatedEnumeration
    val spreadMethod: SVGAnimatedEnumeration
    val SVG_SPREADMETHOD_UNKNOWN: Short
    val SVG_SPREADMETHOD_PAD: Short
    val SVG_SPREADMETHOD_REFLECT: Short
    val SVG_SPREADMETHOD_REPEAT: Short

    companion object {
        val SVG_SPREADMETHOD_UNKNOWN: Short
        val SVG_SPREADMETHOD_PAD: Short
        val SVG_SPREADMETHOD_REFLECT: Short
        val SVG_SPREADMETHOD_REPEAT: Short
    }
}
