@file:JsModule("@remix-run/router")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * @private
 */
external fun resolveTo(toArg: To, routePathnames: js.core.ReadonlyArray<String>, locationPathname: String, isPathRelative: Boolean = definedExternally): Path
