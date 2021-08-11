// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

external interface Logger {
    var log: LogFunction
    var warn: LogFunction
    var error: LogFunction
}

typealias LogFunction = Function<Unit>

external fun getLogger(): Logger

external fun setLogger(newLogger: Logger)
