@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


external interface BlockerBlocked {
    var state: String
    fun reset(): Unit
    fun proceed(): Unit
    var location: Location
}

