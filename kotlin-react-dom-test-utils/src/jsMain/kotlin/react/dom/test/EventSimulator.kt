package react.dom.test

import js.core.jso
import web.dom.Element
import web.events.EventInit

sealed external interface EventSimulator<O : EventInit> {
    @nativeInvoke
    @Suppress("DEPRECATION")
    operator fun invoke(
        element: Element, /* | Component<any> */
    )

    @nativeInvoke
    @Suppress("DEPRECATION")
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
