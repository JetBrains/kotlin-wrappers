package example

import tanstack.router.core.ParamName
import tanstack.router.core.RoutePath

val TOPIC_ID_PARAM: ParamName = ParamName("topicId")

val INDEX_PATH: RoutePath = RoutePath("/")
val HOME_PATH: RoutePath = RoutePath("/home")
val ABOUT_PATH: RoutePath = RoutePath("/about")
val TOPICS_PATH: RoutePath = RoutePath("/topics")
val TOPIC_PATH: RoutePath = RoutePath("/topics/", TOPIC_ID_PARAM)
