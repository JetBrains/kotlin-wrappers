package example

import example.di.Di
import example.di.DiContextProvider
import kotlinx.coroutines.MainScope
import react.FC
import react.use.useConstant
import tanstack.react.router.RouterProvider

fun createProductionDi() = Di(scope = MainScope(),
            topicService = TopicServiceImpl())

val App = FC {
    val appRouter = useConstant(::createAppRouter)

    DiContextProvider {
        di = createProductionDi()
        RouterProvider {
            router = appRouter
        }
    }
}
