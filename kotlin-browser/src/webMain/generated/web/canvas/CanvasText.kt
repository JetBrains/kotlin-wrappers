// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.reflect.JsExternalInheritorsOnly
import kotlin.js.definedExternally

/* mixin */
@JsExternalInheritorsOnly
external interface CanvasText {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillText)
     */
    fun fillText(
        text: String,
        x: Double,
        y: Double,
        maxWidth: Double = definedExternally,
    ): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/measureText)
     */
    fun measureText(text: String): TextMetrics = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeText)
     */
    fun strokeText(
        text: String,
        x: Double,
        y: Double,
        maxWidth: Double = definedExternally,
    ): Unit = definedExternally
}
