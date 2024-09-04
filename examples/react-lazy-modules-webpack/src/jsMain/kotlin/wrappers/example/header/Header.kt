@file:JsExport
@file:JsFileName("header")

package wrappers.example.header

import react.FC
import react.dom.html.ReactHTML.div

val Header = FC {
    div {
        +"Header"
    }
}
