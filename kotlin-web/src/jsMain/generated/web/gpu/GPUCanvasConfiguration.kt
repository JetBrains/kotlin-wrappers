// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface GPUCanvasConfiguration {
    var device: GPUDevice
    var format: GPUTextureFormat
    var usage: GPUTextureUsage?
    var viewFormats: ReadonlyArray<GPUTextureFormat>?
    var colorSpace: String /* "srgb" | "display-p3" */?
    var alphaMode: GPUCanvasAlphaMode?
    var width: Number
    var height: Number
}
