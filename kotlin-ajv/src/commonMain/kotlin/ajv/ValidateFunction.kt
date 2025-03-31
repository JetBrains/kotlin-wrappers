package ajv

import js.array.ReadonlyArray
import js.core.JsAny
import seskar.js.JsNativeInvoke

external interface ValidateFunction {
    @JsNativeInvoke
    operator fun invoke(data: JsAny): Boolean

    val errors: ReadonlyArray<ErrorObject>?
}
