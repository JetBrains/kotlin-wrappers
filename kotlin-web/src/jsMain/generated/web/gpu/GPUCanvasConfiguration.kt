// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.core.JsLong
import kotlinx.js.JsPlainObject
import web.images.PredefinedColorSpace

@JsPlainObject
sealed external interface GPUCanvasConfiguration {
    var device: GPUDevice
    var format: GPUTextureFormat
    var usage: GPUTextureUsage?
    var viewFormats: ReadonlyArray<GPUTextureFormat>?
    var colorSpace: PredefinedColorSpace?
    var alphaMode: GPUCanvasAlphaMode?
    var width: JsLong
    var height: JsLong
}
