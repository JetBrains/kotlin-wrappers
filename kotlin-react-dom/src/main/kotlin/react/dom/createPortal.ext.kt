package react.dom

import org.w3c.dom.Element
import react.ReactPortal
import react.Render
import react.createElement

fun createPortal(
    container: Element,
    handler: Render,
): ReactPortal =
    createPortal(
        element = createElement(handler),
        container = container,
    )
