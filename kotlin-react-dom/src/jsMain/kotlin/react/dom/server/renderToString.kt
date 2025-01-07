@file:JsModule("react-dom/server")

package react.dom.server

import react.ReactNode

// See https://reactjs.org/docs/react-dom-server.html

external fun renderToString(element: ReactNode?): String
