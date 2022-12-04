package js.errors

import js.core.ReadonlyArray

external class AggregateError(
    errors: ReadonlyArray<JsError>,
    message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError {
    var errors: ReadonlyArray<JsError>
}
