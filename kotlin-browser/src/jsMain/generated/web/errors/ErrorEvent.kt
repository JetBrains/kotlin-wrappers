// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.errors

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface ErrorEventInit : EventInit {
    var colno: Int?
    var error: Any?
    var filename: String?
    var lineno: Int?
    var message: String?
}

/**
 * Events providing information related to errors in scripts or in files.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent)
 */
open external class ErrorEvent(
    override val type: EventType<ErrorEvent>,
    init: ErrorEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/colno) */
    val colno: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/error) */
    val error: Any?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/filename) */
    val filename: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/lineno) */
    val lineno: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/message) */
    val message: String

    companion object
}
