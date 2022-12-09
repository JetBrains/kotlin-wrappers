@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Route action function signature
 */
typealias ActionFunction = (args: ActionFunctionArgs) -> Any /* Promise<Response> | Response | Promise<any> | any */
