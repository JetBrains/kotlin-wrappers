// Automatically generated - do not modify!

package web.popover

import js.objects.JsPlainObject
import web.dom.Element
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/ToggleEvent#options)
 */
@JsPlainObject
external interface ToggleEventInit :
    EventInit {
    var newState: ToggleState?
    var oldState: ToggleState?
    var source: Element?
}
