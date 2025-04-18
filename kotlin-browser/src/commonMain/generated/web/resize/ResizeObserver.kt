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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver/disconnect)
     */
    fun disconnect()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver/observe)
     */
    fun observe(
        target: Element,
        options: ResizeObserverOptions = definedExternally,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserver/unobserve)
     */
    fun unobserve(target: Element)
}
