// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fullscreen

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FullscreenNavigationUI {
    companion object {
        @JsValue("auto")
        val auto: FullscreenNavigationUI

        @JsValue("hide")
        val hide: FullscreenNavigationUI

        @JsValue("show")
        val show: FullscreenNavigationUI
    }
}
