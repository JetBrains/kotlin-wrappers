// Automatically generated - do not modify!

package web.mouse

import js.reflect.unsafeCast
import web.events.EventTarget
import web.events.EventType
import web.keyboard.ModifierKeyCode
import web.uievents.UIEvent
import kotlin.js.definedExternally

/**
 * The **`MouseEvent`** interface represents events that occur due to the user interacting with a pointing device (such as a mouse).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent)
 */
open external class MouseEvent(
    override val type: EventType<MouseEvent>,
    init: MouseEventInit = definedExternally,
) : UIEvent {
    /**
     * The **`MouseEvent.altKey`** read-only property is a boolean value that indicates whether the <kbd>alt</kbd> key was pressed or not when a given mouse event occurs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/altKey)
     */
    val altKey: Boolean

    /**
     * The **`MouseEvent.button`** read-only property indicates which button was pressed or released on the mouse to trigger the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button)
     */
    val button: MouseButton

    /**
     * The **`MouseEvent.buttons`** read-only property indicates which buttons are pressed on the mouse (or other input device) when a mouse event is triggered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons)
     */
    val buttons: MouseButtons

    /**
     * The **`clientX`** read-only property of the MouseEvent interface provides the horizontal coordinate within the application's viewport at which the event occurred (as opposed to the coordinate within the page).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientX)
     */
    val clientX: Int

    /**
     * The **`clientY`** read-only property of the MouseEvent interface provides the vertical coordinate within the application's viewport at which the event occurred (as opposed to the coordinate within the page).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientY)
     */
    val clientY: Int

    /**
     * The **`MouseEvent.ctrlKey`** read-only property is a boolean value that indicates whether the <kbd>ctrl</kbd> key was pressed or not when a given mouse event occurs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/ctrlKey)
     */
    val ctrlKey: Boolean

    /**
     * The **`MouseEvent.layerX`** read-only property returns the horizontal coordinate of the event relative to the current layer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/layerX)
     */
    val layerX: Int

    /**
     * The **`MouseEvent.layerY`** read-only property returns the vertical coordinate of the event relative to the current layer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/layerY)
     */
    val layerY: Int

    /**
     * The **`MouseEvent.metaKey`** read-only property is a boolean value that indicates whether the <kbd>meta</kbd> key was pressed or not when a given mouse event occurs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/metaKey)
     */
    val metaKey: Boolean

    /**
     * The **`movementX`** read-only property of the MouseEvent interface provides the difference in the X coordinate of the mouse pointer between the given event and the previous Element/mousemove_event event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/movementX)
     */
    val movementX: Double

    /**
     * The **`movementY`** read-only property of the MouseEvent interface provides the difference in the Y coordinate of the mouse pointer between the given event and the previous Element/mousemove_event event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/movementY)
     */
    val movementY: Double

    /**
     * The **`offsetX`** read-only property of the MouseEvent interface provides the offset in the X coordinate of the mouse pointer between that event and the padding edge of the target node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetX)
     */
    val offsetX: Double

    /**
     * The **`offsetY`** read-only property of the MouseEvent interface provides the offset in the Y coordinate of the mouse pointer between that event and the padding edge of the target node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetY)
     */
    val offsetY: Double

    /**
     * The **`pageX`** read-only property of the MouseEvent interface returns the X (horizontal) coordinate (in pixels) at which the mouse was clicked, relative to the left edge of the entire document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/pageX)
     */
    val pageX: Double

    /**
     * The **`pageY`** read-only property of the MouseEvent interface returns the Y (vertical) coordinate (in pixels) at which the mouse was clicked, relative to the top edge of the entire document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/pageY)
     */
    val pageY: Double

    /**
     * The **`MouseEvent.relatedTarget`** read-only property is the secondary target for the mouse event, if there is one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/relatedTarget)
     */
    val relatedTarget: EventTarget?

    /**
     * The **`screenX`** read-only property of the MouseEvent interface provides the horizontal coordinate (offset) of the mouse pointer in screen coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenX)
     */
    val screenX: Int

    /**
     * The **`screenY`** read-only property of the MouseEvent interface provides the vertical coordinate (offset) of the mouse pointer in screen coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenY)
     */
    val screenY: Int

    /**
     * The **`MouseEvent.shiftKey`** read-only property is a boolean value that indicates whether the <kbd>shift</kbd> key was pressed or not when a given mouse event occurs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/shiftKey)
     */
    val shiftKey: Boolean

    /**
     * The **`MouseEvent.x`** property is an alias for the MouseEvent.clientX property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/x)
     */
    val x: Double

    /**
     * The **`MouseEvent.y`** property is an alias for the MouseEvent.clientY property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/y)
     */
    val y: Double

    /**
     * The **`MouseEvent.getModifierState()`** method returns the current state of the specified modifier key: `true` if the modifier is active (i.e., the modifier key is pressed or locked), otherwise, `false`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/getModifierState)
     */
    fun getModifierState(keyArg: ModifierKeyCode): Boolean

    companion object
}

inline fun MouseEvent.asInit(): MouseEventInit =
    unsafeCast(this)

inline val MouseEvent.Companion.DBL_CLICK: EventType<MouseEvent>
    get() = EventType("dblclick")

inline val MouseEvent.Companion.MOUSE_DOWN: EventType<MouseEvent>
    get() = EventType("mousedown")

inline val MouseEvent.Companion.MOUSE_ENTER: EventType<MouseEvent>
    get() = EventType("mouseenter")

inline val MouseEvent.Companion.MOUSE_LEAVE: EventType<MouseEvent>
    get() = EventType("mouseleave")

inline val MouseEvent.Companion.MOUSE_MOVE: EventType<MouseEvent>
    get() = EventType("mousemove")

inline val MouseEvent.Companion.MOUSE_OUT: EventType<MouseEvent>
    get() = EventType("mouseout")

inline val MouseEvent.Companion.MOUSE_OVER: EventType<MouseEvent>
    get() = EventType("mouseover")

inline val MouseEvent.Companion.MOUSE_UP: EventType<MouseEvent>
    get() = EventType("mouseup")
