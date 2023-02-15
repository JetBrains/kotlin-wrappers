// Automatically generated - do not modify!

package actions.io

import kotlinx.coroutines.await

suspend fun isDirectory(
    fsPath: String,
): Boolean =
    isDirectoryAsync(
        fsPath = fsPath,
    ).await()

suspend fun isDirectory(
    fsPath: String,
    useStat: Boolean,
): Boolean =
    isDirectoryAsync(
        fsPath = fsPath,
        useStat = useStat,
    ).await()
