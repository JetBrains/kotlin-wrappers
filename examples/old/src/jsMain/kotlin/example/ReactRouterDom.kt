package example

import js.objects.jso
import react.FC
import react.create
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.nav
import react.dom.html.ReactHTML.ul
import react.router.Outlet
import react.router.RouterProvider
import react.router.dom.Link
import react.router.dom.createBrowserRouter
import react.router.useParams

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
        jso {
            path = "/"
            element = Root.create()
            children = arrayOf(
                jso {
                    index = true
                    element = Home.create()
                },
                jso {
                    path = "about"
                    element = About.create()
                },
                jso {
                    path = "topics"
                    element = Topics.create()
                    children = arrayOf(
                        jso {
                            index = true
                            element = h3.create { +"Please select a topic." }
                        },
                        jso {
                            path = ":topicId"
                            element = Topic.create()
                        },
                    )
                },
            )
        },
    )
)

val ReactRouterDomApp = FC {
    RouterProvider {
        router = APP_ROUTER
    }
}
