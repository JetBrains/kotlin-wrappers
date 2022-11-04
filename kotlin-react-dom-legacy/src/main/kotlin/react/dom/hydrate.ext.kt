package react.dom

import dom.Element
import react.Props
import react.Render
import react.createElement

/**
 * [Deprecation details](https://reactjs.org/blog/2022/03/08/react-18-upgrade-guide.html#deprecations)
 */
@Deprecated("Legacy API")
fun hydrate(
    container: Element,
    callback: () -> Unit = {},
    handler: Render,
) {
    @Suppress("DEPRECATION")
    hydrate(
        element = createElement<Props>(handler),
        container = container,
        callback = callback,
    )
}
