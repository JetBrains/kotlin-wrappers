// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun unlinkFile(filePath: node.fs.PathLike)

@JsName("unlinkFile")
external fun unlinkFileAsync(filePath: node.fs.PathLike): Promise<Void>
