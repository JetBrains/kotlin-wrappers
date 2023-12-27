// Generated by Karakum - do not modify it manually!

package node.stream

import js.promise.await


suspend fun finished(stream: node.ReadableStream, options: FinishedOptions = undefined.unsafeCast<Nothing>()): Unit =
    finishedAsync(
        stream, options
    ).await()


suspend fun finished(stream: node.WritableStream, options: FinishedOptions = undefined.unsafeCast<Nothing>()): Unit =
    finishedAsync(
        stream, options
    ).await()


suspend fun finished(stream: node.ReadWriteStream, options: FinishedOptions = undefined.unsafeCast<Nothing>()): Unit =
    finishedAsync(
        stream, options
    ).await()
