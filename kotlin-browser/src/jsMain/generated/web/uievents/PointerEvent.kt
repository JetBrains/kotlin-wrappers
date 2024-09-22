// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import js.array.ReadonlyArray
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType

/**
 * The state of a DOM event produced by a pointer such as the geometry of the contact point, the device type that generated the event, the amount of pressure that was applied on the contact surface, etc.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent)
 */
open external class PointerEvent(
    override val type: EventType<PointerEvent>,
    init: PointerEventInit = definedExternally,
) : MouseEvent {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/altitudeAngle)
     */
    val altitudeAngle: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/azimuthAngle)
     */
    val azimuthAngle: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/height)
     */
    val height: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/isPrimary)
     */
    val isPrimary: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerId)
     */
    val pointerId: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerType)
     */
    val pointerType: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pressure)
     */
    val pressure: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tangentialPressure)
     */
    val tangentialPressure: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltX)
     */
    val tiltX: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltY)
     */
    val tiltY: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/twist)
     */
    val twist: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/width)
     */
    val width: Double

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/getCoalescedEvents)
     */
    fun getCoalescedEvents(): ReadonlyArray<PointerEvent>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/getPredictedEvents)
     */
    fun getPredictedEvents(): ReadonlyArray<PointerEvent>

    @JsAlias(THIS)
    override fun asInit(): PointerEventInit

    companion object {
        @JsValue("gotpointercapture")
        val GOT_POINTER_CAPTURE: EventType<PointerEvent>

        @JsValue("lostpointercapture")
        val LOST_POINTER_CAPTURE: EventType<PointerEvent>

        @JsValue("pointercancel")
        val POINTER_CANCEL: EventType<PointerEvent>

        @JsValue("pointerdown")
        val POINTER_DOWN: EventType<PointerEvent>

        @JsValue("pointerenter")
        val POINTER_ENTER: EventType<PointerEvent>

        @JsValue("pointerleave")
        val POINTER_LEAVE: EventType<PointerEvent>

        @JsValue("pointermove")
        val POINTER_MOVE: EventType<PointerEvent>

        @JsValue("pointerout")
        val POINTER_OUT: EventType<PointerEvent>

        @JsValue("pointerover")
        val POINTER_OVER: EventType<PointerEvent>

        @JsValue("pointerup")
        val POINTER_UP: EventType<PointerEvent>
    }
}
