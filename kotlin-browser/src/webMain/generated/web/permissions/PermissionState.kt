// Automatically generated - do not modify!

package web.permissions

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/state)
 */
@JsUnion
sealed /* union */
external interface PermissionState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/state#denied)
 */
inline val PermissionState.Companion.denied: PermissionState
    get() = unsafeCast("denied")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/state#granted)
 */
inline val PermissionState.Companion.granted: PermissionState
    get() = unsafeCast("granted")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/state#prompt)
 */
inline val PermissionState.Companion.prompt: PermissionState
    get() = unsafeCast("prompt")
