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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#addressmodeu)
     */
    var addressModeU: GPUAddressMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#addressmodev)
     */
    var addressModeV: GPUAddressMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#addressmodew)
     */
    var addressModeW: GPUAddressMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#compare)
     */
    var compare: GPUCompareFunction?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#lodmaxclamp)
     */
    var lodMaxClamp: Float?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#lodminclamp)
     */
    var lodMinClamp: Float?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#magfilter)
     */
    var magFilter: GPUFilterMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#maxanisotropy)
     */
    var maxAnisotropy: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#minfilter)
     */
    var minFilter: GPUFilterMode?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler#mipmapfilter)
     */
    var mipmapFilter: GPUMipmapFilterMode?
}
