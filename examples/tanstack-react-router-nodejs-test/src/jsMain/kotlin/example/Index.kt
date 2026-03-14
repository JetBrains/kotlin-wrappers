package example

import example.testsupport.*
import react.FC
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import tanstack.react.router.Link

val Index = FC {
    nav {
        dataTestId = INDEX_CONTAINER_ID
        ul {
            li {
                Link {
                    dataTestId = INDEX_LINK_HOME_ID
                    to = HOME_PATH

                    +"Home"
                }
            }
            li {
                Link {
                    dataTestId = INDEX_LINK_ABOUT_ID
                    to = ABOUT_PATH

                    +"About"
                }
            }
            li {
                Link {
                    dataTestId = INDEX_LINK_TOPICS_ID
                    to = TOPICS_PATH

                    +"Topics"
                }
            }
        }
    }
}
