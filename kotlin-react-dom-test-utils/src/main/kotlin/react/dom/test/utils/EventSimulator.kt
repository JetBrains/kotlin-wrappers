@file:Suppress(
    "NOTHING_TO_INLINE",
)

package react.dom.test.utils

import js.core.jso
import web.dom.Element
import web.events.EventInit

class EventSimulator<O : EventInit>
private constructor() {
    inline operator fun invoke(
        element: Element, /* | Component<any> */
    ) {
        asDynamic()(element)
    }

    inline operator fun invoke(
        element: Element, /* | Component<any> */
        options: O,
    ) {
        asDynamic()(element, options)
    }

    inline operator fun invoke(
        element: Element, /* | Component<any> */
        block: O.() -> Unit,
    ) {
        this(element, options = jso(block))
    }
}
