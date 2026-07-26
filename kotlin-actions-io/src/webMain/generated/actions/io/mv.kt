// Automatically generated - do not modify!

@file:JsModule("@actions/io")

package actions.io

import js.promise.Promise
import js.void.Void
import seskar.js.JsAsync

@JsAsync
external suspend fun mv(
    source: String,
    dest: String,
    options: MoveOptions = definedExternally,
)

@JsName("mv")
external fun mvAsync(
    source: String,
    dest: String,
    options: MoveOptions = definedExternally,
): Promise<Void>
