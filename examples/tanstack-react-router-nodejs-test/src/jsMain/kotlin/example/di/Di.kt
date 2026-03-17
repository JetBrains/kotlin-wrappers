package example.di

object DiConstants {
    const val SCOPE = "CoroutineScope"
    const val TOPIC_SERVICE = "TopicService"
}

// For demonstration purposes only
// In a real project, use kodein or another dependency injection framework
interface Di {
    operator fun get(key: String): Any?
}
