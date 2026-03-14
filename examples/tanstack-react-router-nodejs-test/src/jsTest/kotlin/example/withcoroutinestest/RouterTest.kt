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

    @Test
    fun `should click topics link and navigate to topics page`() =
        runTest {
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

    // Simulate multiple tests
    @Test
    fun `should click topics link and navigate to topics page 21`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 22`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 23`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 24`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 25`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 26`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 27`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 28`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 29`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 1`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 2`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 3`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 4`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 5`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 6`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 7`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 8`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 9`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 10`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 11`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 12`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 13`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 14`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 15`() =
        `should click topics link and navigate to topics page`()

    @Test
    fun `should click topics link and navigate to topics page 16`() =
        `should click topics link and navigate to topics page`()
}
