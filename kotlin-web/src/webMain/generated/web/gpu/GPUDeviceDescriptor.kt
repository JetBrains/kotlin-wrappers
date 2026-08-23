// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice#descriptor)
 */
@JsPlainObject
external interface GPUDeviceDescriptor :
    GPUObjectDescriptorBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice#defaultQueue)
     */
    var defaultQueue: GPUQueueDescriptor?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice#requiredFeatures)
     */
    var requiredFeatures: ReadonlyArray<GPUFeatureName>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUAdapter/requestDevice#requiredLimits)
     */
    var requiredLimits: ReadonlyRecord<JsString, GPUSize64?>?
}
