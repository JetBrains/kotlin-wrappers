// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventTarget

sealed external class GPUDevice :
    EventTarget,
    GPUObjectBase {
    override var label: String
    val lost: Promise<GPUDeviceLostInfo>
    fun pushErrorScope(filter: GPUErrorFilter)

    @JsAsync
    suspend fun popErrorScope(): GPUError?

    @JsName("popErrorScope")
    fun popErrorScopeAsync(): Promise<GPUError?>
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

    @JsName("createComputePipeline")
    fun createComputePipelineSync(descriptor: GPUComputePipelineDescriptor): GPUComputePipeline

    @JsName("createRenderPipeline")
    fun createRenderPipelineSync(descriptor: GPURenderPipelineDescriptor): GPURenderPipeline

    @JsAsync
    suspend fun createComputePipeline(descriptor: GPUComputePipelineDescriptor): GPUComputePipeline

    fun createComputePipelineAsync(descriptor: GPUComputePipelineDescriptor): Promise<GPUComputePipeline>

    @JsAsync
    suspend fun createRenderPipeline(descriptor: GPURenderPipelineDescriptor): GPURenderPipeline

    fun createRenderPipelineAsync(descriptor: GPURenderPipelineDescriptor): Promise<GPURenderPipeline>
    fun createCommandEncoder(descriptor: GPUCommandEncoderDescriptor = definedExternally): GPUCommandEncoder
    fun createRenderBundleEncoder(descriptor: GPURenderBundleEncoderDescriptor): GPURenderBundleEncoder
    fun createQuerySet(descriptor: GPUQuerySetDescriptor): GPUQuerySet
}
