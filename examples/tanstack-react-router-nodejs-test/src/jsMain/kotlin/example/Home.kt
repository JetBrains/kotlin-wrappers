package example

import example.testsupport.HOME_CONTAINER_ID
import example.testsupport.dataTestId
import react.FC
import react.dom.html.ReactHTML.h2

val Home = FC {
    h2 {
        dataTestId = HOME_CONTAINER_ID
        +"Home"
    }
}
