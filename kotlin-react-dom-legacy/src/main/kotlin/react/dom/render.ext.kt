package react.dom

import org.w3c.dom.Element
import react.Props
import react.Render
import react.createElement

fun render(
    container: Element,
    callback: () -> Unit = {},
    handler: Render,
) {
    render(
        element = createElement<Props>(handler),
        container = container,
        callback = callback,
    )
}
