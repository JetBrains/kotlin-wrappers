package ajv

import js.array.ReadonlyArray

external interface ValidateFunction {
    operator fun invoke(data: JsAny): Boolean

    val errors: ReadonlyArray<ErrorObject>?
}
