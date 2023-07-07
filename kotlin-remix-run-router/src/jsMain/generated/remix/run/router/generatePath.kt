@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * Returns a path with params interpolated.
 *
 * @see https://reactrouter.com/utils/generate-path
 */
external fun generatePath(originalPath: String, params: js.core.ReadonlyRecord<String, String> = definedExternally): String
