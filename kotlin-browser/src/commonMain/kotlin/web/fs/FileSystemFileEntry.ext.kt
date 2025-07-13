package web.fs

import js.errors.toThrowable
import web.file.File
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * The FileSystemFileEntry interface's method **`file()`** returns a the directory entry.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemFileEntry/file)
 */
suspend fun FileSystemFileEntry.file(): File =
    suspendCoroutine { continuation ->
        fileWithCallbacks(
            successCallback = continuation::resume,
            errorCallback = { error -> continuation.resumeWithException(error.toThrowable()) }
        )
    }
