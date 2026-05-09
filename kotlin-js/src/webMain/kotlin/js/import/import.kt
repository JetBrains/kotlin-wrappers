package js.import

import js.promise.Promise
import js.promise.await

@JsName("import")
external fun <T : JsAny?> importAsync(
    path: String,
    options: ImportCallOptions = definedExternally,
): Promise<T>

suspend fun <T : JsAny?> import(
    path: String,
): T =
    importAsync<T>(path).await()

suspend fun <T : JsAny?> import(
    path: String,
    options: ImportCallOptions,
): T =
    importAsync<T>(path, options).await()

external object import {
    val meta: ImportMeta
}
