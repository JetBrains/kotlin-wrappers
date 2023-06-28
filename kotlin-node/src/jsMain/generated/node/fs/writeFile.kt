// Automatically generated - do not modify!

package node.fs

import js.promise.await

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
    options: WriteFileOptions,
) {
    writeFileAsync(
        file = file,
        data = data,
        options = options,
    ).await()
}


suspend fun writeFile(
    file: PathLike, /* | FileHandle */
    data: Any, /* string | NodeJS.ArrayBufferView | Iterable<string | NodeJS.ArrayBufferView> | AsyncIterable<string | NodeJS.ArrayBufferView> | Stream */
    options: node.buffer.BufferEncoding,
) {
    writeFileAsync(
        file = file,
        data = data,
        options = options,
    ).await()
}
