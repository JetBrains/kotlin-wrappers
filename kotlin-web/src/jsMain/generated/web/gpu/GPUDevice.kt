// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import seskar.js.JsAsync
import web.events.EventInstance
import web.events.EventTarget
import web.events.JsEvent

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice)
 */
external class GPUDevice
private constructor() :
    EventTarget,
    GPUObjectBase {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/features)
     */
    val features: GPUSupportedFeatures

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/limits)
     */
    val limits: GPUSupportedLimits

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/lost)
     */
    val lost: Promise<GPUDeviceLostInfo>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/queue)
     */
    val queue: GPUQueue

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBindGroup)
     */
    fun createBindGroup(descriptor: GPUBindGroupDescriptor): GPUBindGroup

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBindGroupLayout)
     */
    fun createBindGroupLayout(descriptor: GPUBindGroupLayoutDescriptor): GPUBindGroupLayout

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBuffer)
     */
    fun createBuffer(descriptor: GPUBufferDescriptor): GPUBuffer

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createCommandEncoder)
     */
    fun createCommandEncoder(descriptor: GPUCommandEncoderDescriptor = definedExternally): GPUCommandEncoder

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createComputePipeline)
     */
    @JsName("createComputePipeline")
    fun createComputePipelineSync(descriptor: GPUComputePipelineDescriptor): GPUComputePipeline

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createComputePipelineAsync)
     */
    @JsAsync
    suspend fun createComputePipeline(descriptor: GPUComputePipelineDescriptor): GPUComputePipeline

    fun createComputePipelineAsync(descriptor: GPUComputePipelineDescriptor): Promise<GPUComputePipeline>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createPipelineLayout)
     */
    fun createPipelineLayout(descriptor: GPUPipelineLayoutDescriptor): GPUPipelineLayout

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createQuerySet)
     */
    fun createQuerySet(descriptor: GPUQuerySetDescriptor): GPUQuerySet

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderBundleEncoder)
     */
    fun createRenderBundleEncoder(descriptor: GPURenderBundleEncoderDescriptor): GPURenderBundleEncoder

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipeline)
     */
    @JsName("createRenderPipeline")
    fun createRenderPipelineSync(descriptor: GPURenderPipelineDescriptor): GPURenderPipeline

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipelineAsync)
     */
    @JsAsync
    suspend fun createRenderPipeline(descriptor: GPURenderPipelineDescriptor): GPURenderPipeline

    fun createRenderPipelineAsync(descriptor: GPURenderPipelineDescriptor): Promise<GPURenderPipeline>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler)
     */
    fun createSampler(descriptor: GPUSamplerDescriptor = definedExternally): GPUSampler

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createShaderModule)
     */
    fun createShaderModule(descriptor: GPUShaderModuleDescriptor): GPUShaderModule

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture)
     */
    fun createTexture(descriptor: GPUTextureDescriptor): GPUTexture

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/destroy)
     */
    fun destroy()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/importExternalTexture)
     */
    fun importExternalTexture(descriptor: GPUExternalTextureDescriptor): GPUExternalTexture

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/popErrorScope)
     */
    @JsAsync
    suspend fun popErrorScope(): GPUError?

    @JsName("popErrorScope")
    fun popErrorScopeAsync(): Promise<GPUError?>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/pushErrorScope)
     */
    fun pushErrorScope(filter: GPUErrorFilter)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/uncapturederror_event)
     */
    @JsEvent("uncapturederror")
    val uncapturedErrorEvent: EventInstance<GPUUncapturedErrorEvent, GPUDevice /* this */, GPUDevice /* this */>
}
