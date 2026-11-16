// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue

sealed /* union */
external interface Size {
    companion object {
        @JsValue("small")
        val small: small

        @JsValue("medium")
        val medium: medium

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

sealed /* union */
external interface BaseSize

sealed /* union */
external interface NormalSize
