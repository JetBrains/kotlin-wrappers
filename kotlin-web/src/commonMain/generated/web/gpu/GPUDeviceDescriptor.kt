// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface GPUDeviceDescriptor :
    GPUObjectDescriptorBase {
    val defaultQueue: GPUQueueDescriptor?
    val requiredFeatures: ReadonlyArray<GPUFeatureName>?
    val requiredLimits: ReadonlyRecord<JsString, GPUSize64?>?
}
