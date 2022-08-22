// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await
import node.buffer.BufferEncoding

suspend fun writeFile(
    file: PathLike, /* | FileHandle */
    data: Any, /* string | NodeJS.ArrayBufferView | Iterable<string | NodeJS.ArrayBufferView> | AsyncIterable<string | NodeJS.ArrayBufferView> | Stream */
) {
    writeFileAsync(
        file = file,
        data = data,
    ).await()
}

suspend fun writeFile(
    file: PathLike, /* | FileHandle */
    data: Any, /* string | NodeJS.ArrayBufferView | Iterable<string | NodeJS.ArrayBufferView> | AsyncIterable<string | NodeJS.ArrayBufferView> | Stream */
    options: BufferEncoding?,
    /*         | (ObjectEncodingOptions & {
              mode?: Mode | undefined;
              flag?: OpenMode | undefined;
          } & Abortable)
        | BufferEncoding
        */
) {
    writeFileAsync(
        file = file,
        data = data,
        options = options,
    ).await()
}
