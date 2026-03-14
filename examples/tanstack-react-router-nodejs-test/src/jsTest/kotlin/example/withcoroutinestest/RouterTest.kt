package example

import example.testsupport.DataTestId
import kotlinx.coroutines.test.runTest
import react.FC
import react.Props
import react.create
import testing.library.dom.screen
import testing.library.dom.within
import testing.library.react.cleanup
import testing.library.react.render
import testing.library.user.event.userEvent
import kotlin.test.*
import example.createTestableApp

class RouterTest {
    private lateinit var testApp: FC<Props>

    @BeforeTest
    fun beforeTest() {
        testApp = createTestableApp()
    }

    @AfterTest
    fun afterTest() {
        cleanup()
    }

    private suspend fun doTest() {
        // given
        val user = userEvent.setup()

        // when
        render(testApp.create())

        // then
        val indexContainer = screen.findByTestId(DataTestId.INDEX_CONTAINER)
        assertNotNull(indexContainer, "index page")

        val topicsLink = screen.findByTestId(DataTestId.INDEX_LINK_TOPICS)
        assertNotNull(topicsLink, "link to topics on index page")

        // when
        user.click(topicsLink)

        // then
        val topicsContainer = screen.findByTestId(DataTestId.TOPICS_CONTAINER)
        assertNotNull(topicsContainer, "topics page")

        val componentTopicLink =
            within(topicsContainer).findByTestId(DataTestId.TOPIC_LINK_COMPONENTS)

        user.click(componentTopicLink)

        val topicContainer = screen.findByTestId(DataTestId.TOPIC_CONTAINER)
        assertEquals("Requested topic ID: components", topicContainer.textContent)
    }

    @Test
    fun `should click topics link and navigate to topics page`() =
        runTest {
            doTest()
        }

    // Simulate multiple tests
    @Test
    fun `should click topics link and navigate to topics page 21`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 22`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 23`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 24`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 25`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 26`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 27`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 28`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 29`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 1`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 2`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 3`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 4`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 5`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 6`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 7`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 8`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 9`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 10`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 11`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 12`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 13`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 14`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 15`() = runTest{ doTest() }

    @Test
    fun `should click topics link and navigate to topics page 16`() = runTest{ doTest() }
}
