// Automatically generated - do not modify!

package web.svg

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement) */
sealed external class SVGAnimationElement :
    SVGElement,
    SVGTests {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/targetElement) */
    val targetElement: SVGElement?
    fun beginElement()
    fun beginElementAt(offset: Number)
    fun endElement()
    fun endElementAt(offset: Number)
    fun getCurrentTime(): Number
    fun getSimpleDuration(): Number
    fun getStartTime(): Number
}
