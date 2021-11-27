package react.dom

import org.w3c.dom.Element
import react.Render
import react.createElement

fun hydrate(
    container: Element,
    callback: () -> Unit = {},
    handler: Render,
) {
    hydrate(
        element = createElement(handler),
        container = container,
        callback = callback,
    )
}
