package example

import example.testsupport.DataTestId
import example.testsupport.dataTestId
import react.FC
import react.dom.html.ReactHTML.h2

val Home = FC {
    h2 {
        dataTestId = DataTestId.HOME_CONTAINER
        +"Home"
    }
}
