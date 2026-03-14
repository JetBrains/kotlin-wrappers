package example

import example.testsupport.DataTestId
import example.testsupport.dataTestId
import js.objects.recordOf
import react.FC
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import tanstack.react.router.Link

val Topics = FC {
    div {
        dataTestId = DataTestId.TOPICS_CONTAINER
        h2 {
            +"Topics"
        }

        ul {
            li {
                Link {
                    dataTestId = DataTestId.TOPIC_LINK_COMPONENTS
                    to = TOPIC_PATH
                    params = recordOf(
                        TOPIC_ID_PARAM to "components",
                    )

                    +"Components"
                }
            }
            li {
                Link {
                    dataTestId = DataTestId.TOPIC_LINK_PROPS_V_STATE
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
