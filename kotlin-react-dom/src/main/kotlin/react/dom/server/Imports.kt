@file:JsModule("react-dom/server")
@file:JsNonModule

package react.dom.server

// See https://reactjs.org/docs/react-dom-server.html

@JsName("renderToString")
external fun rawRenderToString(element: dynamic): String

@JsName("renderToStaticMarkup")
external fun rawRenderToStaticMarkup(element: dynamic): String
