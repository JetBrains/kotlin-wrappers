// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface BackgroundAttachment {
    companion object {
        @JsValue("fixed")
        val fixed: BackgroundAttachment

        @JsValue("local")
        val local: BackgroundAttachment

        @JsValue("scroll")
        val scroll: BackgroundAttachment
    }
}
