package js.import

import js.promise.Promise
import seskar.js.JsAsync

@JsName("import")
external fun <T> importAsync(
    path: String,
    options: ImportCallOptions = definedExternally,
): Promise<T>

@JsAsync
external suspend fun <T> import(
    path: String,
    options: ImportCallOptions = definedExternally,
): T

external object import {
    val meta: ImportMeta
}
