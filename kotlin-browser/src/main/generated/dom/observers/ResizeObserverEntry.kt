// Automatically generated - do not modify!

package dom.observers

import dom.Element
import js.core.ReadonlyArray
import web.geometry.DOMRectReadOnly

sealed external class ResizeObserverEntry {
    val borderBoxSize: ReadonlyArray<ResizeObserverSize>
    val contentBoxSize: ReadonlyArray<ResizeObserverSize>
    val contentRect: DOMRectReadOnly
    val devicePixelContentBoxSize: ReadonlyArray<ResizeObserverSize>
    val target: Element
}
