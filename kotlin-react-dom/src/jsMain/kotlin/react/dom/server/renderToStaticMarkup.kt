@file:JsModule("react-dom/server")

package react.dom.server

import react.ReactNode

// See https://reactjs.org/docs/react-dom-server.html

external fun renderToStaticMarkup(element: ReactNode?): String
