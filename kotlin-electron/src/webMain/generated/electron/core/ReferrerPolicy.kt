// Automatically generated - do not modify!

package electron.core

sealed external interface ReferrerPolicy {
    companion object
}

inline val ReferrerPolicy.Companion.default: ReferrerPolicy
    get() = js.reflect.unsafeCast("default")

inline val ReferrerPolicy.Companion.unsafeUrl: ReferrerPolicy
    get() = js.reflect.unsafeCast("unsafe-url")

inline val ReferrerPolicy.Companion.noReferrerWhenDowngrade: ReferrerPolicy
    get() = js.reflect.unsafeCast("no-referrer-when-downgrade")

inline val ReferrerPolicy.Companion.noReferrer: ReferrerPolicy
    get() = js.reflect.unsafeCast("no-referrer")

inline val ReferrerPolicy.Companion.origin: ReferrerPolicy
    get() = js.reflect.unsafeCast("origin")

inline val ReferrerPolicy.Companion.strictOriginWhenCrossOrigin: ReferrerPolicy
    get() = js.reflect.unsafeCast("strict-origin-when-cross-origin")

inline val ReferrerPolicy.Companion.sameOrigin: ReferrerPolicy
    get() = js.reflect.unsafeCast("same-origin")

inline val ReferrerPolicy.Companion.strictOrigin: ReferrerPolicy
    get() = js.reflect.unsafeCast("strict-origin")
