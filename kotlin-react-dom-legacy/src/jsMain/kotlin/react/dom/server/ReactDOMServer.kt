package react.dom.server

import react.Props
import react.Render
import react.createElement

fun renderToString(handler: Render) = rawRenderToString(createElement<Props>(handler))

fun renderToStaticMarkup(handler: Render) = rawRenderToStaticMarkup(createElement<Props>(handler))
