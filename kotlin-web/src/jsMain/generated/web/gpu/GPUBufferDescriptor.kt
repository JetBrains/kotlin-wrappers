// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface GPUBufferDescriptor :
    GPUObjectDescriptorBase {
    var size: GPUSize64
    var usage: GPUBufferUsage
    var mappedAtCreation: Boolean?
}
