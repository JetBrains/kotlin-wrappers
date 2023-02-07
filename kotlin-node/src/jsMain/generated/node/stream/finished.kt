// Automatically generated - do not modify!

package node.stream

import kotlinx.coroutines.await

suspend fun finished(
    stream: Any, /* NodeJS.ReadableStream | NodeJS.WritableStream | NodeJS.ReadWriteStream */
) {
    finishedAsync(
        stream = stream,
    ).await()
}

suspend fun finished(
    stream: Any, /* NodeJS.ReadableStream | NodeJS.WritableStream | NodeJS.ReadWriteStream */
    options: FinishedOptions,
) {
    finishedAsync(
        stream = stream,
        options = options,
    ).await()
}
