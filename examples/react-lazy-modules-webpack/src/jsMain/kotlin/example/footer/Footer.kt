package example.footer

import js.lazy.Lazy
import react.FC
import react.dom.html.ReactHTML.div
import react.invoke
import react.unaryPlus

@Lazy
val Footer = FC {
    div {
        +"Footer"
    }
}
