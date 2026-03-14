package example

import example.testsupport.TOPICS_CONTAINER_ID
import example.testsupport.TOPIC_LINK_COMPONENTS_ID
import example.testsupport.TOPIC_LINK_PROPS_V_STATE_ID
import js.objects.recordOf
import react.FC
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import tanstack.react.router.Link

val Topics = FC {
    div {
        dataTestId = TOPICS_CONTAINER_ID
        h2 {
            +"Topics"
        }

        ul {
            li {
                Link {
                    dataTestId = TOPIC_LINK_COMPONENTS_ID
                    to = TOPIC_PATH
                    params = recordOf(
                        TOPIC_ID_PARAM to "components",
                    )

                    +"Components"
                }
            }
            li {
                Link {
                    dataTestId = TOPIC_LINK_PROPS_V_STATE_ID
                    to = TOPIC_PATH
                    params = recordOf(
                        TOPIC_ID_PARAM to "props-v-state",
                    )

                    +"Props v. State"
                }
            }
        }
    }
}
