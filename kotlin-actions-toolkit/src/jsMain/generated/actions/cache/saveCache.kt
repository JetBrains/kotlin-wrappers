// Automatically generated - do not modify!

package actions.cache

import js.core.ReadonlyArray
import kotlinx.coroutines.await

suspend fun saveCache(
    paths: ReadonlyArray<String>,
    key: String,
): Number =
    saveCacheAsync(
        paths = paths,
        key = key,
    ).await()

suspend fun saveCache(
    paths: ReadonlyArray<String>,
    key: String,
    options: UploadOptions,
): Number =
    saveCacheAsync(
        paths = paths,
        key = key,
        options = options,
    ).await()

suspend fun saveCache(
    paths: ReadonlyArray<String>,
    key: String,
    options: UploadOptions,
    enableCrossOsArchive: Boolean,
): Number =
    saveCacheAsync(
        paths = paths,
        key = key,
        options = options,
        enableCrossOsArchive = enableCrossOsArchive,
    ).await()

suspend fun saveCache(
    cacheId: Number,
    archivePath: String,
) {
    saveCacheAsync(
        cacheId = cacheId,
        archivePath = archivePath,
    ).await()
}

suspend fun saveCache(
    cacheId: Number,
    archivePath: String,
    options: UploadOptions,
) {
    saveCacheAsync(
        cacheId = cacheId,
        archivePath = archivePath,
        options = options,
    ).await()
}
