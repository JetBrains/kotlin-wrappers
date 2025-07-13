package web.fs

import js.errors.toThrowable
import js.objects.unsafeJso
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import kotlin.js.undefined

/**
 * The FileSystemDirectoryEntry interface's method **`getDirectory()`** returns a somewhere within the directory subtree rooted at the directory on which it's called.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/getDirectory)
 */
suspend fun FileSystemDirectoryEntry.getDirectory(
    path: String? = undefined,
    options: FileSystemFlags = unsafeJso(),
): FileSystemEntry =
    suspendCoroutine { continuation ->
        getDirectoryWithCallbacks(
            path = path,
            options = options,
            successCallback = continuation::resume,
            errorCallback = { error -> continuation.resumeWithException(error.toThrowable()) }
        )
    }

/**
 * The FileSystemDirectoryEntry interface's method **`getFile()`** returns a within the directory subtree rooted at the directory on which it's called.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/getFile)
 */
suspend fun FileSystemDirectoryEntry.getFile(
    path: String? = undefined,
    options: FileSystemFlags = unsafeJso(),
): FileSystemEntry =
    suspendCoroutine { continuation ->
        getFileWithCallbacks(
            path = path,
            options = options,
            successCallback = continuation::resume,
            errorCallback = { error -> continuation.resumeWithException(error.toThrowable()) }
        )
    }
