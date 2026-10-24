@file:JsModule("@tanstack/router-core")

package tanstack.router.core

import js.reflect.TypeGuard

/**
 * Determine if a value is a TanStack Router not-found error.
 */
external val isNotFound: TypeGuard<Any?, NotFoundError>
