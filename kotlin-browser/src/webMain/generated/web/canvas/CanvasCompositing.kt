// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.canvas

import js.internal.InternalApi
import kotlin.js.definedExternally

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface CanvasCompositing {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalAlpha)
     */
    var globalAlpha: Double
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation)
     */
    var globalCompositeOperation: GlobalCompositeOperation
        get() = definedExternally
        set(value) = definedExternally
}
