// Automatically generated - do not modify!

package web.pointer

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.mouse.MouseEventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#options)
 */
@JsPlainObject
external interface PointerEventInit :
    MouseEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#altitudeAngle)
     */
    var altitudeAngle: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#azimuthAngle)
     */
    var azimuthAngle: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#coalescedEvents)
     */
    var coalescedEvents: ReadonlyArray<PointerEvent>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#height)
     */
    var height: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#isPrimary)
     */
    var isPrimary: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#pointerId)
     */
    var pointerId: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#pointerType)
     */
    var pointerType: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#predictedEvents)
     */
    var predictedEvents: ReadonlyArray<PointerEvent>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#pressure)
     */
    var pressure: Float?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#tangentialPressure)
     */
    var tangentialPressure: Float?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#tiltX)
     */
    var tiltX: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#tiltY)
     */
    var tiltY: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#twist)
     */
    var twist: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent#width)
     */
    var width: Double?
}
