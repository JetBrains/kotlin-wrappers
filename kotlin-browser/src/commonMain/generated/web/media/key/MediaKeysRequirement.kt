// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.media.key

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
