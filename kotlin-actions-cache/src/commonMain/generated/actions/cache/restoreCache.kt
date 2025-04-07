// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.array.ReadonlyArray
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun restoreCache(
    paths: ReadonlyArray<String>,
    primaryKey: String,
    restoreKeys: ReadonlyArray<String> = definedExternally,
    options: DownloadOptions = definedExternally,
    enableCrossOsArchive: Boolean = definedExternally,
): String?

@JsName("restoreCache")
external fun restoreCacheAsync(
    paths: ReadonlyArray<String>,
    primaryKey: String,
    restoreKeys: ReadonlyArray<String> = definedExternally,
    options: DownloadOptions = definedExternally,
    enableCrossOsArchive: Boolean = definedExternally,
): Promise<String?>
