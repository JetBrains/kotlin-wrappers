// Automatically generated - do not modify!

package web.gpu

sealed external interface GPUBufferDescriptor :
    GPUObjectDescriptorBase {
    var size: Number
    var usage: GPUBufferUsageFlags
    var mappedAtCreation: Boolean?
}
