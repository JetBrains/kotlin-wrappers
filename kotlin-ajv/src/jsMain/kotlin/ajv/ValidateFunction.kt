package ajv

import js.array.ReadonlyArray
import seskar.js.JsNative

external interface ValidateFunction {
    @JsNative
    operator fun invoke(data: Any): Boolean

    val errors: ReadonlyArray<ErrorObject>?
}
