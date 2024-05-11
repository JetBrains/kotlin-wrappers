// Automatically generated - do not modify!

@file:JsModule("@actions/glob")

package actions.glob

import js.promise.Promise

external suspend fun create(
    patterns: String,
    options: GlobOptions = definedExternally,
): Globber

@JsName("create")
external fun createAsync(
    patterns: String,
    options: GlobOptions = definedExternally,
): Promise<Globber>
