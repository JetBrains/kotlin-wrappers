// Automatically generated - do not modify!

package web.gpu

import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#descriptor)
 */
@JsPlainObject
external interface GPUSamplerDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#addressModeU)
     */
    var addressModeU: GPUAddressMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#addressModeV)
     */
    var addressModeV: GPUAddressMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#addressModeW)
     */
    var addressModeW: GPUAddressMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#compare)
     */
    var compare: GPUCompareFunction?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#lodMaxClamp)
     */
    var lodMaxClamp: Float?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#lodMinClamp)
     */
    var lodMinClamp: Float?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#magFilter)
     */
    var magFilter: GPUFilterMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#maxAnisotropy)
     */
    var maxAnisotropy: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#minFilter)
     */
    var minFilter: GPUFilterMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#mipmapFilter)
     */
    var mipmapFilter: GPUMipmapFilterMode?
}
