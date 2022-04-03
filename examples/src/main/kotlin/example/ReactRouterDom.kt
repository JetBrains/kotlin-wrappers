package example

import react.VFC
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

val Home = VFC {
    h2 {
        +"Home"
    }
}

val About = VFC {
    h2 {
        +"About"
    }
}

val Topics = VFC {
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

val Topic = VFC {
    val topicId = useParams()["topicId"]
        ?: return@VFC

    h3 {
        +"Requested topic ID: $topicId"
    }
}

val ReactRouterDomApp = VFC {
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
