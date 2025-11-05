package example

import react.FC
import react.create
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.invoke
import react.router.Outlet
import react.router.RouteObject
import react.router.RouterProvider
import react.router.dom.Link
import react.router.dom.createBrowserRouter
import react.router.useParams
import react.unaryPlus

val Root = FC {
    nav {
        ul {
            li {
                Link {
                    to = "."

                    +"Home"
                }
            }
            li {
                Link {
                    to = "about"

                    +"About"
                }
            }
            li {
                Link {
                    to = "topics"

                    +"Topics"
                }
            }
        }
    }

    Outlet()
}

val Home = FC {
    h2 {
        +"Home"
    }
}

val About = FC {
    h2 {
        +"About"
    }
}

val Topics = FC {
    div {
        h2 {
            +"Topics"
        }

        ul {
            li {
                Link {
                    to = "components"

                    +"Components"
                }
            }
            li {
                Link {
                    to = "props-v-state"

                    +"Props v. State"
                }
            }
        }

        Outlet()
    }
}

val Topic = FC {
    val topicId = useParams()["topicId"]
        ?: return@FC

    h3 {
        +"Requested topic ID: $topicId"
    }
}

private val APP_ROUTER = createBrowserRouter(
    arrayOf(
        RouteObject(
            path = "/",
            Component = Root,
            children = arrayOf(
                RouteObject(
                    index = true,
                    Component = Home,
                ),
                RouteObject(
                    path = "about",
                    Component = About,
                ),
                RouteObject(
                    path = "topics",
                    Component = Topics,
                    children = arrayOf(
                        RouteObject(
                            index = true,
                            element = h3.create { +"Please select a topic." },
                        ),
                        RouteObject(
                            path = ":topicId",
                            Component = Topic,
                        ),
                    ),
                ),
            )
        ),
    )
)

val ReactRouterDomApp = FC {
    RouterProvider {
        router = APP_ROUTER
    }
}
