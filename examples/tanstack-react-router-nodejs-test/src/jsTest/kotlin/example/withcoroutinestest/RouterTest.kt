package example.withcoroutinestest

import example.TestApp
import example.testsupport.*
import kotlinx.coroutines.test.runTest
import react.create
import testing.library.dom.screen
import testing.library.dom.within
import testing.library.react.cleanup
import testing.library.react.render
import testing.library.user.event.userEvent
import kotlin.test.AfterTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class RouterTest {
    @AfterTest
    fun afterTest() {
        cleanup()
    }

    private fun doTest() = runTest {
        // given
        val user = userEvent.setup()

        // when
        render(TestApp.create())

        // then
        val indexContainer = screen.findByTestId(INDEX_CONTAINER_ID)

        val topicsLink = screen.queryByTestId(INDEX_LINK_TOPICS_ID)
        assertNotNull(topicsLink, "link to topics on index page")

        // when
        user.click(topicsLink)

        // then
        val topicsContainer = screen.findByTestId(TOPICS_CONTAINER_ID)

        val componentTopicLink =
            within(topicsContainer).queryByTestId(TOPIC_LINK_COMPONENTS_ID)
        assertNotNull(componentTopicLink, "link to component topic")

        user.click(componentTopicLink)

        val topicContainer = screen.findByTestId(TOPIC_CONTAINER_ID)
    }

    @Test
    fun `should click topics link and navigate to topics page`() = doTest()

    // Simulate multiple tests
    @Test
    fun `should click topics link and navigate to topics page 21`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 22`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 23`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 24`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 25`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 26`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 27`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 28`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 29`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 1`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 2`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 3`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 4`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 5`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 6`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 7`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 8`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 9`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 10`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 11`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 12`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 13`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 14`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 15`() = doTest()

    @Test
    fun `should click topics link and navigate to topics page 16`() = doTest()
}
