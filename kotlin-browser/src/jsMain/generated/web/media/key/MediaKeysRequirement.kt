// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.key

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MediaKeysRequirement {
    companion object {
        @JsValue("not-allowed")
        val notAllowed: MediaKeysRequirement

        @JsValue("optional")
        val optional: MediaKeysRequirement

        @JsValue("required")
        val required: MediaKeysRequirement
    }
}
