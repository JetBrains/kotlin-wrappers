// Automatically generated - do not modify!

package web.gpu

import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
sealed external interface GPUProgrammableStage {
    var module: GPUShaderModule
    var entryPoint: String?
    var constants: ReadonlyRecord<String, Double>?
}
