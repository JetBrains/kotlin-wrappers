package react.dom.test

import js.objects.jso
import seskar.js.JsNative
import web.dom.Element
import web.events.EventInit

sealed external interface EventSimulator<O : EventInit> {
    @JsNative
    operator fun invoke(
        element: Element, /* | Component<any> */
    )

    @JsNative
    operator fun invoke(
        element: Element, /* | Component<any> */
        options: O,
    )
}

inline operator fun <O : EventInit> EventSimulator<O>.invoke(
    element: Element, /* | Component<any> */
    block: O.() -> Unit,
) {
    this(element, options = jso(block))
}
