package karakum.browser

import karakum.common.loadContent
import java.net.URI

private val WEB_GPU_URI =
    URI("https://raw.githubusercontent.com/microsoft/TypeScript-DOM-lib-generator/2d91b29eb0ebddd40f310c5fa0fc56696bb0b034/baselines/dom.generated.d.ts")

private val WEB_GPU_ITERABLE_URI =
    URI("https://raw.githubusercontent.com/microsoft/TypeScript-DOM-lib-generator/2d91b29eb0ebddd40f310c5fa0fc56696bb0b034/baselines/dom.iterable.generated.d.ts")

internal val WEB_GPU_CONTENT by lazy {
    getWebGPUContent(loadContent(WEB_GPU_URI))
}

internal val WEB_GPU_ITERABLE_CONTENT by lazy {
    getWebGPUContent(loadContent(WEB_GPU_ITERABLE_URI))
}

private fun getWebGPUContent(
    content: String,
): String =
    sequenceOf<String>()
        .plus(getItems(content, "\ninterface GPU", "\n}\n"))
        .plus(getItems(content, "\ndeclare var GPU", "\n};\n"))
        .plus(getItems(content, "\ntype GPU", "\n"))
        .filter { source -> IGNORED_MARKERS.none { it in source } }
        .joinToString("\n\n")

private fun getItems(
    content: String,
    delimiter: String,
    endMarker: String,
): Sequence<String> =
    content
        .splitToSequence(delimiter)
        .drop(1)
        .map { it.substringBefore(endMarker) }
        .map { delimiter + it + endMarker }
        .map { declaration ->
            val prefix = content.substringBefore(declaration)
            val comment = if (prefix.endsWith(" */")) {
                "/**\n" + prefix.substringAfterLast("\n/**\n")
            } else ""

            comment + declaration
        }
        .map { it.trim() }

private val IGNORED_TYPES = setOf(
    "GPUAdapterInfo",
    "GPUAddressMode",
    "GPUAutoLayoutMode",
    "GPUBindGroup",
    "GPUBindGroupDescriptor",
    "GPUBindGroupEntry",
    "GPUBindGroupLayout",
    "GPUBindingCommandsMixin",
    "GPUBindingResource",
    "GPUBlendComponent",
    "GPUBlendFactor",
    "GPUBlendOperation",
    "GPUBlendState",
    "GPUBuffer",
    "GPUBufferBinding",
    "GPUBufferDescriptor",
    "GPUBufferDynamicOffset",
    "GPUBufferMapState",
    "GPUBufferUsageFlags",
    "GPUCanvasAlphaMode",
    "GPUCanvasConfiguration",
    "GPUCanvasContext",
    "GPUCanvasToneMapping",
    "GPUCanvasToneMappingMode",
    "GPUColor",
    "GPUColorDict",
    "GPUColorTargetState",
    "GPUColorWriteFlags",
    "GPUCommandBuffer",
    "GPUCommandBufferDescriptor",
    "GPUCommandEncoder",
    "GPUCommandEncoderDescriptor",
    "GPUCompareFunction",
    "GPUCompilationInfo",
    "GPUCompilationMessage",
    "GPUCompilationMessageType",
    "GPUComputePassDescriptor",
    "GPUComputePassEncoder",
    "GPUComputePassTimestampWrites",
    "GPUComputePipeline",
    "GPUComputePipelineDescriptor",
    "GPUCopyExternalImageDestInfo",
    "GPUCopyExternalImageSource",
    "GPUCopyExternalImageSourceInfo",
    "GPUCullMode",
    "GPUDebugCommandsMixin",
    "GPUDepthBias",
    "GPUDepthStencilState",
    "GPUDevice",
    "GPUDeviceLostInfo",
    "GPUDeviceLostReason",
    "GPUError",
    "GPUErrorFilter",
    "GPUExtent3D",
    "GPUExtent3DDict",
    "GPUExternalTexture",
    "GPUExternalTextureDescriptor",
    "GPUFilterMode",
    "GPUFlagsConstant",
    "GPUFragmentState",
    "GPUFrontFace",
    "GPUIndex32",
    "GPUIndexFormat",
    "GPUIntegerCoordinate",
    "GPUIntegerCoordinateOut",
    "GPUInternalError",
    "GPULoadOp",
    "GPUMapModeFlags",
    "GPUMipmapFilterMode",
    "GPUMultisampleState",
    "GPUObjectBase",
    "GPUObjectDescriptorBase",
    "GPUOrigin2D",
    "GPUOrigin2DDict",
    "GPUOrigin3D",
    "GPUOrigin3DDict",
    "GPUOutOfMemoryError",
    "GPUPipelineBase",
    "GPUPipelineConstantValue",
    "GPUPipelineDescriptorBase",
    "GPUPipelineError",
    "GPUPipelineErrorInit",
    "GPUPipelineErrorReason",
    "GPUPipelineLayout",
    "GPUPipelineLayoutDescriptor",
    "GPUPrimitiveState",
    "GPUPrimitiveTopology",
    "GPUProgrammableStage",
    "GPUQuerySet",
    "GPUQuerySetDescriptor",
    "GPUQueryType",
    "GPUQueue",
    "GPURenderBundle",
    "GPURenderBundleDescriptor",
    "GPURenderBundleEncoder",
    "GPURenderBundleEncoderDescriptor",
    "GPURenderCommandsMixin",
    "GPURenderPassColorAttachment",
    "GPURenderPassDepthStencilAttachment",
    "GPURenderPassDescriptor",
    "GPURenderPassEncoder",
    "GPURenderPassLayout",
    "GPURenderPassTimestampWrites",
    "GPURenderPipeline",
    "GPURenderPipelineDescriptor",
    "GPUSampleMask",
    "GPUSampler",
    "GPUSamplerDescriptor",
    "GPUShaderModule",
    "GPUShaderModuleDescriptor",
    "GPUSignedOffset32",
    "GPUSize32",
    "GPUSize32Out",
    "GPUSize64",
    "GPUSize64Out",
    "GPUStencilFaceState",
    "GPUStencilOperation",
    "GPUStencilValue",
    "GPUStoreOp",
    "GPUSupportedFeatures",
    "GPUSupportedLimits",
    "GPUTexelCopyBufferInfo",
    "GPUTexelCopyBufferLayout",
    "GPUTexelCopyTextureInfo",
    "GPUTexture",
    "GPUTextureAspect",
    "GPUTextureDescriptor",
    "GPUTextureDimension",
    "GPUTextureFormat",
    "GPUTextureUsageFlags",
    "GPUTextureView",
    "GPUTextureViewDescriptor",
    "GPUTextureViewDimension",
    "GPUUncapturedErrorEvent",
    "GPUUncapturedErrorEventInit",
    "GPUValidationError",
    "GPUVertexAttribute",
    "GPUVertexBufferLayout",
    "GPUVertexFormat",
    "GPUVertexState",
    "GPUVertexStepMode",
)

private val IGNORED_MARKERS =
    IGNORED_TYPES.flatMap {
        sequenceOf(
            "interface $it ",
            "type $it ",
        )
    }
