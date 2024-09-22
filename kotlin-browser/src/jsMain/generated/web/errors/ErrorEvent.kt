// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.errors

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * Events providing information related to errors in scripts or in files.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent)
 */
open external class ErrorEvent(
    override val type: EventType<ErrorEvent>,
    init: ErrorEventInit = definedExternally,
) : Event {
    val colno: Int
    val error: Any?
    val filename: String
    val lineno: Int
    val message: String

    @JsAlias(THIS)
    override fun asInit(): ErrorEventInit

    companion object {
        @JsValue("error")
        val ERROR: EventType<ErrorEvent>

        @JsValue("processorerror")
        val PROCESSOR_ERROR: EventType<ErrorEvent>
    }
}
