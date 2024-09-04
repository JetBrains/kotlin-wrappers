@file:JsExport
@file:JsFileName("content")

package wrappers.example.content

import react.FC
import react.dom.html.ReactHTML.div

val Content = FC {
    div {
        +"Content"
    }
}
