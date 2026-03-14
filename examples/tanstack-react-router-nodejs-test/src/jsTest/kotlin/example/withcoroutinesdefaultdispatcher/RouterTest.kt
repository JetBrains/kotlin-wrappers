package example

import example.testsupport.DataTestId
import kotlinx.coroutines.*
import react.FC
import react.Props
import react.create
import testing.library.dom.screen
import testing.library.dom.within
import testing.library.react.cleanup
import testing.library.react.render
import testing.library.user.event.userEvent
import js.coroutines.promise
import js.promise.Promise
import kotlin.test.*
import example.createTestableApp

// Run tests with the Default coroutine dispatcher
// Test needs no knowledge of how coroutines are used
class RouterTestWithoutCoroutinesTestDependency {
    private lateinit var testApp: FC<Props>

    // Use dependency injection to inject this test CoroutineScope into your production code instead of MainScope
    object JsTestScope : CoroutineScope {
        override val coroutineContext =
            SupervisorJob() + Dispatchers.Default
    }

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
    fun `should click topics link and navigate to topics page`(): Promise<Unit> =
        JsTestScope.promise {
            doTest()
        }

    // Simulate multiple tests
    @Test
    fun `should click topics link and navigate to topics page 21`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 22`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 23`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 24`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 25`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 26`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 27`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 28`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 29`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 1`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 2`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 3`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 4`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 5`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 6`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 7`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 8`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 9`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 10`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 11`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 12`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 13`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 14`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 15`() = JsTestScope.promise { doTest() }

    @Test
    fun `should click topics link and navigate to topics page 16`() = JsTestScope.promise { doTest() }
}
