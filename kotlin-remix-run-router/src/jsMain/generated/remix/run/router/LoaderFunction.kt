@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Route loader function signature
 */
typealias LoaderFunction = (args: LoaderFunctionArgs) -> Any /* Promise<Response> | Response | Promise<any> | any */
