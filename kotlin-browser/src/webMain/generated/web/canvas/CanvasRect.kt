// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.internal.InternalApi
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasRect {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clearRect)
     */
    fun clearRect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillRect)
     */
    fun fillRect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeRect)
     */
    fun strokeRect(
        x: Double,
        y: Double,
        w: Double,
        h: Double,
    ): Unit = definedExternally
}
