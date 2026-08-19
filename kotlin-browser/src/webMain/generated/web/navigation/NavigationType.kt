// Automatically generated - do not modify!

package web.navigation

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/navigationType)
 */
@JsUnion
sealed /* union */
external interface NavigationType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/navigationType#push)
 */
inline val NavigationType.Companion.push: NavigationType
    get() = unsafeCast("push")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/navigationType#reload)
 */
inline val NavigationType.Companion.reload: NavigationType
    get() = unsafeCast("reload")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/navigationType#replace)
 */
inline val NavigationType.Companion.replace: NavigationType
    get() = unsafeCast("replace")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/navigationType#traverse)
 */
inline val NavigationType.Companion.traverse: NavigationType
    get() = unsafeCast("traverse")
