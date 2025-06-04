// Automatically generated - do not modify!

package web.uievents

import web.events.EventTarget

/**
 * The **`Touch`** interface represents a single contact point on a touch-sensitive device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch)
 */
open external class Touch(
    init: TouchInit,
) {
    /**
     * The `Touch.clientX` read-only property returns the X coordinate of the touch point relative to the viewport, not including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientX)
     */
    val clientX: Double

    /**
     * The **`Touch.clientY`** read-only property returns the Y coordinate of the touch point relative to the browser's viewport, not including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientY)
     */
    val clientY: Double

    /**
     * The **`Touch.force`** read-only property returns the amount of pressure the user is applying to the touch surface for a Touch point.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/force)
     */
    val force: Float

    /**
     * The **`Touch.identifier`** returns a value uniquely identifying this point of contact with the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/identifier)
     */
    val identifier: Int

    /**
     * The **`Touch.pageX`** read-only property returns the X coordinate of the touch point relative to the viewport, including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageX)
     */
    val pageX: Double

    /**
     * The **`Touch.pageY`** read-only property returns the Y coordinate of the touch point relative to the viewport, including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageY)
     */
    val pageY: Double

    /**
     * The **`radiusX`** read-only property of the Touch interface returns the X radius of the ellipse that most closely circumscribes the area of contact with the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusX)
     */
    val radiusX: Float

    /**
     * The **`radiusY`** read-only property of the Touch interface returns the Y radius of the ellipse that most closely circumscribes the area of contact with the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusY)
     */
    val radiusY: Float

    /**
     * The **`rotationAngle`** read-only property of the Touch interface returns the rotation angle, in degrees, of the contact area ellipse defined by Touch.radiusX and Touch.radiusY.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/rotationAngle)
     */
    val rotationAngle: Float

    /**
     * Returns the X coordinate of the touch point relative to the screen, not including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenX)
     */
    val screenX: Double

    /**
     * Returns the Y coordinate of the touch point relative to the screen, not including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenY)
     */
    val screenY: Double

    /**
     * The read-only **`target`** property of the `Touch` interface returns the (EventTarget) on which the touch contact started when it was first placed on the surface, even if the touch point has since moved outside the interactive area of that element or even been removed from the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/target)
     */
    val target: EventTarget
}
