// Automatically generated - do not modify!

package web.resize

import web.dom.Element
import kotlin.js.definedExternally

/**
 * The **`ResizeObserver`** interface reports changes to the dimensions of an Element's content or border box, or the bounding box of an SVGElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver)
 */
open external class ResizeObserver(
    callback: ResizeObserverCallback,
) {
    /**
     * The **`disconnect()`** method of the ResizeObserver interface unobserves all observed Element or SVGElement targets.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver/disconnect)
     */
    fun disconnect()

    /**
     * The **`observe()`** method of the ResizeObserver interface starts observing the specified Element or SVGElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver/observe)
     */
    fun observe(
        target: Element,
        options: ResizeObserverOptions = definedExternally,
    )

    /**
     * The **`unobserve()`** method of the ResizeObserver interface ends the observing of a specified Element or SVGElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver/unobserve)
     */
    fun unobserve(target: Element)
}
