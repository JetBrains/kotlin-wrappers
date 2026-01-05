package example

import js.objects.recordOf
import react.FC
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import tanstack.react.router.Link

val Topics = FC {
    div {
        h2 {
            +"Topics"
        }

        ul {
            li {
                Link {
                    to = TOPIC_PATH
                    params = recordOf(
                        "topicId" to "components",
                    )

                    +"Components"
                }
            }
            li {
                Link {
                    to = TOPIC_PATH
                    params = recordOf(
                        "topicId" to "props-v-state",
                    )

                    +"Props v. State"
                }
            }
        }
    }
}
