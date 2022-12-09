@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * @private
 */
external fun resolveTo(toArg: To, routePathnames: Array<String>, locationPathname: String, isPathRelative: Boolean = definedExternally): Path
