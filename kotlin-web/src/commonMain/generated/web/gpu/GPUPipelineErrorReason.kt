// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUPipelineErrorReason {
    companion object
}

inline val GPUPipelineErrorReason.Companion.internal: GPUPipelineErrorReason
    get() = unsafeCast("internal")

inline val GPUPipelineErrorReason.Companion.validation: GPUPipelineErrorReason
    get() = unsafeCast("validation")
