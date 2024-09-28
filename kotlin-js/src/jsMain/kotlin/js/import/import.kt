package js.import

import js.promise.Promise
import seskar.js.JsAsync

@JsName("import")
external fun <T> importAsync(
    path: String,
): Promise<T>

@JsAsync
external suspend fun <T> import(
    path: String,
): T

external object import {
    val meta: ImportMeta
}
