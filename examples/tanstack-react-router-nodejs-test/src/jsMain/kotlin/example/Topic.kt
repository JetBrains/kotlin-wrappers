package example

import example.testsupport.TOPIC_CONTAINER_ID
import example.testsupport.dataTestId
import react.FC
import react.dom.html.ReactHTML.h3
import tanstack.react.router.useParams

val Topic = FC {
    val topicId = useParams {
        it[TOPIC_ID_PARAM] as String
    }

    h3 {
        dataTestId = TOPIC_CONTAINER_ID
        +"Requested topic ID: $topicId"
    }
}
