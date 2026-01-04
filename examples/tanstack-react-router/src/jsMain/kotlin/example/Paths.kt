package example

import tanstack.router.core.RoutePath

val INDEX_PATH = RoutePath("/")
val HOME_PATH = RoutePath("/home")
val ABOUT_PATH = RoutePath("/about")
val TOPICS_PATH = RoutePath("/topics")
val TOPIC_PATH = RoutePath($$"/topics/$topicId")
