// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.push

import js.reflect.unsafeCast

sealed external interface PushEncryptionKeyName {
    companion object
}

inline val PushEncryptionKeyName.Companion.auth: PushEncryptionKeyName
    get() = unsafeCast("auth")

inline val PushEncryptionKeyName.Companion.p256dh: PushEncryptionKeyName
    get() = unsafeCast("p256dh")
