// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await
import node.buffer.Buffer

suspend fun realpath(
    path: PathLike,
    options: node.buffer.BufferEncoding?, /* ObjectEncodingOptions | BufferEncoding */
): String =
    realpathAsync(
        path = path,
        options = options,
    ).await()


suspend fun realpath(
    path: PathLike,
    options: BufferEncodingOption,
): Buffer =
    realpathAsync(
        path = path,
        options = options,
    ).await()
