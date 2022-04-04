@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

import org.w3c.dom.Element
import react.ReactElement

/**
 * [Deprecation details](https://reactjs.org/blog/2022/03/08/react-18-upgrade-guide.html#deprecations)
 */
@Deprecated("Will be removed soon!")
external fun hydrate(
    element: ReactElement<*>?,
    container: Element,
    callback: () -> Unit = definedExternally,
)
