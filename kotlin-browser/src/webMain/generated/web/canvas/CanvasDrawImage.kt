// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.reflect.JsExternalInheritorsOnly
import kotlin.js.definedExternally

/* mixin */
@JsExternalInheritorsOnly
external interface CanvasDrawImage {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage)
     */
    fun drawImage(
        image: CanvasImageSource,
        dx: Double,
        dy: Double,
    ): Unit = definedExternally

    fun drawImage(
        image: CanvasImageSource,
        dx: Double,
        dy: Double,
        dw: Double,
        dh: Double,
    ): Unit = definedExternally

    fun drawImage(
        image: CanvasImageSource,
        sx: Double,
        sy: Double,
        sw: Double,
        sh: Double,
        dx: Double,
        dy: Double,
        dw: Double,
        dh: Double,
    ): Unit = definedExternally
}
