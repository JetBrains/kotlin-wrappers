// Automatically generated - do not modify!

package node.fs

import org.khronos.webgl.ArrayBufferView

sealed external interface FileReadResult<T : ArrayBufferView> {
    var bytesRead: Number
    var buffer: T
}
