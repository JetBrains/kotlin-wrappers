@file:JsModule("react-dom")

package react.dom

import org.w3c.dom.*

external fun render(element: dynamic, container: Element?, callback: () -> Unit = definedExternally)

external fun findDOMNode(component: dynamic): Element

external fun unmountComponentAtNode(domContainerNode: Element?)
