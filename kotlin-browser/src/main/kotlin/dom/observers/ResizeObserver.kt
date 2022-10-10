package dom.observers

import dom.Element
import dom.geometry.DOMRectReadOnly
import kotlinx.js.ReadonlyArray

typealias ResizeObserverCallback = (
    entries: ReadonlyArray<ResizeObserverEntry>,
    observer: ResizeObserver,
) -> Unit

external class ResizeObserverEntry {
    val target: Element
    val contentRect: DOMRectReadOnly
}

external class ResizeObserver(
    callback: ResizeObserverCallback,
) {
    fun observe(target: Element)
    fun unobserve(target: Element)
    fun disconnect()
}
