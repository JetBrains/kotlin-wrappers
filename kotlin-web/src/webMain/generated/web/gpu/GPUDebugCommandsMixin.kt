// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.JsExternalInheritorsOnly
import kotlin.js.definedExternally

/* mixin */
@JsExternalInheritorsOnly
external interface GPUDebugCommandsMixin {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/insertDebugMarker)
     */
    fun insertDebugMarker(markerLabel: String): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/popDebugGroup)
     */
    fun popDebugGroup(): Unit = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/pushDebugGroup)
     */
    fun pushDebugGroup(groupLabel: String): Unit = definedExternally
}
