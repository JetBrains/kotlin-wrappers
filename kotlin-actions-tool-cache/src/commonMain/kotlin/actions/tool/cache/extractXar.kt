// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun extractXar(
    file: String,
    dest: String = definedExternally,
    flags: ReadonlyArray<String> = definedExternally,
): String

@JsName("extractXar")
external fun extractXarAsync(
    file: String,
    dest: String = definedExternally,
    flags: ReadonlyArray<String> = definedExternally,
): Promise<String>
