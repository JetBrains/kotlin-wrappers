// Automatically generated - do not modify!

package web.touch

import js.reflect.unsafeCast
import web.events.EventType
import web.uievents.UIEvent
import kotlin.js.definedExternally

/**
 * The **`TouchEvent`** interface represents an UIEvent which is sent when the state of contacts with a touch-sensitive surface changes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent)
 */
open external class TouchEvent(
    override val type: EventType<TouchEvent>,
    init: TouchEventInit = definedExternally,
) : UIEvent {
    /**
     * The read-only **`altKey`** property of the TouchEvent interface returns a boolean value indicating whether or not the <kbd>alt</kbd> (Alternate) key is enabled when the touch event is created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/altKey)
     */
    val altKey: Boolean

    /**
     * The **`changedTouches`** read-only property is a TouchList whose touch points (Touch objects) varies depending on the event type, as follows: - For the Element/touchstart_event event, it is a list of the touch points that became active with the current event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/changedTouches)
     */
    val changedTouches: TouchList

    /**
     * The read-only **`ctrlKey`** property of the TouchEvent interface returns a boolean value indicating whether the <kbd>control</kbd> (Control) key is enabled when the touch event is created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/ctrlKey)
     */
    val ctrlKey: Boolean

    /**
     * The read-only **`metaKey`** property of the TouchEvent interface returns a boolean value indicating whether or not the <kbd>Meta</kbd> key is enabled when the touch event is created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/metaKey)
     */
    val metaKey: Boolean

    /**
     * The read-only **`shiftKey`** property of the `TouchEvent` interface returns a boolean value indicating whether or not the <kbd>shift</kbd> key is enabled when the touch event is created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/shiftKey)
     */
    val shiftKey: Boolean

    /**
     * The **`targetTouches`** read-only property is a TouchList listing all the Touch objects for touch points that are still in contact with the touch surface **and** whose Element/touchstart_event event occurred inside the same target element as the current target element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/targetTouches)
     */
    val targetTouches: TouchList

    /**
     * **`touches`** is a read-only TouchList listing all the Touch objects for touch points that are currently in contact with the touch surface, regardless of whether or not they've changed or what their target element was at Element/touchstart_event time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/touches)
     */
    val touches: TouchList

    companion object
}

inline fun TouchEvent.asInit(): TouchEventInit =
    unsafeCast(this)

inline val TouchEvent.Companion.TOUCH_CANCEL: EventType<TouchEvent>
    get() = EventType("touchcancel")

inline val TouchEvent.Companion.TOUCH_END: EventType<TouchEvent>
    get() = EventType("touchend")

inline val TouchEvent.Companion.TOUCH_MOVE: EventType<TouchEvent>
    get() = EventType("touchmove")

inline val TouchEvent.Companion.TOUCH_START: EventType<TouchEvent>
    get() = EventType("touchstart")
