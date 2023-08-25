// Automatically generated - do not modify!

package node.fs

import js.core.ReadonlyArray
import js.promise.await
import node.buffer.Buffer
import node.buffer.BufferEncoding

suspend fun readdir(
    path: PathLike,
): ReadonlyArray<String> =
    readdirAsync(
        path = path,
    ).await()

suspend fun readdir(
    path: PathLike,
    options: BufferEncoding?,
    /*         | (ObjectEncodingOptions & {
              withFileTypes?: false | undefined;
          })
        | BufferEncoding
        */
): ReadonlyArray<String> =
    readdirAsync(
        path = path,
        options = options,
    ).await()


suspend fun readdir(
    path: PathLike,
    options: BufferEncodingOption,
    /*         | {
              encoding: 'buffer';
              withFileTypes?: false | undefined;
          }
        | 'buffer' */
): ReadonlyArray<Buffer> =
    readdirAsync(
        path = path,
        options = options,
    ).await()


suspend fun readdir(
    path: PathLike,
    options: ObjectEncodingOptions,
    /* {
            withFileTypes: true;
        } */
): ReadonlyArray<Dirent> =
    readdirAsync(
        path = path,
        options = options,
    ).await()
