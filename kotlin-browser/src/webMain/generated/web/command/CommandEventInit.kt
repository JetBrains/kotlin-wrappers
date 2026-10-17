// Automatically generated - do not modify!

package web.command

import kotlinx.js.JsPlainObject
import web.dom.Element
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent/CommandEvent#options)
 */
@JsPlainObject
external interface CommandEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent/CommandEvent#command)
     */
    var command: Command?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent/CommandEvent#source)
     */
    var source: Element?
}
