package example.testsupport

import web.dom.DataTestId

object DataTestId {
    inline val INDEX_CONTAINER: DataTestId
        get() = DataTestId("INDEX_CONTAINER")
    inline val HOME_CONTAINER: DataTestId
        get() = DataTestId("HOME_CONTAINER")
    inline val ABOUT_CONTAINER: DataTestId
        get() = DataTestId("ABOUT_CONTAINER")
    inline val TOPICS_CONTAINER: DataTestId
        get() = DataTestId("TOPICS_CONTAINER")
    inline val TOPIC_CONTAINER: DataTestId
        get() = DataTestId("TOPIC_CONTAINER")

    inline val INDEX_LINK_HOME: DataTestId
        get() = DataTestId("INDEX_LINK_HOME")
    inline val INDEX_LINK_ABOUT: DataTestId
        get() = DataTestId("INDEX_LINK_ABOUT")
    inline val INDEX_LINK_TOPICS: DataTestId
        get() = DataTestId("INDEX_LINK_TOPICS")

    inline val TOPIC_LINK_COMPONENTS: DataTestId
        get() = DataTestId("TOPIC_LINK_COMPONENTS")
    inline val TOPIC_LINK_PROPS_V_STATE: DataTestId
        get() = DataTestId("TOPIC_LINK_PROPS_V_STATE")
}
