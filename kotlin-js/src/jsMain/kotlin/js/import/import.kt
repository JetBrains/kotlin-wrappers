package js.import

import js.promise.Promise

@JsName("import")
external fun <T : Any> importAsync(
    path: String,
): Promise<T>

external suspend fun <T : Any> import(
    path: String,
): T

external object import {
    val meta: ImportMeta
}
