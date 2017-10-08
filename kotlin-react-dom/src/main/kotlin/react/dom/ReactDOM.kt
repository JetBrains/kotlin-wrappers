package react.dom

import org.w3c.dom.*
import react.*

fun render(container: Element?, handler: RBuilder.() -> Unit) =
    render(buildElements(handler), container)

fun hydrate(container: Element?, handler: RBuilder.() -> Unit) =
    hydrate(buildElements(handler), container)
