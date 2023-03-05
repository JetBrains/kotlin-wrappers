package example

import js.core.get
import js.core.jso
import react.VFC
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

val Root = VFC {
    nav {
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
    }

    Outlet()
}

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

        Outlet()
    }
}

val Topic = VFC {
    val topicId = useParams()["topicId"]
        ?: return@VFC

    h3 {
        +"Requested topic ID: $topicId"
    }
}

val appRouter = createBrowserRouter(
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
                    path = "/about"
                    element = About.create()
                },
                jso {
                    path = "/topics"
                    element = Topics.create()
                    children = arrayOf(
                        jso {
                            index = true
                            element = h3.create { +"Please select a topic." }
                        },
                        jso {
                            path = "/:topicId"
                            element = Topic.create()
                        },
                    )
                },
            )
        },
    )
)

val ReactRouterDomApp = VFC {
    RouterProvider { router = appRouter }
}
