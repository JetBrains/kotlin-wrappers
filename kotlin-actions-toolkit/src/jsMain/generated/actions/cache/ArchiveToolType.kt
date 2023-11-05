// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.cache

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ArchiveToolType {
    companion object {
        @JsValue("gnu")
        val GNU: ArchiveToolType

        @JsValue("bsd")
        val BSD: ArchiveToolType
    }
}
