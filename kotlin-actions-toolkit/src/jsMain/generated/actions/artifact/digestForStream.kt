// Automatically generated - do not modify!

package actions.artifact

import kotlinx.coroutines.await

suspend fun digestForStream(
    stream: node.ReadableStream,
): StreamDigest =
    digestForStreamAsync(
        stream = stream,
    ).await()
