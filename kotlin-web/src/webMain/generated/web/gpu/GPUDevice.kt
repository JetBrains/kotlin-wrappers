// Automatically generated - do not modify!

package web.gpu

import js.promise.Promise
import js.promise.await
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`GPUDevice`** interface of the WebGPU API represents a logical GPU device. This is the main interface through which the majority of WebGPU functionality is accessed.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice)
 */
open external class GPUDevice
private constructor() :
    EventTarget,
    GPUObjectBase {
    /**
     * The **`adapterInfo`** read-only property of the GPUDevice interface returns a GPUAdapterInfo object containing identifying information about the device's originating adapter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/adapterInfo)
     */
    val adapterInfo: GPUAdapterInfo

    /**
     * The **`features`** read-only property of the GPUDevice interface returns a GPUSupportedFeatures object that describes additional functionality supported by the device. Only features requested during the creation of the device (i.e., when GPUAdapter.requestDevice() is called) are included.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/features)
     */
    val features: GPUSupportedFeatures

    /**
     * The **`limits`** read-only property of the GPUDevice interface returns a GPUSupportedLimits object that describes the limits supported by the device. All limit values will be included, and the limits requested during the creation of the device (i.e., when GPUAdapter.requestDevice() is called) will be reflected in those values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/limits)
     */
    val limits: GPUSupportedLimits

    /**
     * The **`lost`** read-only property of the GPUDevice interface contains a Promise that remains pending throughout the device's lifetime and resolves with a GPUDeviceLostInfo object when the device is lost.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/lost)
     */
    val lost: Promise<GPUDeviceLostInfo>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/uncapturederror_event)
     */
    var onuncapturederror: EventHandler<GPUUncapturedErrorEvent, GPUDevice, GPUDevice>?

    /**
     * The **`queue`** read-only property of the GPUDevice interface returns the primary GPUQueue for the device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/queue)
     */
    val queue: GPUQueue

    /**
     * The **`createBindGroup()`** method of the GPUDevice interface creates a GPUBindGroup based on a GPUBindGroupLayout that defines a set of resources to be bound together in a group and how those resources are used in shader stages.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBindGroup)
     */
    fun createBindGroup(descriptor: GPUBindGroupDescriptor): GPUBindGroup

    /**
     * The **`createBindGroupLayout()`** method of the GPUDevice interface creates a GPUBindGroupLayout that defines the structure and purpose of related GPU resources such as buffers that will be used in a pipeline, and is used as a template when creating GPUBindGroups.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBindGroupLayout)
     */
    fun createBindGroupLayout(descriptor: GPUBindGroupLayoutDescriptor): GPUBindGroupLayout

    /**
     * The **`createBuffer()`** method of the GPUDevice interface creates a GPUBuffer in which to store raw data to use in GPU operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createBuffer)
     */
    fun createBuffer(descriptor: GPUBufferDescriptor): GPUBuffer

    /**
     * The **`createCommandEncoder()`** method of the GPUDevice interface creates a GPUCommandEncoder, used to encode commands to be issued to the GPU.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createCommandEncoder)
     */
    fun createCommandEncoder(descriptor: GPUCommandEncoderDescriptor = definedExternally): GPUCommandEncoder

    /**
     * The **`createComputePipeline()`** method of the GPUDevice interface creates a GPUComputePipeline that can control the compute shader stage and be used in a GPUComputePassEncoder.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createComputePipeline)
     */
    @JsName("createComputePipeline")
    fun createComputePipelineSync(descriptor: GPUComputePipelineDescriptor): GPUComputePipeline

    /**
     * The **`createComputePipelineAsync()`** method of the GPUDevice interface returns a Promise that fulfills with a GPUComputePipeline, which can control the compute shader stage and be used in a GPUComputePassEncoder, once the pipeline can be used without any stalling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createComputePipelineAsync)
     */
    fun createComputePipelineAsync(descriptor: GPUComputePipelineDescriptor): Promise<GPUComputePipeline>

    /**
     * The **`createPipelineLayout()`** method of the GPUDevice interface creates a GPUPipelineLayout that defines the GPUBindGroupLayouts used by a pipeline. GPUBindGroups used with the pipeline during command encoding must have compatible GPUBindGroupLayouts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createPipelineLayout)
     */
    fun createPipelineLayout(descriptor: GPUPipelineLayoutDescriptor): GPUPipelineLayout

    /**
     * The **`createQuerySet()`** method of the GPUDevice interface creates a GPUQuerySet that can be used to record the results of queries on passes, such as occlusion or timestamp queries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createQuerySet)
     */
    fun createQuerySet(descriptor: GPUQuerySetDescriptor): GPUQuerySet

    /**
     * The **`createRenderBundleEncoder()`** method of the GPUDevice interface creates a GPURenderBundleEncoder that can be used to pre-record bundles of commands. These can be reused in GPURenderPassEncoders via the executeBundles() method, as many times as required.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderBundleEncoder)
     */
    fun createRenderBundleEncoder(descriptor: GPURenderBundleEncoderDescriptor): GPURenderBundleEncoder

    /**
     * The **`createRenderPipeline()`** method of the GPUDevice interface creates a GPURenderPipeline that can control the vertex and fragment shader stages and be used in a GPURenderPassEncoder or GPURenderBundleEncoder.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipeline)
     */
    @JsName("createRenderPipeline")
    fun createRenderPipelineSync(descriptor: GPURenderPipelineDescriptor): GPURenderPipeline

    /**
     * The **`createRenderPipelineAsync()`** method of the GPUDevice interface returns a Promise that fulfills with a GPURenderPipeline, which can control the vertex and fragment shader stages and be used in a GPURenderPassEncoder or GPURenderBundleEncoder, once the pipeline can be used without any stalling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipelineAsync)
     */
    fun createRenderPipelineAsync(descriptor: GPURenderPipelineDescriptor): Promise<GPURenderPipeline>

    /**
     * The **`createSampler()`** method of the GPUDevice interface creates a GPUSampler, which controls how shaders transform and filter texture resource data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createSampler)
     */
    fun createSampler(descriptor: GPUSamplerDescriptor = definedExternally): GPUSampler

    /**
     * The **`createShaderModule()`** method of the GPUDevice interface creates a GPUShaderModule from a string of WGSL source code.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createShaderModule)
     */
    fun createShaderModule(descriptor: GPUShaderModuleDescriptor): GPUShaderModule

    /**
     * The **`createTexture()`** method of the GPUDevice interface creates a GPUTexture in which to store 1D, 2D, or 3D arrays of data, such as images, to use in GPU rendering operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createTexture)
     */
    fun createTexture(descriptor: GPUTextureDescriptor): GPUTexture

    /**
     * The **`destroy()`** method of the GPUDevice interface destroys the device, preventing further operations on it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/destroy)
     */
    fun destroy()

    /**
     * The **`importExternalTexture()`** method of the GPUDevice interface takes an HTMLVideoElement or a VideoFrame object as an input and returns a GPUExternalTexture wrapper object containing a snapshot of the video that can be used as a frame in GPU rendering operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/importExternalTexture)
     */
    fun importExternalTexture(descriptor: GPUExternalTextureDescriptor): GPUExternalTexture

    /**
     * The **`popErrorScope()`** method of the GPUDevice interface pops an existing GPU error scope from the error scope stack (originally pushed using GPUDevice.pushErrorScope()) and returns a Promise that resolves to an object describing the first error captured in the scope, or null if no error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/popErrorScope)
     */
    @JsName("popErrorScope")
    fun popErrorScopeAsync(): Promise<GPUError?>

    /**
     * The **`pushErrorScope()`** method of the GPUDevice interface pushes a new GPU error scope onto the device's error scope stack, allowing you to capture errors of a particular type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/pushErrorScope)
     */
    fun pushErrorScope(filter: GPUErrorFilter)
}

/**
 * The **`createComputePipelineAsync()`** method of the GPUDevice interface returns a Promise that fulfills with a GPUComputePipeline, which can control the compute shader stage and be used in a GPUComputePassEncoder, once the pipeline can be used without any stalling.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createComputePipelineAsync)
 */
suspend inline fun GPUDevice.createComputePipeline(descriptor: GPUComputePipelineDescriptor): GPUComputePipeline {
    return createComputePipelineAsync(
        descriptor = descriptor,
    ).await()
}

/**
 * The **`createRenderPipelineAsync()`** method of the GPUDevice interface returns a Promise that fulfills with a GPURenderPipeline, which can control the vertex and fragment shader stages and be used in a GPURenderPassEncoder or GPURenderBundleEncoder, once the pipeline can be used without any stalling.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/createRenderPipelineAsync)
 */
suspend inline fun GPUDevice.createRenderPipeline(descriptor: GPURenderPipelineDescriptor): GPURenderPipeline {
    return createRenderPipelineAsync(
        descriptor = descriptor,
    ).await()
}

/**
 * The **`popErrorScope()`** method of the GPUDevice interface pops an existing GPU error scope from the error scope stack (originally pushed using GPUDevice.pushErrorScope()) and returns a Promise that resolves to an object describing the first error captured in the scope, or null if no error occurred.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/popErrorScope)
 */
suspend inline fun GPUDevice.popErrorScope(): GPUError? {
    return popErrorScopeAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUDevice/uncapturederror_event)
 */
inline val <C : GPUDevice> C.uncapturedErrorEvent: EventInstance<GPUUncapturedErrorEvent, C, C>
    get() = EventInstance(this, "uncapturederror")
