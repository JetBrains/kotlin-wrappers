package react.dom.server

import react.*

fun renderToString(handler: RRender) = rawRenderToString(buildElements(handler))

fun renderToStaticMarkup(handler: RRender) = rawRenderToStaticMarkup(buildElements(handler))
