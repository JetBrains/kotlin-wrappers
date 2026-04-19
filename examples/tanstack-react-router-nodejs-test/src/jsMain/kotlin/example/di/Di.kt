package example.di

import example.TopicService
import kotlinx.coroutines.CoroutineScope

// For demonstration purposes only
// In a real project, use kodein or another dependency injection framework
data class Di(val scope: CoroutineScope, val topicService: TopicService)
