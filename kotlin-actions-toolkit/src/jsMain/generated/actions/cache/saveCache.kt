// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun saveCache(
    paths: ReadonlyArray<String>,
    key: String,
    options: UploadOptions = definedExternally,
    enableCrossOsArchive: Boolean = definedExternally,
): Number

@JsName("saveCache")
external fun saveCacheAsync(
    paths: ReadonlyArray<String>,
    key: String,
    options: UploadOptions = definedExternally,
    enableCrossOsArchive: Boolean = definedExternally,
): Promise<Number>

@JsAsync
external suspend fun saveCache(
    cacheId: Number,
    archivePath: String,
    options: UploadOptions = definedExternally,
)

@JsName("saveCache")
external fun saveCacheAsync(
    cacheId: Number,
    archivePath: String,
    options: UploadOptions = definedExternally,
): Promise<Void>
