@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import js.core.Record

/**
 * The parameters that were parsed from the URL path.
 */
typealias Params = Record<String, String>
