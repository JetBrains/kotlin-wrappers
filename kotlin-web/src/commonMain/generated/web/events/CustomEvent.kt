// Automatically generated - do not modify!

package web.events

import js.core.JsAny
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
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
     * Returns any custom data event was created with. Typically used for synthetic events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent/detail)
     */
    val detail: D

    @JsAlias(THIS)
    override fun asInit(): CustomEventInit<D>
}
