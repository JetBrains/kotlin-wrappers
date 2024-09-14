package wrappers.example.content

import js.lazy.Lazy
import react.FC
import react.dom.html.ReactHTML.div

@Lazy
val Content = FC {
    div {
        +"Content"
    }
}
