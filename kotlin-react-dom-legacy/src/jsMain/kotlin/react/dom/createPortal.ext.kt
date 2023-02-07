package react.dom

import react.Props
import react.ReactPortal
import react.Render
import react.createElement
import web.dom.Element

fun createPortal(
    container: Element,
    handler: Render,
): ReactPortal =
    createPortal(
        children = createElement<Props>(handler),
        container = container,
    )
