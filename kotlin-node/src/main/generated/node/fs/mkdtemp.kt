// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await
import node.buffer.Buffer

suspend fun mkdtemp(
    prefix: String,
): String =
    mkdtempAsync(
        prefix = prefix,
    ).await()

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
): Buffer =
    mkdtempAsync(
        prefix = prefix,
        options = options,
    ).await()
