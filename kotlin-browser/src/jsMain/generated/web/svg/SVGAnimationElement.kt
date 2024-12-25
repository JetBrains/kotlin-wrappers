// Automatically generated - do not modify!

package web.svg

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement)
 */
open external class SVGAnimationElement
private constructor() :
    SVGElement,
    SVGTests {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/targetElement)
     */
    val targetElement: SVGElement?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/beginElement)
     */
    fun beginElement()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/beginElementAt)
     */
    fun beginElementAt(offset: Float)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/endElement)
     */
    fun endElement()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/endElementAt)
     */
    fun endElementAt(offset: Float)
    fun getCurrentTime(): Float
    fun getSimpleDuration(): Float
    fun getStartTime(): Float
}
