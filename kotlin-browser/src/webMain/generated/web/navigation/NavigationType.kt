// Automatically generated - do not modify!

package web.navigation

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface NavigationType

inline val NavigationType.Companion.push: NavigationType
    get() = unsafeCast("push")

inline val NavigationType.Companion.reload: NavigationType
    get() = unsafeCast("reload")

inline val NavigationType.Companion.replace: NavigationType
    get() = unsafeCast("replace")

inline val NavigationType.Companion.traverse: NavigationType
    get() = unsafeCast("traverse")
