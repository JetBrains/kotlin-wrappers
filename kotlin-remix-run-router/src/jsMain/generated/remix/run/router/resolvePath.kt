@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * Returns a resolved path object relative to the given pathname.
 *
 * @see https://reactrouter.com/utils/resolve-path
 */
external fun resolvePath(to: To, fromPathname: String = definedExternally): Path
