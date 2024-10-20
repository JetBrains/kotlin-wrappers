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
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/colno)
     */
    val colno: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/error)
     */
    val error: Any?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/filename)
     */
    val filename: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/lineno)
     */
    val lineno: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/message)
     */
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
