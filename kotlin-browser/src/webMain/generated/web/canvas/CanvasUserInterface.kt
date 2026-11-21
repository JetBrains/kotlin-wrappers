// Automatically generated - do not modify!

package web.canvas

import js.internal.InternalApi
import web.dom.Element

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasUserInterface {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded)
     */
    fun drawFocusIfNeeded(element: Element)
    fun drawFocusIfNeeded(
        path: Path2D,
        element: Element,
    )
}
