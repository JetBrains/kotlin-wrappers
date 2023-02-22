@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


external interface UseMatchesMatch {
    var id: String
    var pathname: String
    var params: Params
    var data: Any?
    var handle: Any?
}

