package example

import example.testsupport.TOPIC_LINK_COMPONENTS_ID
import example.testsupport.TOPIC_LINK_PROPS_V_STATE_ID
import web.dom.DataTestId

data class TopicItem(val name: String, val path: String, val testId: DataTestId)

interface TopicService {
    suspend fun getTopics(): List<TopicItem>
}

class TopicServiceImpl : TopicService {
    override suspend fun getTopics() = listOf(
        TopicItem("Components", "components", TOPIC_LINK_COMPONENTS_ID),
        TopicItem("Props v. State", "props-v-state", TOPIC_LINK_PROPS_V_STATE_ID)
    )
}
