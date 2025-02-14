package js.errors

import js.array.ReadonlyArray

open external class AggregateError(
    val errors: ReadonlyArray<JsError>,
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError
