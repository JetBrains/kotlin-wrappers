package example.header

import js.lazy.Lazy
import react.FC
import react.dom.html.ReactHTML.div
import react.invoke
import react.unaryPlus

@Lazy
val Header = FC {
    div {
        +"Header"
    }
}
