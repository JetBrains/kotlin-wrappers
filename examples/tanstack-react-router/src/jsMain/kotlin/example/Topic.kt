package example

import react.FC
import react.dom.html.ReactHTML.h3
import tanstack.react.router.useParams

val Topic = FC {
    val topicId = useParams()["topicId"]
        ?: return@FC

    h3 {
        +"Requested topic ID: $topicId"
    }
}
