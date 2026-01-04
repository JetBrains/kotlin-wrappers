package example

import react.FC
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import tanstack.react.router.Link
import tanstack.router.core.RoutePath

val Index = FC {
    nav {
        ul {
            li {
                Link {
                    to = RoutePath(".")

                    +"Home"
                }
            }
            li {
                Link {
                    to = RoutePath("about")

                    +"About"
                }
            }
            li {
                Link {
                    to = RoutePath("topics")

                    +"Topics"
                }
            }
        }
    }
}
