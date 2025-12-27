@file:JsModule("@tanstack/router-core")

package tanstack.router.core

import js.errors.JsError

/**
 * Error thrown when path parameter parsing/validation fails.
 */
external class PathParamError : JsError
