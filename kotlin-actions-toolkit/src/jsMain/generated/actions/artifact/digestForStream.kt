// Automatically generated - do not modify!

package actions.artifact
suspend fun digestForStream(
    stream: node.ReadableStream,
): StreamDigest =
    digestForStreamAsync(
        stream = stream,
    ).await()
