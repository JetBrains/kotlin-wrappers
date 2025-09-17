// Automatically generated - do not modify!

package web.pointer

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import web.events.EventType
import web.mouse.MouseEvent
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
     * The **`height`** read-only property of the PointerEvent interface represents the height of the pointer's contact geometry, along the y-axis (in CSS pixels).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/height)
     */
    val height: Double

    /**
     * The **`isPrimary`** read-only property of the PointerEvent interface indicates whether or not the pointer device that created the event is the _primary_ pointer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/isPrimary)
     */
    val isPrimary: Boolean

    /**
     * The **`persistentDeviceId`** read-only property of the PointerEvent interface is a unique identifier for the pointing device generating the `PointerEvent`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/persistentDeviceId)
     */
    val persistentDeviceId: Int

    /**
     * The **`pointerId`** read-only property of the PointerEvent interface is an identifier assigned to the pointer that triggered the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerId)
     */
    val pointerId: Int

    /**
     * The **`pointerType`** read-only property of the PointerEvent interface indicates the device type (mouse, pen, or touch) that caused a given pointer event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerType)
     */
    val pointerType: String

    /**
     * The **`pressure`** read-only property of the PointerEvent interface indicates the normalized pressure of the pointer input.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pressure)
     */
    val pressure: Float

    /**
     * The **`tangentialPressure`** read-only property of the PointerEvent interface represents the normalized tangential pressure of the pointer input (also known as barrel pressure or cylinder stress).
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
     * The **`twist`** read-only property of the PointerEvent interface represents the clockwise rotation of the pointer (e.g., pen stylus) around its major axis, in degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/twist)
     */
    val twist: Int

    /**
     * The **`width`** read-only property of the PointerEvent interface represents the width of the pointer's contact geometry along the x-axis, measured in CSS pixels.
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

    companion object
}

inline fun PointerEvent.asInit(): PointerEventInit =
    unsafeCast(this)

inline val PointerEvent.Companion.AUX_CLICK: EventType<PointerEvent>
    get() = EventType("auxclick")

inline val PointerEvent.Companion.CLICK: EventType<PointerEvent>
    get() = EventType("click")

inline val PointerEvent.Companion.CONTEXT_MENU: EventType<PointerEvent>
    get() = EventType("contextmenu")

inline val PointerEvent.Companion.GOT_POINTER_CAPTURE: EventType<PointerEvent>
    get() = EventType("gotpointercapture")

inline val PointerEvent.Companion.LOST_POINTER_CAPTURE: EventType<PointerEvent>
    get() = EventType("lostpointercapture")

inline val PointerEvent.Companion.POINTER_CANCEL: EventType<PointerEvent>
    get() = EventType("pointercancel")

inline val PointerEvent.Companion.POINTER_DOWN: EventType<PointerEvent>
    get() = EventType("pointerdown")

inline val PointerEvent.Companion.POINTER_ENTER: EventType<PointerEvent>
    get() = EventType("pointerenter")

inline val PointerEvent.Companion.POINTER_LEAVE: EventType<PointerEvent>
    get() = EventType("pointerleave")

inline val PointerEvent.Companion.POINTER_MOVE: EventType<PointerEvent>
    get() = EventType("pointermove")

inline val PointerEvent.Companion.POINTER_OUT: EventType<PointerEvent>
    get() = EventType("pointerout")

inline val PointerEvent.Companion.POINTER_OVER: EventType<PointerEvent>
    get() = EventType("pointerover")

inline val PointerEvent.Companion.POINTER_UP: EventType<PointerEvent>
    get() = EventType("pointerup")
