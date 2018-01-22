package react.dom

import org.w3c.dom.*
import react.*

fun render(container: Element?, handler: RBuilder.() -> Unit, callback: () -> Unit) =
    render(buildElements(handler), container, callback)

fun hydrate(container: Element?, handler: RBuilder.() -> Unit, callback: () -> Unit) =
    hydrate(buildElements(handler), container, callback)

fun createPortal(container: Element?, handler: RBuilder.() -> Unit) =
    createPortal(buildElements(handler), container)
