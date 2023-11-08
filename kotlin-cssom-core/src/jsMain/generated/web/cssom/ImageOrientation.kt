// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ImageOrientation {
    companion object {
        @JsValue("flip")
        val flip: ImageOrientation

        @JsValue("from-image")
        val fromImage: ImageOrientation
    }
}
