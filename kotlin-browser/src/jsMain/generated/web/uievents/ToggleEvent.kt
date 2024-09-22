// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent)
 */
open external class ToggleEvent(
    override val type: EventType<ToggleEvent>,
    init: ToggleEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/newState)
     */
    val newState: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/oldState)
     */
    val oldState: String

    @JsAlias(THIS)
    override fun asInit(): ToggleEventInit

    companion object {
        @JsValue("beforetoggle")
        val BEFORE_TOGGLE: EventType<ToggleEvent>

        @JsValue("toggle")
        val TOGGLE: EventType<ToggleEvent>
    }
}
