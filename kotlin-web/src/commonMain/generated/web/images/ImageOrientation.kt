// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.images

import seskar.js.JsValue

sealed external interface ImageOrientation {
    companion object {
        @JsValue("flipY")
        val flipY: ImageOrientation

        @JsValue("from-image")
        val fromImage: ImageOrientation

        @JsValue("none")
        val none: ImageOrientation
    }
}
