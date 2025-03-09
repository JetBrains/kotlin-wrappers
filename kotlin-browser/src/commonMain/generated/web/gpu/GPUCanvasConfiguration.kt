// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.images.PredefinedColorSpace

@JsPlainObject
external interface GPUCanvasConfiguration {
    val alphaMode: GPUCanvasAlphaMode?
    val colorSpace: PredefinedColorSpace?
    val device: GPUDevice
    val format: GPUTextureFormat
    val toneMapping: GPUCanvasToneMapping?
    val usage: GPUTextureUsageFlags?
    val viewFormats: ReadonlyArray<GPUTextureFormat>?
}
