package example

import react.Props
import react.RBuilder
import react.dom.*
import react.fc
import react.router.dom.*

val Home = fc<Props> { h2 { +"Home" } }
val About = fc<Props> { h2 { +"About" } }

val Topics = fc<Props> {
    val match = useRouteMatch()

    div {
        h2 { +"Topics" }

        ul {
            li {
                Link {
                    attrs.to = "${match.url}/components"
                    +"Components"
                }
            }
            li {
                Link {
                    attrs.to = "${match.url}/props-v-state"
                    +"Props v. State"
                }
            }
        }

        Switch {
            Route {
                attrs.path = arrayOf("${match.path}/:topicId")
                attrs.component = Topic
            }
            Route {
                attrs.path = arrayOf(match.path)
                h3 { +"Please select a topic." }
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

            Switch {
                Route {
                    attrs.path = arrayOf("/about")
                    attrs.component = About
                }
                Route {
                    attrs.path = arrayOf("/topics")
                    attrs.component = Topics
                }
                Route {
                    attrs.path = arrayOf("/")
                    attrs.component = Home
                }
            }
        }
    }
}
