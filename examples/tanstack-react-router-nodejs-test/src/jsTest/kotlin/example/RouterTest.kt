package example

import example.testsupport.DataTestId
import kotlinx.coroutines.test.runTest
import react.create
import testing.library.dom.EventType
import testing.library.dom.click
import testing.library.dom.fireEvent
import testing.library.dom.screen
import testing.library.react.cleanup
import testing.library.react.render
import web.html.HTMLElement
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class RouterTest {
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage() = runTest {
        // before each test

        // given

        // when
        render(App.create())

        // then
        val indexContainer = screen.findByTestId<HTMLElement>(DataTestId.INDEX_CONTAINER)
        assertNotNull(indexContainer, "index page")

        val topicsLink = screen.findByTestId<HTMLElement>(DataTestId.INDEX_LINK_TOPICS)
        assertNotNull(topicsLink, "link to topics on index page")

        // when
// TODO: replace with UE user.click(topicsLink)
        fireEvent[EventType.click]?.invoke(topicsLink, undefined)

        // then
        val topicsContainer = screen.findByTestId<HTMLElement>(DataTestId.TOPICS_CONTAINER)
        assertNotNull(topicsContainer, "topics page")

        val componentTopicLink = screen.findByTestId<HTMLElement>(DataTestId.TOPIC_LINK_COMPONENTS)
// TODO: enable when supported
//        val componentTopicLink: HTMLElement =
//            within(topicsContainer).findByTestId<HTMLElement>(DataTestId.TOPIC_LINK_COMPONENTS)

// TODO: replace with UE user.click(componentTopicLink)
        fireEvent[EventType.click]?.invoke(componentTopicLink, undefined)

        val topicContainer = screen.findByTestId<HTMLElement>(DataTestId.TOPIC_CONTAINER)
        assertEquals("Requested topic ID: components", topicContainer.textContent)

        // after each test
        cleanup()
    }
}
