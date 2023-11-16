@file:JsModule("react-dom/test-utils")

package react.dom.test

import react.ComponentType
import react.ReactElement

/**
 * Returns `true` if `element` is a React element whose type is of a React `type`.
 */
external fun isElementOfType(
    element: ReactElement<*>,
    type: ComponentType<*>,
): Boolean
