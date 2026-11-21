// Automatically generated - do not modify!

package web.gpu

import js.internal.InternalApi

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface GPUDebugCommandsMixin {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/insertDebugMarker)
     */
    fun insertDebugMarker(markerLabel: String)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/popDebugGroup)
     */
    fun popDebugGroup()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCommandEncoder/pushDebugGroup)
     */
    fun pushDebugGroup(groupLabel: String)
}
