package ajv

import js.array.ReadonlyArray
import js.core.JsAny

external interface ValidateFunction {
    operator fun invoke(data: JsAny): Boolean

    val errors: ReadonlyArray<ErrorObject>?
}
