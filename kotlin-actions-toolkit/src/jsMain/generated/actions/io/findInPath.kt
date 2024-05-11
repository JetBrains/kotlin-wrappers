// Automatically generated - do not modify!

@file:JsModule("@actions/io")

package actions.io

import js.array.ReadonlyArray
import js.promise.Promise

external suspend fun findInPath(tool: String): ReadonlyArray<String>

@JsName("findInPath")
external fun findInPathAsync(tool: String): Promise<ReadonlyArray<String>>
