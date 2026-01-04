package example

import tanstack.react.router.*

fun createAppRouter(): Router {
    val rootRoute = createRootRoute()

    val indexRoute = createRoute(
        options = RouteOptions(
            getParentRoute = { rootRoute },
            path = INDEX_PATH,
            component = Index,
        ),
    )

    val homeRoute = createRoute(
        options = RouteOptions(
            getParentRoute = { rootRoute },
            path = HOME_PATH,
            component = Home,
        ),
    )

    val aboutRoute = createRoute(
        options = RouteOptions(
            getParentRoute = { rootRoute },
            path = ABOUT_PATH,
            component = About,
        ),
    )

    val topicsRoute = createRoute(
        options = RouteOptions(
            getParentRoute = { rootRoute },
            path = TOPICS_PATH,
            component = Topics,
        ),
    )

    val topicRoute = createRoute(
        options = RouteOptions(
            getParentRoute = { rootRoute },
            path = TOPIC_PATH,
            component = Topic,
        ),
    )

    rootRoute.addChildren(
        arrayOf(
            indexRoute,
            homeRoute,
            aboutRoute,
            topicsRoute,
            topicRoute
        ),
    )

    return createRouter(
        options = RouterOptions(
            routeTree = rootRoute,
        )
    )
}
