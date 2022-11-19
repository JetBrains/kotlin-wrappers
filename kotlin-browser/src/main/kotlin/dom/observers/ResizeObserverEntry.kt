package dom.observers

import dom.Element
import dom.geometry.DOMRectReadOnly

external class ResizeObserverEntry {
    val target: Element
    val contentRect: DOMRectReadOnly
}
