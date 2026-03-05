package example

import react.FC
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import tanstack.react.router.Link

val Index = FC {
    nav {
        ul {
            li {
                Link {
                    to = HOME_PATH

                    +"Home"
                }
            }
            li {
                Link {
                    to = ABOUT_PATH

                    +"About"
                }
            }
            li {
                Link {
                    to = TOPICS_PATH

                    +"Topics"
                }
            }
        }
    }
}
