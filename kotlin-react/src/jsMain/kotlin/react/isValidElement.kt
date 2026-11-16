@file:JsModule("react")

package react

import js.reflect.TypeGuard

/**
 * [Online Documentation](https://react.dev/reference/react/isValidElement)
 */
external val isValidElement: TypeGuard<Any?, ReactElement<*>>
