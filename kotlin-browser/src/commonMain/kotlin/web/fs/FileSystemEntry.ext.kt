package web.fs

import js.errors.toThrowable
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * The FileSystemEntry interface's method **`getParent()`** obtains a ```js-nolint getParent(successCallback, errorCallback) getParent(successCallback) ``` - `successCallback` - : A function which is called when the parent directory entry has been retrieved.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemEntry/getParent)
 */
suspend fun FileSystemEntry.getParent(): FileSystemEntry =
    suspendCoroutine { continuation ->
        getParentWithCallbacks(
            successCallback = continuation::resume,
            errorCallback = { error -> continuation.resumeWithException(error.toThrowable()) }
        )
    }
