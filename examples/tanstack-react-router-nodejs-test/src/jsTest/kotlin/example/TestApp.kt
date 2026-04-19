package example

import example.di.Di
import example.di.DiContextProvider
import react.FC
import react.Props
import react.use.useConstant
import tanstack.history.CreateMemoryHistoryOpts
import tanstack.history.createMemoryHistory
import tanstack.react.router.Router
import tanstack.react.router.RouterOptions
import tanstack.react.router.RouterProvider
import tanstack.react.router.createRouter

private fun createTestAppRouter(): Router {
    val history = createMemoryHistory(
        CreateMemoryHistoryOpts(
            initialEntries = arrayOf("/"),
            initialIndex = 0
        )
    )

    return createRouter(
        RouterOptions(
            routeTree = buildRouteTree(),
            history = history
        )
    )
}

external interface TestAppProps: Props {
    var di: Di
}

val TestApp = FC<TestAppProps> { props ->
    val appRouter: Router = useConstant(::createTestAppRouter)

    DiContextProvider {
        di = props.di
        RouterProvider {
            router = appRouter
        }
    }
}

