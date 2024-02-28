// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.errors

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Events providing information related to errors in scripts or in files.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent)
 */
open external class ErrorEvent<out C : EventTarget?>(
    override val type: EventType<ErrorEvent<EventTarget>>,
    init: ErrorEventInit = definedExternally,
) : Event<C>,
    ErrorEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/colno)
     */
    override val colno: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/error)
     */
    override val error: Any?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/filename)
     */
    override val filename: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/lineno)
     */
    override val lineno: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/message)
     */
    override val message: String

    companion object : ErrorEventTypes
}
