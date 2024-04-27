// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUPrimitiveTopology {
    companion object {
        @JsValue("point-list")
        val pointList: GPUPrimitiveTopology

        @JsValue("line-list")
        val lineList: GPUPrimitiveTopology

        @JsValue("line-strip")
        val lineStrip: GPUPrimitiveTopology

        @JsValue("triangle-list")
        val triangleList: GPUPrimitiveTopology

        @JsValue("triangle-strip")
        val triangleStrip: GPUPrimitiveTopology
    }
}
