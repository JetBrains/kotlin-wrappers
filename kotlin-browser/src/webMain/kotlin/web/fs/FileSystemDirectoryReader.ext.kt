package web.fs

import js.array.ReadonlyArray
import js.coroutines.resumeWithError
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun FileSystemDirectoryReader.readEntries(): ReadonlyArray<FileSystemEntry> =
    suspendCoroutine { continuation ->
        readEntriesWithCallbacks(
            successCallback = continuation::resume,
            errorCallback = continuation::resumeWithError,
        )
    }
