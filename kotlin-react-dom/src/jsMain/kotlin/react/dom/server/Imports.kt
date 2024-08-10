@file:JsModule("react-dom/server")

package react.dom.server

import react.ReactNode

// See https://reactjs.org/docs/react-dom-server.html

@JsName("renderToString")
external fun rawRenderToString(element: ReactNode?): String

@JsName("renderToStaticMarkup")
external fun rawRenderToStaticMarkup(element: ReactNode?): String
