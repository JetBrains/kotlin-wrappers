package dom.observers

import dom.Element

external class ResizeObserver(
    callback: ResizeObserverCallback,
) {
    fun observe(
        target: Element,
        options: ResizeObserverOptions = definedExternally,
    )

    fun unobserve(
        target: Element,
    )

    fun disconnect()
}
