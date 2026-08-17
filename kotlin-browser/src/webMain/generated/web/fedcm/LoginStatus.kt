// Automatically generated - do not modify!

package web.fedcm

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface LoginStatus

inline val LoginStatus.Companion.loggedIn: LoginStatus
    get() = unsafeCast("logged-in")

inline val LoginStatus.Companion.loggedOut: LoginStatus
    get() = unsafeCast("logged-out")
