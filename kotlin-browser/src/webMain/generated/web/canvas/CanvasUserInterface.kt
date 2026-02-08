// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.internal.InternalApi
import web.dom.Element
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasUserInterface {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded)
     */
    fun drawFocusIfNeeded(element: Element): Unit = definedExternally
    fun drawFocusIfNeeded(
        path: Path2D,
        element: Element,
    ): Unit = definedExternally
}
