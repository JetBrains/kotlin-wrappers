// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy)
 */
@JsUnion
sealed /* union */
external interface ReferrerPolicy

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy#sect)
 */
inline val ReferrerPolicy.Companion.none: ReferrerPolicy
    get() = unsafeCast("")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy#no-referrer)
 */
inline val ReferrerPolicy.Companion.noReferrer: ReferrerPolicy
    get() = unsafeCast("no-referrer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy#no-referrer-when-downgrade)
 */
inline val ReferrerPolicy.Companion.noReferrerWhenDowngrade: ReferrerPolicy
    get() = unsafeCast("no-referrer-when-downgrade")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy#origin)
 */
inline val ReferrerPolicy.Companion.origin: ReferrerPolicy
    get() = unsafeCast("origin")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy#origin-when-cross-origin)
 */
inline val ReferrerPolicy.Companion.originWhenCrossOrigin: ReferrerPolicy
    get() = unsafeCast("origin-when-cross-origin")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy#same-origin)
 */
inline val ReferrerPolicy.Companion.sameOrigin: ReferrerPolicy
    get() = unsafeCast("same-origin")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy#strict-origin)
 */
inline val ReferrerPolicy.Companion.strictOrigin: ReferrerPolicy
    get() = unsafeCast("strict-origin")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy#strict-origin-when-cross-origin)
 */
inline val ReferrerPolicy.Companion.strictOriginWhenCrossOrigin: ReferrerPolicy
    get() = unsafeCast("strict-origin-when-cross-origin")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy#unsafe-url)
 */
inline val ReferrerPolicy.Companion.unsafeUrl: ReferrerPolicy
    get() = unsafeCast("unsafe-url")
