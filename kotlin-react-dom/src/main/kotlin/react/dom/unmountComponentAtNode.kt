@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

import org.w3c.dom.Element

/**
 * [Deprecation details](https://reactjs.org/blog/2022/03/08/react-18-upgrade-guide.html#deprecations)
 */
@Deprecated("Legacy API")
external fun unmountComponentAtNode(
    domContainerNode: Element?,
)
