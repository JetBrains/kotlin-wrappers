// Automatically generated - do not modify!

package web.dom.observers

import js.array.ReadonlyArray
import web.dom.Element
import web.geometry.DOMRectReadOnly

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry)
 */
external class ResizeObserverEntry
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/borderBoxSize)
     */
    val borderBoxSize: ReadonlyArray<ResizeObserverSize>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentBoxSize)
     */
    val contentBoxSize: ReadonlyArray<ResizeObserverSize>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentRect)
     */
    val contentRect: DOMRectReadOnly

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/devicePixelContentBoxSize)
     */
    val devicePixelContentBoxSize: ReadonlyArray<ResizeObserverSize>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/target)
     */
    val target: Element
}
