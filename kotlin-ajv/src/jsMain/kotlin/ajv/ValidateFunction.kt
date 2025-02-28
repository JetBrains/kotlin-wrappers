package ajv

import js.array.ReadonlyArray
import js.core.JsNativeInvoke

external interface ValidateFunction {
    @JsNativeInvoke
    operator fun invoke(data: Any): Boolean

    val errors: ReadonlyArray<ErrorObject>?
}
