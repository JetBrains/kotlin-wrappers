// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SourceFileType {
    companion object {
        @JsValue("js")
        val js: SourceFileType

        @JsValue("dts")
        val dts: SourceFileType
    }
}
