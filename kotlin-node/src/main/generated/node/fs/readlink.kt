// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun readlink(
    path: PathLike,
    options: node.buffer.BufferEncoding?, /* ObjectEncodingOptions | BufferEncoding */
): String =
    readlinkAsync(
        path = path,
        options = options,
    ).await()


suspend fun readlink(
    path: PathLike,
    options: BufferEncodingOption,
): node.buffer.Buffer =
    readlinkAsync(
        path = path,
        options = options,
    ).await()
