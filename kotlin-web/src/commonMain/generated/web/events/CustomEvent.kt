// Automatically generated - do not modify!

package web.events

import js.core.JsAny
import js.reflect.unsafeCast
import kotlin.js.definedExternally

/**
 * The **`CustomEvent`** interface represents events initialized by an application for any purpose.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent)
 */
open external class CustomEvent<out D : JsAny?>(
    override val type: EventType<CustomEvent<D>>,
    init: CustomEventInit<D> = definedExternally,
) : Event {
    /**
     * The read-only **`detail`** property of the CustomEvent interface returns any data passed when initializing the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent/detail)
     */
    val detail: D
}

inline fun <D : JsAny?> CustomEvent<D>.asInit(): CustomEventInit<D> =
    unsafeCast(this)
