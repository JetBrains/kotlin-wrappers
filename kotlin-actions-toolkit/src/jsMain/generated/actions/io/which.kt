// Automatically generated - do not modify!

@file:JsModule("@actions/io")

package actions.io

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun which(
    tool: String,
    check: Boolean = definedExternally,
): String

@JsName("which")
external fun whichAsync(
    tool: String,
    check: Boolean = definedExternally,
): Promise<String>
