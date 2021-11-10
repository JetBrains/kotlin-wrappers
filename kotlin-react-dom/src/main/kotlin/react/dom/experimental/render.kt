package react.dom.experimental

import org.w3c.dom.Element
import react.dom.render
import react.experimental.Render
import react.experimental.createElement

fun render(
    container: Element,
    block: Render,
) {
    render(
        element = createElement(block),
        container = container,
    )
}
