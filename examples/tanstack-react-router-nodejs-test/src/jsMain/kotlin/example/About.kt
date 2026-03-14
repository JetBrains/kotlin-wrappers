package example

import example.testsupport.ABOUT_CONTAINER_ID
import example.testsupport.dataTestId
import react.FC
import react.dom.html.ReactHTML.h2

val About = FC {
    h2 {
        dataTestId = ABOUT_CONTAINER_ID
        +"About"
    }
}
