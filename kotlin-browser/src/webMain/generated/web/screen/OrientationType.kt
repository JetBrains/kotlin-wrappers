// Automatically generated - do not modify!

package web.screen

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type)
 */
@JsUnion
sealed /* union */
external interface OrientationType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type#landscape-primary)
 */
inline val OrientationType.Companion.landscapePrimary: OrientationType
    get() = unsafeCast("landscape-primary")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type#landscape-secondary)
 */
inline val OrientationType.Companion.landscapeSecondary: OrientationType
    get() = unsafeCast("landscape-secondary")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type#portrait-primary)
 */
inline val OrientationType.Companion.portraitPrimary: OrientationType
    get() = unsafeCast("portrait-primary")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type#portrait-secondary)
 */
inline val OrientationType.Companion.portraitSecondary: OrientationType
    get() = unsafeCast("portrait-secondary")
