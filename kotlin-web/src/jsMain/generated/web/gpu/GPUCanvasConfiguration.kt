// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.images.PredefinedColorSpace

@JsPlainObject
external interface GPUCanvasConfiguration {
    val device: GPUDevice
    val format: GPUTextureFormat
    val usage: GPUTextureUsage?
    val viewFormats: ReadonlyArray<GPUTextureFormat>?
    val colorSpace: PredefinedColorSpace?
    val alphaMode: GPUCanvasAlphaMode?
}
