package example

import example.di.Di
import example.di.DiConstants.SCOPE
import example.di.DiConstants.TOPIC_SERVICE
import example.di.DiContextProvider
import kotlinx.coroutines.MainScope
import react.FC
import react.use.useConstant
import tanstack.react.router.RouterProvider

fun createProductionDi(): Di {
    return object: Di {
        val map = mapOf(
            SCOPE to MainScope(),
            TOPIC_SERVICE to TopicServiceImpl()
        )

        override fun get(key: String) = map[key]
    }
}

val App = FC {
    val appRouter = useConstant(::createAppRouter)

    DiContextProvider {
        di = createProductionDi()
        RouterProvider {
            router = appRouter
        }
    }
}
