// Automatically generated - do not modify!

package node.net

import org.khronos.webgl.Uint8Array

sealed external interface OnReadOpts {
    var buffer: Any /* Uint8Array | (() => Uint8Array) */

    /**
     * This function is called for every chunk of incoming data.
     * Two arguments are passed to it: the number of bytes written to buffer and a reference to buffer.
     * Return false from this function to implicitly pause() the socket.
     */
    fun callback(
        bytesWritten: Number,
        buf: Uint8Array,
    ): Boolean
}
