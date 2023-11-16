@file:JsModule("react-dom")

package react.dom

import web.dom.Element

// See https://reactjs.org/docs/react-dom.html

external fun findDOMNode(
    component: dynamic,
): Element?
