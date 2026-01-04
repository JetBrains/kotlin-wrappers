package example

import react.FC
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import tanstack.react.router.Link
import tanstack.router.core.RoutePath

val Topics = FC {
    div {
        h2 {
            +"Topics"
        }

        ul {
            li {
                Link {
                    to = RoutePath("components")

                    +"Components"
                }
            }
            li {
                Link {
                    to = RoutePath("props-v-state")

                    +"Props v. State"
                }
            }
        }
    }
}
