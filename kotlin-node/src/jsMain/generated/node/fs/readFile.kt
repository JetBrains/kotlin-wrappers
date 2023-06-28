// Automatically generated - do not modify!

package node.fs

import js.promise.await
import node.buffer.Buffer
import node.buffer.BufferEncoding

suspend fun readFile(
    path: PathLike, /* | FileHandle */
): Buffer =
    readFileAsync(
        path = path,
    ).await()

suspend fun readFile(
    path: PathLike, /* | FileHandle */
    options: Any?,
    /*         | ({
              encoding?: null | undefined;
              flag?: OpenMode | undefined;
          } & Abortable)
        */
): Buffer =
    readFileAsync(
        path = path,
        options = options,
    ).await()


suspend fun readFile(
    path: PathLike, /* | FileHandle */
    options: BufferEncoding,
    /*         | ({
              encoding: BufferEncoding;
              flag?: OpenMode | undefined;
          } & Abortable)
        | BufferEncoding */
): String =
    readFileAsync(
        path = path,
        options = options,
    ).await()
