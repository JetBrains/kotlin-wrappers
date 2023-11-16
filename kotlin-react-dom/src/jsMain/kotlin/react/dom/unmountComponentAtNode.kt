@file:JsModule("react-dom")

package react.dom

import web.dom.Element

/**
 * [Deprecation details](https://reactjs.org/blog/2022/03/08/react-18-upgrade-guide.html#deprecations)
 */
@Deprecated("Legacy API")
external fun unmountComponentAtNode(
    domContainerNode: Element?,
)
