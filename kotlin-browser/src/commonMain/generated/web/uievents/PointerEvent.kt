// Automatically generated - do not modify!

package web.uievents

import js.array.ReadonlyArray
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`PointerEvent`** interface represents the state of a DOM event produced by a pointer such as the geometry of the contact point, the device type that generated the event, the amount of pressure that was applied on the contact surface, etc.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent)
 */
open external class PointerEvent(
    override val type: EventType<PointerEvent>,
    init: PointerEventInit = definedExternally,
) : MouseEvent {
    /**
     * The **`altitudeAngle`** read-only property of the PointerEvent interface represents the angle between a transducer (a pointer or stylus) axis and the X-Y plane of a device screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/altitudeAngle)
     */
    val altitudeAngle: Double

    /**
     * The **`azimuthAngle`** read-only property of the PointerEvent interface represents the angle between the Y-Z plane and the plane containing both the transducer (pointer or stylus) axis and the Y axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/azimuthAngle)
     */
    val azimuthAngle: Double

    /**
     * The **`height`** read-only property of the geometry, along the y-axis (in CSS pixels).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/height)
     */
    val height: Double

    /**
     * The **`isPrimary`** read-only property of the created the event is the _primary_ pointer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/isPrimary)
     */
    val isPrimary: Boolean

    /**
     * The **`pointerId`** read-only property of the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerId)
     */
    val pointerId: Int

    /**
     * The **`pointerType`** read-only property of the that caused a given pointer event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerType)
     */
    val pointerType: String

    /**
     * The **`pressure`** read-only property of the input.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pressure)
     */
    val pressure: Float

    /**
     * The **`tangentialPressure`** read-only property of the the pointer input (also known as barrel pressure or cylinder stress).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tangentialPressure)
     */
    val tangentialPressure: Float

    /**
     * The **`tiltX`** read-only property of the PointerEvent interface is the angle (in degrees) between the _Y-Z plane_ of the pointer and the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltX)
     */
    val tiltX: Int

    /**
     * The **`tiltY`** read-only property of the PointerEvent interface is the angle (in degrees) between the _X-Z plane_ of the pointer and the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltY)
     */
    val tiltY: Int

    /**
     * The **`twist`** read-only property of the (e.g., pen stylus) around its major axis, in degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/twist)
     */
    val twist: Int

    /**
     * The **`width`** read-only property of the geometry along the x-axis, measured in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/width)
     */
    val width: Double

    /**
     * The **`getCoalescedEvents()`** method of the PointerEvent interface returns a sequence of `PointerEvent` instances that were coalesced (merged) into a single Element/pointermove_event or Element/pointerrawupdate_event event.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/getCoalescedEvents)
     */
    fun getCoalescedEvents(): ReadonlyArray<PointerEvent>

    /**
     * The **`getPredictedEvents()`** method of the PointerEvent interface returns a sequence of `PointerEvent` instances that are estimated future pointer positions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/getPredictedEvents)
     */
    fun getPredictedEvents(): ReadonlyArray<PointerEvent>

    @JsAlias(THIS)
    override fun asInit(): PointerEventInit

    companion object {
        @JsValue("auxclick")
        val AUX_CLICK: EventType<PointerEvent>

        @JsValue("click")
        val CLICK: EventType<PointerEvent>

        @JsValue("contextmenu")
        val CONTEXT_MENU: EventType<PointerEvent>

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
