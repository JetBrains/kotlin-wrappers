// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.push

import seskar.js.JsValue

sealed external interface PushEncryptionKeyName {
    companion object {
        @JsValue("auth")
        val auth: PushEncryptionKeyName

        @JsValue("p256dh")
        val p256dh: PushEncryptionKeyName
    }
}
