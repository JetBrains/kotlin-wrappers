package react.dom

import org.w3c.dom.*
import react.*

fun render(container: Element?, callback: () -> Unit = {}, handler: RBuilder.() -> Unit) =
    render(buildElements(handler), container, callback)

// 18.0+
fun createRoot(container: Element?, options: ReactRootOptions? = null, handler: RBuilder.() -> Unit): ReactElement =
    createRoot(container, options).render(buildElements(handler))

fun hydrate(container: Element?, callback: () -> Unit = {}, handler: RBuilder.() -> Unit) =
    hydrate(buildElements(handler), container, callback)

fun createPortal(container: Element?, handler: RBuilder.() -> Unit) =
    createPortal(buildElements(handler), container)
