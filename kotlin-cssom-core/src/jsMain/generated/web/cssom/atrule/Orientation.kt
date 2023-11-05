// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom.atrule

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Orientation {
    companion object {
        @JsValue("portrait")
        val portrait: Orientation

        @JsValue("landscape")
        val landscape: Orientation
    }
}
