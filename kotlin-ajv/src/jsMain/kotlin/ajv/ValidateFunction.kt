package ajv

import js.array.ReadonlyArray
import seskar.js.JsNativeInvoke

external interface ValidateFunction {
    @JsNativeInvoke
    operator fun invoke(data: Any): Boolean

    val errors: ReadonlyArray<ErrorObject>?
}
