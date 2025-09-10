// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import kotlin.js.JsString

@JsPlainObject
external interface GPUDeviceDescriptor :
    GPUObjectDescriptorBase {
    var defaultQueue: GPUQueueDescriptor?
    var requiredFeatures: ReadonlyArray<GPUFeatureName>?
    var requiredLimits: ReadonlyRecord<JsString, GPUSize64?>?
}
