package react.dom

import org.w3c.dom.*
import react.*

fun render(container: Element?, handler: RBuilder.() -> Unit) =
    render(buildElement(handler), container)
