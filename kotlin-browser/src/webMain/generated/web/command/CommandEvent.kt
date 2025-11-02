// Automatically generated - do not modify!

package web.command

import web.dom.Element
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`CommandEvent`** interface represents an event notifying the user when a button element with valid commandForElement and command attributes is about to invoke an interactive element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent)
 */
open external class CommandEvent(
    override val type: EventType<CommandEvent>,
    init: CommandEventInit = definedExternally,
) : Event {
    /**
     * The **`command`** read-only property of the CommandEvent interface returns a string containing the value of the command property at the time the event was dispatched.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent/command)
     */
    val command: Command

    /**
     * The **`source`** read-only property of the CommandEvent interface returns an EventTarget representing the control that invoked the given command.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent/source)
     */
    val source: Element?
}
