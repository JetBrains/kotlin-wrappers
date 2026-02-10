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
    "GPUBindGroup",
    "GPUBindGroupDescriptor",
    "GPUBindGroupEntry",
    "GPUBindGroupLayout",
    "GPUBindingCommandsMixin",
    "GPUBindingResource",
    "GPUBuffer",
    "GPUBufferBinding",
    "GPUBufferDynamicOffset",
    "GPUBufferMapState",
    "GPUCanvasAlphaMode",
    "GPUCanvasConfiguration",
    "GPUCanvasContext",
    "GPUCanvasToneMapping",
    "GPUCanvasToneMappingMode",
    "GPUColor",
    "GPUColorDict",
    "GPUCommandBuffer",
    "GPUCommandBufferDescriptor",
    "GPUCommandEncoder",
    "GPUCompilationInfo",
    "GPUCompilationMessage",
    "GPUCompilationMessageType",
    "GPUComputePassDescriptor",
    "GPUComputePassEncoder",
    "GPUComputePassTimestampWrites",
    "GPUComputePipeline",
    "GPUCopyExternalImageDestInfo",
    "GPUCopyExternalImageSource",
    "GPUCopyExternalImageSourceInfo",
    "GPUDebugCommandsMixin",
    "GPUDevice",
    "GPUDeviceLostInfo",
    "GPUDeviceLostReason",
    "GPUError",
    "GPUErrorFilter",
    "GPUExtent3D",
    "GPUExtent3DDict",
    "GPUExternalTexture",
    "GPUExternalTextureDescriptor",
    "GPUFlagsConstant",
    "GPUIndex32",
    "GPUIndexFormat",
    "GPUIntegerCoordinate",
    "GPUIntegerCoordinateOut",
    "GPUInternalError",
    "GPULoadOp",
    "GPUMapModeFlags",
    "GPUObjectBase",
    "GPUObjectDescriptorBase",
    "GPUOrigin2D",
    "GPUOrigin2DDict",
    "GPUOrigin3D",
    "GPUOrigin3DDict",
    "GPUOutOfMemoryError",
    "GPUPipelineBase",
    "GPUPipelineError",
    "GPUPipelineErrorInit",
    "GPUPipelineErrorReason",
    "GPUPipelineLayout",
    "GPUQuerySet",
    "GPUQueryType",
    "GPUQueue",
    "GPURenderBundle",
    "GPURenderBundleDescriptor",
    "GPURenderBundleEncoder",
    "GPURenderCommandsMixin",
    "GPURenderPassColorAttachment",
    "GPURenderPassDepthStencilAttachment",
    "GPURenderPassDescriptor",
    "GPURenderPassEncoder",
    "GPURenderPassTimestampWrites",
    "GPURenderPipeline",
    "GPUSampler",
    "GPUShaderModule",
    "GPUSignedOffset32",
    "GPUSize32",
    "GPUSize32Out",
    "GPUSize64",
    "GPUSize64Out",
    "GPUStencilValue",
    "GPUStoreOp",
    "GPUSupportedFeatures",
    "GPUSupportedLimits",
    "GPUTexelCopyBufferInfo",
    "GPUTexelCopyBufferLayout",
    "GPUTexelCopyTextureInfo",
    "GPUTexture",
    "GPUTextureAspect",
    "GPUTextureDimension",
    "GPUTextureFormat",
    "GPUTextureUsageFlags",
    "GPUTextureView",
    "GPUTextureViewDescriptor",
    "GPUTextureViewDimension",
    "GPUUncapturedErrorEvent",
    "GPUUncapturedErrorEventInit",
    "GPUValidationError",
)

private val IGNORED_MARKERS =
    IGNORED_TYPES.flatMap {
        sequenceOf(
            "interface $it ",
            "type $it ",
        )
    }
