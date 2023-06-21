// Automatically generated - do not modify!

package web.dom.observers

import js.core.ReadonlyArray
import web.dom.Element
import web.geometry.DOMRectReadOnly

sealed external class ResizeObserverEntry {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/borderBoxSize) */
    val borderBoxSize: ReadonlyArray<ResizeObserverSize>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentBoxSize) */
    val contentBoxSize: ReadonlyArray<ResizeObserverSize>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentRect) */
    val contentRect: DOMRectReadOnly
    val devicePixelContentBoxSize: ReadonlyArray<ResizeObserverSize>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/target) */
    val target: Element
}
