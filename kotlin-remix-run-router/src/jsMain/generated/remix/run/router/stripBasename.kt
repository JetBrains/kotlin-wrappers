@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * @private
 */
external fun stripBasename(pathname: String, basename: String): String?
