package react.dom

import org.w3c.dom.*
import react.*

fun render(container: Element?, callback: () -> Unit = {}, handler: RBuilder.() -> Unit) =
    render(buildElements(handler), container, callback)

fun hydrate(container: Element?, callback: () -> Unit = {}, handler: RBuilder.() -> Unit) =
    hydrate(buildElements(handler), container, callback)

fun createPortal(container: Element?, handler: RBuilder.() -> Unit) =
    createPortal(buildElements(handler), container)
