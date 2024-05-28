// Automatically generated - do not modify!

package web.gpu

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
sealed external interface GPUDeviceDescriptor :
    GPUObjectDescriptorBase {
    var requiredFeatures: ReadonlyArray<GPUFeatureName>?
    var requiredLimits: ReadonlyRecord<String, Double>?
}
