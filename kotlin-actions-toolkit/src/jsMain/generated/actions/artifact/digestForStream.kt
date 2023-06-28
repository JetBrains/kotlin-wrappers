// Automatically generated - do not modify!

package actions.artifact

import js.promise.await

suspend fun digestForStream(
    stream: node.ReadableStream,
): StreamDigest =
    digestForStreamAsync(
        stream = stream,
    ).await()
