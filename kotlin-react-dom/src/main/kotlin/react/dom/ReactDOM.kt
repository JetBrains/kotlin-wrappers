package react.dom

import org.w3c.dom.Element
import react.ReactElement
import react.Render
import react.createElement

fun render(container: Element?, callback: () -> Unit = {}, handler: Render) =
    render(createElement(handler), container, callback)

// 18.0+
// TODO rename to render() after React 18 is released
fun renderIntoRoot(container: Element?, options: ReactRootOptions? = null, handler: Render): ReactElement =
    createRoot(container, options).render(createElement(handler))

fun hydrate(container: Element?, callback: () -> Unit = {}, handler: Render) =
    hydrate(createElement(handler), container, callback)

fun createPortal(container: Element?, handler: Render) =
    createPortal(createElement(handler), container)
