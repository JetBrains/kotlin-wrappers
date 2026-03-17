package example

import example.di.Di
import example.di.DiContext
import example.testsupport.TOPICS_CONTAINER_ID
import js.objects.recordOf
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import react.FC
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import react.use
import react.useEffect
import react.useState
import tanstack.react.router.Link

val Topics = FC {
    val di: Di = use(DiContext)!!
    val scope: CoroutineScope = di.scope
    val topicService: TopicService = di.topicService
    var topics by useState<List<TopicItem>?>(null)

    useEffect {
        scope.launch {
            topics = topicService.getTopics()
        }
    }

    div {
        dataTestId = TOPICS_CONTAINER_ID
        h2 {
            +"Topics"
        }

        ul {
            topics?.forEach { topicItem ->
                li {
                    Link {
                        dataTestId = topicItem.testId
                        to = TOPIC_PATH
                        params = recordOf(
                            TOPIC_ID_PARAM to topicItem.path,
                        )

                        +topicItem.name
                    }
                }
            }
        }
    }
}
