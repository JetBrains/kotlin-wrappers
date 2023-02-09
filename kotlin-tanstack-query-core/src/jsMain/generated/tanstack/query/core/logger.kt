// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

external interface Logger {
    var log: LogFunction
    var warn: LogFunction
    var error: LogFunction
}

typealias LogFunction = Function<Unit>

external val defaultLogger: Logger
