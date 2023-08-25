// Automatically generated - do not modify!

package node.fs

import js.promise.await
import node.buffer.BufferEncoding

suspend fun appendFile(
    path: PathLike, /* | FileHandle */
    data: Any, /* string | Uint8Array */
) {
    appendFileAsync(
        path = path,
        data = data,
    ).await()
}

suspend fun appendFile(
    path: PathLike, /* | FileHandle */
    data: Any, /* string | Uint8Array */
    options: BufferEncoding?, /* (ObjectEncodingOptions & FlagAndOpenMode) | BufferEncoding */
) {
    appendFileAsync(
        path = path,
        data = data,
        options = options,
    ).await()
}
