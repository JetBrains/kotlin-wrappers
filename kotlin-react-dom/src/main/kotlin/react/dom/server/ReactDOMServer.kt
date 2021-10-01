package react.dom.server

import react.Render
import react.createElement

fun renderToString(handler: Render) = rawRenderToString(createElement(handler))

fun renderToStaticMarkup(handler: Render) = rawRenderToStaticMarkup(createElement(handler))
