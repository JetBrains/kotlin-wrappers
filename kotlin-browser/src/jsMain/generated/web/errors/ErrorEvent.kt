// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.errors

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Events providing information related to errors in scripts or in files.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent)
 */
open external class ErrorEvent(
    override val type: EventType<ErrorEvent, EventTarget>,
    init: ErrorEventInit = definedExternally,
) : Event {
    val colno: Int
    val error: Any?
    val filename: String
    val lineno: Int
    val message: String

    @JsAlias(THIS)
    override fun asInit(): ErrorEventInit

    companion object : ErrorEventTypes
}
