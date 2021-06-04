@file:JsModule("react-dom/server")

package react.dom.server

// See https://reactjs.org/docs/react-dom-server.html

@JsName("renderToString")
external fun rawRenderToString(element: dynamic): String

@JsName("renderToStaticMarkup")
external fun rawRenderToStaticMarkup(element: dynamic): String
