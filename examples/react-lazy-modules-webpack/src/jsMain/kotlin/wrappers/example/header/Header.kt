package wrappers.example.header

import js.lazy.Lazy
import react.FC
import react.dom.html.ReactHTML.div

@Lazy
val Header = FC {
    div {
        +"Header"
    }
}
