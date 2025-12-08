// Automatically generated - do not modify!

package web.errors

import web.events.Event
import web.events.EventType
import kotlin.js.JsAny
import kotlin.js.definedExternally

/**
 * The **`ErrorEvent`** interface represents events providing information related to errors in scripts or in files.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent)
 */
open external class ErrorEvent(
    override val type: EventType<ErrorEvent>,
    init: ErrorEventInit = definedExternally,
) : Event {
    /**
     * The **`colno`** read-only property of the ErrorEvent interface returns an integer containing the column number of the script file on which the error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/colno)
     */
    val colno: Int

    /**
     * The **`error`** read-only property of the ErrorEvent interface returns a JavaScript value, such as an Error or DOMException, representing the error associated with this event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/error)
     */
    val error: JsAny?

    /**
     * The **`filename`** read-only property of the ErrorEvent interface returns a string containing the name of the script file in which the error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/filename)
     */
    val filename: String

    /**
     * The **`lineno`** read-only property of the ErrorEvent interface returns an integer containing the line number of the script file on which the error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/lineno)
     */
    val lineno: Int

    /**
     * The **`message`** read-only property of the ErrorEvent interface returns a string containing a human-readable error message describing the problem.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/message)
     */
    val message: String

    companion object
}

inline val ErrorEvent.Companion.ERROR: EventType<ErrorEvent>
    get() = EventType("error")

inline val ErrorEvent.Companion.NAVIGATE_ERROR: EventType<ErrorEvent>
    get() = EventType("navigateerror")

inline val ErrorEvent.Companion.PROCESSOR_ERROR: EventType<ErrorEvent>
    get() = EventType("processorerror")
