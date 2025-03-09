// Automatically generated - do not modify!

package web.uievents

import web.events.EventTarget

/**
 * A single contact point on a touch-sensitive device. The contact point is commonly a finger or stylus and the device may be a touchscreen or trackpad.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch)
 */
open external class Touch(
    init: TouchInit,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientX)
     */
    val clientX: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientY)
     */
    val clientY: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/force)
     */
    val force: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/identifier)
     */
    val identifier: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageX)
     */
    val pageX: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageY)
     */
    val pageY: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusX)
     */
    val radiusX: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusY)
     */
    val radiusY: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/rotationAngle)
     */
    val rotationAngle: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenX)
     */
    val screenX: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenY)
     */
    val screenY: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/target)
     */
    val target: EventTarget
}
