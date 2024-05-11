// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.promise.Promise

external suspend fun extract7z(
    file: String,
    dest: String = definedExternally,
    _7zPath: String = definedExternally,
): String

@JsName("extract7z")
external fun extract7zAsync(
    file: String,
    dest: String = definedExternally,
    _7zPath: String = definedExternally,
): Promise<String>
