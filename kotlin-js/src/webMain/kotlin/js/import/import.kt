package js.import

import js.promise.Promise
import js.promise.await

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/import)
 */
@JsName("import")
external fun <T : JsAny?> importAsync(
    path: String,
    options: ImportCallOptions = definedExternally,
): Promise<T>

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/import)
 */
suspend fun <T : JsAny?> import(
    path: String,
): T =
    importAsync<T>(path).await()

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/import)
 */
suspend fun <T : JsAny?> import(
    path: String,
    options: ImportCallOptions,
): T =
    importAsync<T>(path, options).await()

external object import {
    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/import.meta)
     */
    val meta: ImportMeta
}
