@file:JsModule("react-dom")
@file:JsNonModule

package react.dom

import org.w3c.dom.Element

// See https://reactjs.org/docs/react-dom.html

// 18.0+
external fun createRoot(
    container: Element,
    options: RootOptions? = definedExternally,
): Root

external interface Root {
    fun render(element: dynamic)
}

external interface RootOptions {
    var hydrate: Boolean
}
