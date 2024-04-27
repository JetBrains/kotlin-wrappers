// Automatically generated - do not modify!

package web.images

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
