package react.dom.server

import react.Render
import react.buildElements

fun renderToString(handler: Render) = rawRenderToString(buildElements(handler))

fun renderToStaticMarkup(handler: Render) = rawRenderToStaticMarkup(buildElements(handler))
