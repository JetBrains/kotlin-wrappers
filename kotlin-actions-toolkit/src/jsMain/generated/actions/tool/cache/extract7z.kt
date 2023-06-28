// Automatically generated - do not modify!

package actions.tool.cache

import js.promise.await

suspend fun extract7z(
    file: String,
): String =
    extract7zAsync(
        file = file,
    ).await()

suspend fun extract7z(
    file: String,
    dest: String,
): String =
    extract7zAsync(
        file = file,
        dest = dest,
    ).await()

suspend fun extract7z(
    file: String,
    dest: String,
    _7zPath: String,
): String =
    extract7zAsync(
        file = file,
        dest = dest,
        _7zPath = _7zPath,
    ).await()
