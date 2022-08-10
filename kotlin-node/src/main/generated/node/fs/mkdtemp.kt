// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun mkdtemp(
    prefix: String,
    options: node.buffer.BufferEncoding?, /* ObjectEncodingOptions | BufferEncoding */
): String =
    mkdtempAsync(
        prefix = prefix,
        options = options,
    ).await()


suspend fun mkdtemp(
    prefix: String,
    options: BufferEncodingOption,
): node.buffer.Buffer =
    mkdtempAsync(
        prefix = prefix,
        options = options,
    ).await()
