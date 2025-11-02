// Automatically generated - do not modify!

package web.html

import web.events.EventInstance
import web.popover.ToggleEvent

/**
 * The **`HTMLDetailsElement`** interface provides special properties (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating <details> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement)
 */
open external class HTMLDetailsElement
protected constructor() :
    HTMLElement {
    /**
     * The **`name`** property of the HTMLDetailsElement interface reflects the name attribute of <details> elements. It enables multiple <details> elements to be connected together, where only one for the <details> elements can be open at once. This allows developers to easily create UI features such as accordions without scripting.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/name)
     */
    var name: String

    /**
     * The **`open`** property of the HTMLDetailsElement interface is a boolean value reflecting the open HTML attribute, indicating whether the <details>'s contents (not counting the <summary>) is to be shown to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/open)
     */
    var open: Boolean
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/toggle_event)
 */
inline val <C : HTMLDetailsElement> C.toggleEvent: EventInstance<ToggleEvent, C, C>
    get() = EventInstance(this, "toggle")
