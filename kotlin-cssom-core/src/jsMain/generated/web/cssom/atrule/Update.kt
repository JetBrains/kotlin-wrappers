// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom.atrule

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Update {
    companion object {
        @JsValue("none")
        val none: Update

        @JsValue("slow")
        val slow: Update

        @JsValue("fast")
        val fast: Update
    }
}
