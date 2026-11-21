// Automatically generated - do not modify!

package web.http

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/crossOrigin)
 */
@JsUnion
sealed /* union */
external interface CrossOrigin

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/crossOrigin#anonymous)
 */
inline val CrossOrigin.Companion.anonymous: CrossOrigin
    get() = unsafeCast("anonymous")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/crossOrigin#use-credentials)
 */
inline val CrossOrigin.Companion.useCredentials: CrossOrigin
    get() = unsafeCast("use-credentials")
