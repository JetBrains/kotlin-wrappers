package ajv

import js.array.ReadonlyArray
import kotlin.js.JsAny

external interface ValidateFunction {
    operator fun invoke(data: JsAny): Boolean

    val errors: ReadonlyArray<ErrorObject>?
}
