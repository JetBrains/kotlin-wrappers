package example

import example.testsupport.DataTestId
import example.testsupport.dataTestId
import react.FC
import react.dom.html.ReactHTML.h2

val About = FC {
    h2 {
        dataTestId = DataTestId.ABOUT_CONTAINER
        +"About"
    }
}
