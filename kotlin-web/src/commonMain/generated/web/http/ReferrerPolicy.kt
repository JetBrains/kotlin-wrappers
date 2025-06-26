// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface ReferrerPolicy {
    companion object
}

inline val ReferrerPolicy.Companion.none: ReferrerPolicy
    get() = unsafeCast("none")

inline val ReferrerPolicy.Companion.noReferrer: ReferrerPolicy
    get() = unsafeCast("noReferrer")

inline val ReferrerPolicy.Companion.noReferrerWhenDowngrade: ReferrerPolicy
    get() = unsafeCast("noReferrerWhenDowngrade")

inline val ReferrerPolicy.Companion.origin: ReferrerPolicy
    get() = unsafeCast("origin")

inline val ReferrerPolicy.Companion.originWhenCrossOrigin: ReferrerPolicy
    get() = unsafeCast("originWhenCrossOrigin")

inline val ReferrerPolicy.Companion.sameOrigin: ReferrerPolicy
    get() = unsafeCast("sameOrigin")

inline val ReferrerPolicy.Companion.strictOrigin: ReferrerPolicy
    get() = unsafeCast("strictOrigin")

inline val ReferrerPolicy.Companion.strictOriginWhenCrossOrigin: ReferrerPolicy
    get() = unsafeCast("strictOriginWhenCrossOrigin")

inline val ReferrerPolicy.Companion.unsafeUrl: ReferrerPolicy
    get() = unsafeCast("unsafeUrl")
