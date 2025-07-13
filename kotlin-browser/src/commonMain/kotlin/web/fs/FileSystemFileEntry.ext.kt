package web.fs

import js.coroutines.resumeWithError
import web.file.File
import kotlin.coroutines.resume
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
            errorCallback = continuation::resumeWithError,
        )
    }
