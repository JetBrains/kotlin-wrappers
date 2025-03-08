@file:Suppress(
    "WRONG_EXTERNAL_DECLARATION",
)

package js.import

import js.core.JsAny
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

@JsName("import")
external fun <T : JsAny?> importAsync(
    path: String,
    options: ImportCallOptions = definedExternally,
): Promise<T>

@JsAsync
external suspend fun <T : JsAny?> import(
    path: String,
    options: ImportCallOptions = definedExternally,
): T

external object import {
    val meta: ImportMeta
}
