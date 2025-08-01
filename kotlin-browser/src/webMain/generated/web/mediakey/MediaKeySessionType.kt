// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediakey

import js.reflect.unsafeCast

sealed external interface MediaKeySessionType {
    companion object
}

inline val MediaKeySessionType.Companion.persistentLicense: MediaKeySessionType
    get() = unsafeCast("persistent-license")

inline val MediaKeySessionType.Companion.temporary: MediaKeySessionType
    get() = unsafeCast("temporary")
