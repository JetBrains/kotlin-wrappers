// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.push

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PushEncryptionKeyName {
    companion object {
        @JsValue("auth")
        val auth: PushEncryptionKeyName

        @JsValue("p256dh")
        val p256dh: PushEncryptionKeyName
    }
}
