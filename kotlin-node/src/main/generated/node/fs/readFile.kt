// Automatically generated - do not modify!

package node.fs

import kotlinx.coroutines.await
import node.buffer.BufferEncoding

suspend fun readFile(
    path: PathLike, /* | FileHandle */
    options: Any?,
    /*         | ({
              encoding?: null | undefined;
              flag?: OpenMode | undefined;
          } & Abortable)
        */
): node.buffer.Buffer =
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
