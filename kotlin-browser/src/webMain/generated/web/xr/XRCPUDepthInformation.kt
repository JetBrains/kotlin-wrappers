// Automatically generated - do not modify!

package web.xr

import js.buffer.ArrayBuffer

external interface XRCPUDepthInformation :
    XRDepthInformation {
    val data: ArrayBuffer
    fun getDepthInMeters(
        x: Float,
        y: Float,
    ): Float
}
