// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.images.PredefinedColorSpace

@JsPlainObject
external interface GPUCanvasConfiguration {
    var alphaMode: GPUCanvasAlphaMode?
    var colorSpace: PredefinedColorSpace?
    var device: GPUDevice
    var format: GPUTextureFormat
    var toneMapping: GPUCanvasToneMapping?
    var usage: GPUTextureUsageFlags?
    var viewFormats: ReadonlyArray<GPUTextureFormat>?
}
