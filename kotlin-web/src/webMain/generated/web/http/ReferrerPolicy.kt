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
    get() = unsafeCast("")

inline val ReferrerPolicy.Companion.noReferrer: ReferrerPolicy
    get() = unsafeCast("no-referrer")

inline val ReferrerPolicy.Companion.noReferrerWhenDowngrade: ReferrerPolicy
    get() = unsafeCast("no-referrer-when-downgrade")

inline val ReferrerPolicy.Companion.origin: ReferrerPolicy
    get() = unsafeCast("origin")

inline val ReferrerPolicy.Companion.originWhenCrossOrigin: ReferrerPolicy
    get() = unsafeCast("origin-when-cross-origin")

inline val ReferrerPolicy.Companion.sameOrigin: ReferrerPolicy
    get() = unsafeCast("same-origin")

inline val ReferrerPolicy.Companion.strictOrigin: ReferrerPolicy
    get() = unsafeCast("strict-origin")

inline val ReferrerPolicy.Companion.strictOriginWhenCrossOrigin: ReferrerPolicy
    get() = unsafeCast("strict-origin-when-cross-origin")

inline val ReferrerPolicy.Companion.unsafeUrl: ReferrerPolicy
    get() = unsafeCast("unsafe-url")
