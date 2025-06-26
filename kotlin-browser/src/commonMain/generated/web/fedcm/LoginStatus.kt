// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fedcm

import js.reflect.unsafeCast

sealed external interface LoginStatus {
    companion object
}

inline val LoginStatus.Companion.loggedIn: LoginStatus
    get() = unsafeCast("loggedIn")

inline val LoginStatus.Companion.loggedOut: LoginStatus
    get() = unsafeCast("loggedOut")
