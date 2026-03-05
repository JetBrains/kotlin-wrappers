package example

import example.testsupport.DataTestId
import example.testsupport.dataTestId
import react.FC
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import tanstack.react.router.Link

val Index = FC {
    nav {
        dataTestId = DataTestId.INDEX_CONTAINER
        ul {
            li {
                Link {
                    dataTestId = DataTestId.INDEX_LINK_HOME
                    to = HOME_PATH

                    +"Home"
                }
            }
            li {
                Link {
                    dataTestId = DataTestId.INDEX_LINK_ABOUT
                    to = ABOUT_PATH

                    +"About"
                }
            }
            li {
                Link {
                    dataTestId = DataTestId.INDEX_LINK_TOPICS
                    to = TOPICS_PATH

                    +"Topics"
                }
            }
        }
    }
}
