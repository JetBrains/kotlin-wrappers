// Automatically generated - do not modify!

package actions.artifact

import node.buffer.Buffer

suspend fun createGZipFileInBuffer(
    originalFilePath: String,
): Buffer =
    createGZipFileInBufferAsync(
        originalFilePath = originalFilePath,
    ).await()
