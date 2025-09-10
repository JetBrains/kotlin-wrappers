// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import kotlin.js.JsString

@JsPlainObject
external interface GPUProgrammableStage {
    var constants: ReadonlyRecord<JsString, GPUPipelineConstantValue>?
    var entryPoint: String?
    var module: GPUShaderModule
}
