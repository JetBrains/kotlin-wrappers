// Automatically generated - do not modify!

package web.html

import web.events.EventInstance
import web.events.JsEvent
import web.uievents.ToggleEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement)
 */
open external class HTMLDetailsElement
protected constructor() :
    HTMLElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/open)
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
