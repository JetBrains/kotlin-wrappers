// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.promise.Promise
import js.void.Void
import seskar.js.JsAsync

@JsAsync
external suspend fun unlinkFile(filePath: node.fs.PathLike)

@JsName("unlinkFile")
external fun unlinkFileAsync(filePath: node.fs.PathLike): Promise<Void>
