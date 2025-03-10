// Automatically generated - do not modify!

package web.gpu

import js.core.JsString
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface GPUProgrammableStage {
    val constants: ReadonlyRecord<JsString, GPUPipelineConstantValue>?
    val entryPoint: String?
    val module: GPUShaderModule
}
