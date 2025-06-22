// Automatically generated - do not modify!

package web.uievents

import js.reflect.unsafeCast
import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`FocusEvent`** interface represents focus-related events, including Element/focus_event, Element/blur_event, Element/focusin_event, and Element/focusout_event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent)
 */
open external class FocusEvent(
    override val type: EventType<FocusEvent>,
    init: FocusEventInit = definedExternally,
) : UIEvent {
    /**
     * The **`relatedTarget`** read-only property of the FocusEvent interface is the secondary target, depending on the type of event: <table class='no-markdown'> <thead> <tr> <th scope='col'>Event name</th> <th scope='col'><code>target</code></th> <th scope='col'><code>relatedTarget</code></th> </tr> </thead> <tbody> <tr> <td>Element/blur_event</td> <td>The EventTarget losing focus</td> <td>The EventTarget receiving focus (if any).</td> </tr> <tr> <td>Element/focus_event</td> <td>The EventTarget receiving focus</td> <td>The EventTarget losing focus (if any)</td> </tr> <tr> <td>Element/focusin_event</td> <td>The EventTarget receiving focus</td> <td>The EventTarget losing focus (if any)</td> </tr> <tr> <td>Element/focusout_event</td> <td>The EventTarget losing focus</td> <td>The EventTarget receiving focus (if any)</td> </tr> </tbody> </table> Note that many elements can't have focus, which is a common reason for `relatedTarget` to be `null`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/relatedTarget)
     */
    val relatedTarget: EventTarget?

    companion object {
        @JsValue("blur")
        val BLUR: EventType<FocusEvent>

        @JsValue("focus")
        val FOCUS: EventType<FocusEvent>

        @JsValue("focusin")
        val FOCUS_IN: EventType<FocusEvent>

        @JsValue("focusout")
        val FOCUS_OUT: EventType<FocusEvent>
    }
}

inline fun FocusEvent.asInit(): FocusEventInit =
    unsafeCast(this)
