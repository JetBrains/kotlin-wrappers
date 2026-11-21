// Automatically generated - do not modify!

package js.typedarrays

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/fromBase64#lastchunkhandling)
 */
@JsUnion
sealed /* union */
external interface LastChunkHandling

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/fromBase64#:~:text=loose)
 */
inline val LastChunkHandling.Companion.loose: LastChunkHandling
    get() = unsafeCast("loose")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/fromBase64#:~:text=strict)
 */
inline val LastChunkHandling.Companion.strict: LastChunkHandling
    get() = unsafeCast("strict")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Uint8Array/fromBase64#:~:text=stop-before-partial)
 */
inline val LastChunkHandling.Companion.stopBeforePartial: LastChunkHandling
    get() = unsafeCast("stop-before-partial")
