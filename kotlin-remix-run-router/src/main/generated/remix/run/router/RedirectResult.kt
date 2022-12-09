@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Redirect result from a loader or action
 */

external interface RedirectResult {
    var type: ResultType /* ResultType.redirect */
    var status: Double
    var location: String
    var revalidate: Boolean
}

