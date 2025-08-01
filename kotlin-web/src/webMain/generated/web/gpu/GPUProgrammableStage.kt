// Automatically generated - do not modify!

package web.gpu

import js.core.JsString
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface GPUProgrammableStage {
    var constants: ReadonlyRecord<JsString, GPUPipelineConstantValue>?
    var entryPoint: String?
    var module: GPUShaderModule
}
