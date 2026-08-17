// Automatically generated - do not modify!

package web.push

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PushEncryptionKeyName

inline val PushEncryptionKeyName.Companion.auth: PushEncryptionKeyName
    get() = unsafeCast("auth")

inline val PushEncryptionKeyName.Companion.p256dh: PushEncryptionKeyName
    get() = unsafeCast("p256dh")
