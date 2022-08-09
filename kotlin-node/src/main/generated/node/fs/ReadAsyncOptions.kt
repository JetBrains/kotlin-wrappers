// Automatically generated - do not modify!

package node.fs

import org.khronos.webgl.ArrayBufferView

sealed external interface ReadAsyncOptions<TBuffer : ArrayBufferView> : ReadSyncOptions {
    var buffer: TBuffer?
}
