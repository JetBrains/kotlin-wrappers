package example

import example.testsupport.DataTestId
import example.testsupport.dataTestId
import react.FC
import react.dom.html.ReactHTML.h3
import tanstack.react.router.useParams

val Topic = FC {
    val topicId = useParams {
        it[TOPIC_ID_PARAM] as String
    }

    h3 {
        dataTestId = DataTestId.TOPIC_CONTAINER
        +"Requested topic ID: $topicId"
    }
}
