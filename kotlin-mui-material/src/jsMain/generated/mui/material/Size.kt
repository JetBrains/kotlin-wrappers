// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual()
sealed external interface Size {
    companion object {
        @JsValue("small")
        val small: small

        @JsValue("medium")
        val pkcs8: medium

        @JsValue("normal")
        val normal: normal

        @JsValue("large")
        val large: large
    }

    sealed interface small : Size, BaseSize, NormalSize
    sealed interface medium : Size, BaseSize
    sealed interface normal : NormalSize
    sealed interface large : Size
}

sealed external interface BaseSize
sealed external interface NormalSize
