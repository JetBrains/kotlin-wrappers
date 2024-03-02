// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import web.events.EventTarget

sealed external class GPUDevice :
    EventTarget,
    GPUObjectBase {
    override var label: String
    val lost: Promise<GPUDeviceLostInfo>
    fun pushErrorScope(filter: GPUErrorFilter)
    fun popErrorScope(): Promise<GPUError?>
    val features: GPUSupportedFeatures
    val limits: GPUSupportedLimits
    val queue: GPUQueue
    fun destroy()
    fun createBuffer(descriptor: GPUBufferDescriptor): GPUBuffer
    fun createTexture(descriptor: GPUTextureDescriptor): GPUTexture
    fun createSampler(descriptor: GPUSamplerDescriptor = definedExternally): GPUSampler
    fun createBindGroupLayout(descriptor: GPUBindGroupLayoutDescriptor): GPUBindGroupLayout
    fun createPipelineLayout(descriptor: GPUPipelineLayoutDescriptor): GPUPipelineLayout
    fun createBindGroup(descriptor: GPUBindGroupDescriptor): GPUBindGroup
    fun createShaderModule(descriptor: GPUShaderModuleDescriptor): GPUShaderModule
    fun createComputePipeline(descriptor: GPUComputePipelineDescriptor): GPUComputePipeline
    fun createRenderPipeline(descriptor: GPURenderPipelineDescriptor): GPURenderPipeline
    fun createComputePipelineAsync(descriptor: GPUComputePipelineDescriptor): Promise<GPUComputePipeline>
    fun createRenderPipelineAsync(descriptor: GPURenderPipelineDescriptor): Promise<GPURenderPipeline>
    fun createCommandEncoder(descriptor: GPUCommandEncoderDescriptor = definedExternally): GPUCommandEncoder
    fun createRenderBundleEncoder(descriptor: GPURenderBundleEncoderDescriptor): GPURenderBundleEncoder
    fun createQuerySet(descriptor: GPUQuerySetDescriptor): GPUQuerySet
}
