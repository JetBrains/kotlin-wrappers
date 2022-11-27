// Automatically generated - do not modify!

package dom.observers

import dom.Element
import dom.geometry.DOMRectReadOnly
import js.core.ReadonlyArray

sealed external class ResizeObserverEntry {
    val borderBoxSize: ReadonlyArray<ResizeObserverSize>
    val contentBoxSize: ReadonlyArray<ResizeObserverSize>
    val contentRect: DOMRectReadOnly
    val devicePixelContentBoxSize: ReadonlyArray<ResizeObserverSize>
    val target: Element
}
