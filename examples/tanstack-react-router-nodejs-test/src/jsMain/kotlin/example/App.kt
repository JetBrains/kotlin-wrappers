package example

import react.FC
import react.use.useConstant
import tanstack.react.router.RouterProvider

val App = FC {
    val appRouter = useConstant(::createAppRouter)

    RouterProvider {
        router = appRouter
    }
}
