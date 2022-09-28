package dom

import kotlinx.js.ReadonlyArray
import org.w3c.dom.DOMRectReadOnly

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
