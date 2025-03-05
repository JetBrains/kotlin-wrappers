package js.errors

import js.array.ReadonlyArray
import kotlin.js.definedExternally as definedExternally_

open external class AggregateError(
    val errors: ReadonlyArray<JsError>,
    override val message: String? = definedExternally_,
    options: ErrorOptions? = definedExternally_,
) : JsError
