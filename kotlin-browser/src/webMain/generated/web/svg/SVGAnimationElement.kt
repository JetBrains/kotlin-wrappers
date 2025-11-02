// Automatically generated - do not modify!

package web.svg

/**
 * The **`SVGAnimationElement`** interface is the base interface for all of the animation element interfaces: SVGAnimateElement, SVGSetElement, SVGAnimateColorElement, SVGAnimateMotionElement and SVGAnimateTransformElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement)
 */
open external class SVGAnimationElement
private constructor() :
    SVGElement,
    SVGTests {
    /**
     * The **`targetElement`** read-only property of the SVGAnimationElement interface refers to the element which is being animated. If no target element is being animated (for example, because the href attribute specifies an unknown element), the value returned is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/targetElement)
     */
    val targetElement: SVGElement?

    /**
     * The SVGAnimationElement method **`beginElement()`** creates a begin instance time for the current time. The new instance time is added to the begin instance times list. The behavior of this method is equivalent to beginElementAt(0).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/beginElement)
     */
    fun beginElement()

    /**
     * The SVGAnimationElement method **`beginElementAt()`** creates a begin instance time for the current time plus the specified offset. The new instance time is added to the begin instance times list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/beginElementAt)
     */
    fun beginElementAt(offset: Float)

    /**
     * The SVGAnimationElement method **`endElement()`** creates an end instance time for the current time. The new instance time is added to the end instance times list. The behavior of this method is equivalent to endElementAt(0).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/endElement)
     */
    fun endElement()

    /**
     * The SVGAnimationElement method **`endElementAt()`** creates an end instance time for the current time plus the specified offset. The new instance time is added to the end instance times list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/endElementAt)
     */
    fun endElementAt(offset: Float)

    /**
     * The SVGAnimationElement method **`getCurrentTime()`** returns a float representing the current time in seconds relative to time zero for the given time container.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/getCurrentTime)
     */
    fun getCurrentTime(): Float

    /**
     * The SVGAnimationElement method **`getSimpleDuration()`** returns a float representing the number of seconds for the simple duration for this animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/getSimpleDuration)
     */
    fun getSimpleDuration(): Float

    /**
     * The SVGAnimationElement method **`getStartTime()`** returns a float representing the start time, in seconds, for this animation element's current interval, if it exists, regardless of whether the interval has begun yet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/getStartTime)
     */
    fun getStartTime(): Float
}
