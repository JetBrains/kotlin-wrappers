// Automatically generated - do not modify!

package node.fs

import js.promise.await
import node.buffer.Buffer

suspend fun readlink(
    path: PathLike,
): String =
    readlinkAsync(
        path = path,
    ).await()

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
): Buffer =
    readlinkAsync(
        path = path,
        options = options,
    ).await()
