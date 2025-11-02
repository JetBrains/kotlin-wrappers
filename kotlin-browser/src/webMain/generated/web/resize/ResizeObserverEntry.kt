// Automatically generated - do not modify!

package web.resize

import js.array.ReadonlyArray
import web.dom.Element
import web.geometry.DOMRectReadOnly

/**
 * The **`ResizeObserverEntry`** interface represents the object passed to the ResizeObserver() constructor's callback function, which allows you to access the new dimensions of the Element or SVGElement being observed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry)
 */
open external class ResizeObserverEntry
private constructor() {
    /**
     * The **`borderBoxSize`** read-only property of the ResizeObserverEntry interface returns an array containing the new border box size of the observed element when the callback is run.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/borderBoxSize)
     */
    val borderBoxSize: ReadonlyArray<ResizeObserverSize>

    /**
     * The **`contentBoxSize`** read-only property of the ResizeObserverEntry interface returns an array containing the new content box size of the observed element when the callback is run.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentBoxSize)
     */
    val contentBoxSize: ReadonlyArray<ResizeObserverSize>

    /**
     * The **`contentRect`** read-only property of the ResizeObserverEntry interface returns a DOMRectReadOnly object containing the new size of the observed element when the callback is run. Note that this is better supported than ResizeObserverEntry.borderBoxSize or ResizeObserverEntry.contentBoxSize, but it is left over from an earlier implementation of the Resize Observer API, is still included in the spec for web compat reasons, and may be deprecated in future versions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/contentRect)
     */
    val contentRect: DOMRectReadOnly

    /**
     * The **`devicePixelContentBoxSize`** read-only property of the ResizeObserverEntry interface returns an array containing the size in device pixels of the observed element when the callback is run.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/devicePixelContentBoxSize)
     */
    val devicePixelContentBoxSize: ReadonlyArray<ResizeObserverSize>

    /**
     * The **`target`** read-only property of the ResizeObserverEntry interface returns a reference to the Element or SVGElement that is being observed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverEntry/target)
     */
    val target: Element
}
