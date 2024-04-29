// Automatically generated - do not modify!

package web.svg

/**
 * The SVGGradient interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement)
 */
open external class SVGGradientElement
private constructor() :
    SVGElement,
    SVGURIReference {
    val gradientTransform: SVGAnimatedTransformList
    val gradientUnits: SVGAnimatedEnumeration<SVGUnitTypes.Type>
    val spreadMethod: SVGAnimatedEnumeration<SpreadMethod>
    val SVG_SPREADMETHOD_UNKNOWN: SpreadMethod
    val SVG_SPREADMETHOD_PAD: SpreadMethod
    val SVG_SPREADMETHOD_REFLECT: SpreadMethod
    val SVG_SPREADMETHOD_REPEAT: SpreadMethod

    companion object {
        val SVG_SPREADMETHOD_UNKNOWN: SpreadMethod
        val SVG_SPREADMETHOD_PAD: SpreadMethod
        val SVG_SPREADMETHOD_REFLECT: SpreadMethod
        val SVG_SPREADMETHOD_REPEAT: SpreadMethod
    }

    sealed interface SpreadMethod
}
