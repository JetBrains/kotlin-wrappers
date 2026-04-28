package web.fs

import js.coroutines.resumeWithError
import js.objects.unsafeJso
import js.undefined.undefinedOrNull
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

/**
 * The FileSystemDirectoryEntry interface's method **`getDirectory()`** returns a somewhere within the directory subtree rooted at the directory on which it's called.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/getDirectory)
 */
suspend fun FileSystemDirectoryEntry.getDirectory(
    path: String? = undefinedOrNull,
    options: FileSystemFlags = unsafeJso(),
): FileSystemEntry =
    suspendCoroutine { continuation ->
        getDirectoryWithCallbacks(
            path = path,
            options = options,
            successCallback = continuation::resume,
            errorCallback = continuation::resumeWithError,
        )
    }

/**
 * The FileSystemDirectoryEntry interface's method **`getFile()`** returns a within the directory subtree rooted at the directory on which it's called.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemDirectoryEntry/getFile)
 */
suspend fun FileSystemDirectoryEntry.getFile(
    path: String? = undefinedOrNull,
    options: FileSystemFlags = unsafeJso(),
): FileSystemEntry =
    suspendCoroutine { continuation ->
        getFileWithCallbacks(
            path = path,
            options = options,
            successCallback = continuation::resume,
            errorCallback = continuation::resumeWithError,
        )
    }
