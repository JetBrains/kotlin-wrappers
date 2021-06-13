package react.dom

import org.w3c.dom.*
import react.*

fun render(container: Element?, callback: () -> Unit = {}, handler: RRender) =
    render(buildElements(handler), container, callback)

// 18.0+
// TODO rename to render() after React 18 is released
fun renderIntoRoot(container: Element?, options: ReactRootOptions? = null, handler: RRender): ReactElement =
    createRoot(container, options).render(buildElements(handler))

fun hydrate(container: Element?, callback: () -> Unit = {}, handler: RRender) =
    hydrate(buildElements(handler), container, callback)

fun createPortal(container: Element?, handler: RRender) =
    createPortal(buildElements(handler), container)
