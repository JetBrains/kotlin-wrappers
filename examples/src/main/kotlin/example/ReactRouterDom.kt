package example

import react.FC
import react.Props
import react.create
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import react.router.Route
import react.router.Routes
import react.router.dom.BrowserRouter
import react.router.dom.Link
import react.router.useLocation
import react.router.useParams

val Home = FC<Props> {
    h2 {
        +"Home"
    }
}

val About = FC<Props> {
    h2 {
        +"About"
    }
}

val Topics = FC<Props> {
    val location = useLocation()

    div {
        h2 {
            +"Topics"
        }

        ul {
            li {
                Link {
                    to = "/components"

                    +"Components"
                }
            }
            li {
                Link {
                    to = "/props-v-state"

                    +"Props v. State"
                }
            }
        }

        Routes {
            Route {
                path = "${location.pathname}/:topicId"
                element = Topic.create()
            }
            Route {
                path = location.pathname
                element = h3.create { +"Please select a topic." }
            }
        }
    }
}

val Topic = FC<Props> {
    val topicId = useParams()["topicId"]
        ?: return@FC

    h3 {
        +"Requested topic ID: $topicId"
    }
}

val ReactRouterDomApp = FC<Props> {
    BrowserRouter {
        div {
            ul {
                li {
                    Link {
                        to = "/"

                        +"Home"
                    }
                }
                li {
                    Link {
                        to = "/about"

                        +"About"
                    }
                }
                li {
                    Link {
                        to = "/topics"

                        +"Topics"
                    }
                }
            }

            Routes {
                Route {
                    path = "/about"
                    element = About.create()
                }
                Route {
                    path = "/topics"
                    element = Topics.create()
                }
                Route {
                    path = "/"
                    element = Home.create()
                }
            }
        }
    }
}
