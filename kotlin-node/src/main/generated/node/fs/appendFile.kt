// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await

suspend fun appendFile(
    path: Any, /* PathLike | FileHandle */
    data: Any, /* string | Uint8Array */
    options: Any?, /* (ObjectEncodingOptions & FlagAndOpenMode) | BufferEncoding */
) {
    appendFileAsync(
        path = path,
        data = data,
        options = options,
    ).await()
}
