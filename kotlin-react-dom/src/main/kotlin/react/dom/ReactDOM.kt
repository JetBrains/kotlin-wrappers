package react.dom

import org.w3c.dom.Element
import react.ReactPortal
import react.Render
import react.createElement

fun render(
    container: Element,
    callback: () -> Unit = {},
    handler: Render,
) {
    render(
        element = createElement(handler),
        container = container,
        callback = callback,
    )
}

// 18.0+
// TODO rename to render() after React 18 is released
fun renderIntoRoot(
    container: Element,
    options: RootOptions? = null,
    handler: Render,
) {
    createRoot(container, options)
        .render(createElement(handler))
}

fun hydrate(
    container: Element,
    callback: () -> Unit = {},
    handler: Render,
) {
    hydrate(
        element = createElement(handler),
        container = container,
        callback = callback,
    )
}

fun createPortal(
    container: Element,
    handler: Render,
): ReactPortal =
    createPortal(
        element = createElement(handler),
        container = container,
    )
