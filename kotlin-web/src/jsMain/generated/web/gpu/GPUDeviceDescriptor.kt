// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface GPUDeviceDescriptor :
    GPUObjectDescriptorBase {
    val defaultQueue: GPUQueueDescriptor?
    val requiredFeatures: ReadonlyArray<GPUFeatureName>?
    val requiredLimits: ReadonlyRecord<String, GPUSize64?>?
}
