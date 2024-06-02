package react.dom.server

import react.Props
import react.Render
import react.createElement

fun renderToString(handler: Render): String =
    rawRenderToString(createElement<Props>(handler))

fun renderToStaticMarkup(handler: Render): String =
    rawRenderToStaticMarkup(createElement<Props>(handler))
