package react.dom.server

import react.Props
import react.Render
import react.createElement

fun renderToString(handler: Render): String =
    renderToString(element = createElement<Props>(handler))

fun renderToStaticMarkup(handler: Render): String =
    renderToStaticMarkup(element = createElement<Props>(handler))
