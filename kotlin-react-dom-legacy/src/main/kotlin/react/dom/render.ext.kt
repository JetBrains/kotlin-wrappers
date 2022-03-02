package react.dom

import org.w3c.dom.Element
import react.Props
import react.Render
import react.createElement
import react.dom.client.createRoot

fun render(
    container: Element,
    callback: () -> Unit = {},
    handler: Render,
) {
    render(
        element = createElement<Props>(handler),
        container = container,
        callback = callback,
    )
}

// 18.0+
// TODO rename to render() after React 18 is released
fun renderIntoRoot(
    container: Element,
    block: Render,
) {
    val children = createElement<Props>(block)
        ?: return

    createRoot(container)
        .render(children)
}
