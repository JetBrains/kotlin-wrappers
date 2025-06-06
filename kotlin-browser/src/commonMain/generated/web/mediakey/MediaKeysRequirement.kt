// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediakey

import seskar.js.JsValue

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
