@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


external interface UseMatchesMatch {
    var id: String
    var pathname: String
    var params: Params
    var data: Any?
    var handle: Any?
}

