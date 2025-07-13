package web.fs

import js.array.ReadonlyArray
import js.errors.toThrowable
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

suspend fun FileSystemDirectoryReader.readEntries(): ReadonlyArray<FileSystemEntry> =
    suspendCoroutine { continuation ->
        readEntriesWithCallbacks(
            successCallback = continuation::resume,
            errorCallback = { error -> continuation.resumeWithException(error.toThrowable()) }
        )
    }
