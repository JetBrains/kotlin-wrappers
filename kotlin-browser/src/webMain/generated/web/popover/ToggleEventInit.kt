// Automatically generated - do not modify!

package web.popover

import kotlinx.js.JsPlainObject
import web.dom.Element
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/ToggleEvent#options)
 */
@JsPlainObject
external interface ToggleEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/ToggleEvent#newState)
     */
    var newState: ToggleState?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/ToggleEvent#oldState)
     */
    var oldState: ToggleState?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/ToggleEvent#source)
     */
    var source: Element?
}
