package react.dom.server

import react.RBuilder

fun renderToString(handler: RBuilder.() -> Unit) = rawRenderToString(react.buildElements(handler))

fun renderToStaticMarkup(handler: RBuilder.() -> Unit) = rawRenderToStaticMarkup(react.buildElements(handler))
