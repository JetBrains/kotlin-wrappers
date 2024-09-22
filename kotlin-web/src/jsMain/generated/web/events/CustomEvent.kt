// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.events

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent)
 */
open external class CustomEvent<out D>(
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
