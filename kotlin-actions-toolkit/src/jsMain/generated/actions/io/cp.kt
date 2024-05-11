// Automatically generated - do not modify!

@file:JsModule("@actions/io")

package actions.io

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun cp(
    source: String,
    dest: String,
    options: CopyOptions = definedExternally,
)

@JsName("cp")
external fun cpAsync(
    source: String,
    dest: String,
    options: CopyOptions = definedExternally,
): Promise<Void>
