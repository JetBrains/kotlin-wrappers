// Automatically generated - do not modify!

package web.dom.observers

import web.dom.Element

external class ResizeObserver(
    callback: ResizeObserverCallback,
) {
    fun disconnect()
    fun observe(
        target: Element,
        options: ResizeObserverOptions = definedExternally,
    )

    fun unobserve(target: Element)
}
