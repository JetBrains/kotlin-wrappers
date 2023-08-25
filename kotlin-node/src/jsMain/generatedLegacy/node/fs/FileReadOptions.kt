// Automatically generated - do not modify!

package node.fs

import js.buffer.ArrayBufferView

sealed external interface FileReadOptions<T : ArrayBufferView> {
    /**
     * @default `Buffer.alloc(0xffff)`
     */
    var buffer: T?

    /**
     * @default 0
     */
    var offset: Number?

    /**
     * @default `buffer.byteLength`
     */
    var length: Number?
    var position: Number?
}
