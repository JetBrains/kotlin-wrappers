// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.images.PredefinedColorSpace

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure#configuration)
 */
@JsPlainObject
external interface GPUCanvasConfiguration {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure#alphaMode)
     */
    var alphaMode: GPUCanvasAlphaMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure#colorSpace)
     */
    var colorSpace: PredefinedColorSpace?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure#device)
     */
    var device: GPUDevice

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure#format)
     */
    var format: GPUTextureFormat

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure#toneMapping)
     */
    var toneMapping: GPUCanvasToneMapping?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure#usage)
     */
    var usage: GPUTextureUsage?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCanvasContext/configure#viewFormats)
     */
    var viewFormats: ReadonlyArray<GPUTextureFormat>?
}
