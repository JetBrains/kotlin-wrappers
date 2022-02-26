package react.dom

import org.w3c.dom.Element
import react.Props
import react.Render
import react.createElement

fun hydrate(
    container: Element,
    callback: () -> Unit = {},
    handler: Render,
) {
    hydrate(
        element = createElement<Props>(handler),
        container = container,
        callback = callback,
    )
}
