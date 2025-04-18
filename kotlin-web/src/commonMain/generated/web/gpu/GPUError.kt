// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.gpu

import kotlin.js.definedExternally

/**
 * The **`GPUError`** interface of the WebGPU API is the base interface for errors surfaced by GPUDevice.popErrorScope and the GPUDevice.uncapturederror_event event.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUError)
 */
sealed external interface GPUError {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUError/message)
     */
    val message: String
        get() = definedExternally
}
