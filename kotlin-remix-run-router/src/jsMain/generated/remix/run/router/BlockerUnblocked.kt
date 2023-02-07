@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


external interface BlockerUnblocked {
    var state: String
    var reset: Any? /* some expression */
    var proceed: Any? /* some expression */
    var location: Any? /* some expression */
}

