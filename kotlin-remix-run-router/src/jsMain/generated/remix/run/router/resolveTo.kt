@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * @private
 */
external fun resolveTo(toArg: To, routePathnames: js.core.ReadonlyArray<String>, locationPathname: String, isPathRelative: Boolean = definedExternally): Path
