// Automatically generated - do not modify!

package web.mediaencrypted

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MediaKeySessionType

inline val MediaKeySessionType.Companion.persistentLicense: MediaKeySessionType
    get() = unsafeCast("persistent-license")

inline val MediaKeySessionType.Companion.temporary: MediaKeySessionType
    get() = unsafeCast("temporary")
