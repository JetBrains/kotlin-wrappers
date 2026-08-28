// Automatically generated - do not modify!

package tanstack.virtual.core

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FollowOnAppend

inline val FollowOnAppend.Companion.`false`: FollowOnAppend
    get() = unsafeCast(false)

inline val FollowOnAppend.Companion.`true`: FollowOnAppend
    get() = unsafeCast(true)

inline val FollowOnAppend.Companion.auto: FollowOnAppend
    get() = unsafeCast("auto")

inline val FollowOnAppend.Companion.smooth: FollowOnAppend
    get() = unsafeCast("smooth")

inline val FollowOnAppend.Companion.instant: FollowOnAppend
    get() = unsafeCast("instant")
