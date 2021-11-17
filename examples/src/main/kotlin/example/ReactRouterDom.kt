package example

import react.Props
import react.RBuilder
import react.createElement
import react.dom.*
import react.fc
import react.router.Route
import react.router.Routes
import react.router.dom.BrowserRouter
import react.router.dom.Link
import react.router.useLocation
import react.router.useParams

val Home = fc<Props> { h2 { +"Home" } }
val About = fc<Props> { h2 { +"About" } }

val Topics = fc<Props> {
    val location = useLocation()

    div {
        h2 { +"Topics" }

        ul {
            li {
                Link {
                    attrs.to = "/components"
                    +"Components"
                }
            }
            li {
                Link {
                    attrs.to = "/props-v-state"
                    +"Props v. State"
                }
            }
        }

        Routes {
            Route {
                attrs.path = "${location.pathname}/:topicId"
                attrs.element = createElement(Topic)
            }
            Route {
                attrs.path = location.pathname
                attrs.element = createElement {
                    h3 { +"Please select a topic." }
                }
            }
        }
    }
}

val Topic = fc<Props> {
    val topicId = useParams()["topicId"] ?: return@fc

    h3 { +"Requested topic ID: $topicId" }
}

fun RBuilder.appWithRouter() {
    BrowserRouter {
        div {
            ul {
                li {
                    Link {
                        attrs.to = "/"
                        +"Home"
                    }
                }
                li {
                    Link {
                        attrs.to = "/about"
                        +"About"
                    }
                }
                li {
                    Link {
                        attrs.to = "/topics"
                        +"Topics"
                    }
                }
            }

            Routes {
                Route {
                    attrs.path = "/about"
                    attrs.element = createElement(About)
                }
                Route {
                    attrs.path = "/topics"
                    attrs.element = createElement(Topics)
                }
                Route {
                    attrs.path = "/"
                    attrs.element = createElement(Home)
                }
            }
        }
    }
}
