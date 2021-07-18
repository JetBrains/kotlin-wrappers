package react.dom

import org.w3c.dom.Element
import react.ReactElement
import react.Render
import react.buildElements

fun render(container: Element?, callback: () -> Unit = {}, handler: Render) =
    render(buildElements(handler), container, callback)

// 18.0+
// TODO rename to render() after React 18 is released
fun renderIntoRoot(container: Element?, options: ReactRootOptions? = null, handler: Render): ReactElement =
    createRoot(container, options).render(buildElements(handler))

fun hydrate(container: Element?, callback: () -> Unit = {}, handler: Render) =
    hydrate(buildElements(handler), container, callback)

fun createPortal(container: Element?, handler: Render) =
    createPortal(buildElements(handler), container)
