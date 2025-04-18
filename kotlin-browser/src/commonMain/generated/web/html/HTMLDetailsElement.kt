// Automatically generated - do not modify!

package web.html

import web.events.EventInstance
import web.events.JsEvent
import web.popover.ToggleEvent

/**
 * The **`HTMLDetailsElement`** interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating details elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement)
 */
open external class HTMLDetailsElement
protected constructor() :
    HTMLElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/name)
     */
    var name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/open)
     */
    var open: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/toggle_event)
     */
    @JsEvent("toggle")
    val toggleEvent: EventInstance<ToggleEvent, HTMLDetailsElement /* this */, HTMLDetailsElement /* this */>
}
