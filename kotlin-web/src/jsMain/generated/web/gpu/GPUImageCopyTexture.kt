// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface GPUImageCopyTexture {
    var texture: GPUTexture
    var mipLevel: GPUIntegerCoordinate?
    var origin: GPUOrigin3D?
    var aspect: GPUTextureAspect?
}
