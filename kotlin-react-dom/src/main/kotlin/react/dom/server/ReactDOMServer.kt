package react.dom.server

import react.RRender
import react.buildElements

fun renderToString(handler: RRender) = rawRenderToString(buildElements(handler))

fun renderToStaticMarkup(handler: RRender) = rawRenderToStaticMarkup(buildElements(handler))
