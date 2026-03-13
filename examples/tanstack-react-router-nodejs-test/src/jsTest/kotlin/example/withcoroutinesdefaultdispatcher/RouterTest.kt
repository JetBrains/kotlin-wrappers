package example

import example.testsupport.DataTestId
import kotlinx.coroutines.*
import react.FC
import react.Props
import react.create
import react.use.useConstant
import tanstack.history.CreateMemoryHistoryOpts
import tanstack.history.createMemoryHistory
import tanstack.react.router.Router
import tanstack.react.router.RouterOptions
import tanstack.react.router.RouterProvider
import tanstack.react.router.createRouter
import testing.library.dom.screen
import testing.library.dom.within
import testing.library.react.cleanup
import testing.library.react.render
import testing.library.user.event.userEvent
import kotlin.js.Promise
import kotlin.test.*

// Run tests with the Default coroutine dispatcher
// Test needs no knowledge of how coroutines are used
class RouterTestWithoutCoroutinesTestDependency {
    private lateinit var testApp: FC<Props>

    private fun createTestAppRouter(): Router {
        val history = createMemoryHistory(
            CreateMemoryHistoryOpts(
                initialEntries = arrayOf("/"),
                initialIndex = 0
            ))

        return createRouter(
            RouterOptions(
                routeTree = buildRouteTree(),
                history = history
            )
        )
    }

    private fun createTestableApp() = FC {
        val appRouter: Router = useConstant(::createTestAppRouter )

        RouterProvider {
            router = appRouter
        }
    }

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

    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage(): Promise<Unit> = JsTestScope.promise {
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
    fun shouldClickTopicsLinkAndNavigateToTopicsPage21() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage22() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage23() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage24() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage25() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage26() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage27() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage28() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage29() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage1() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage2() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage3() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage4() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage5() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage6() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage7() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage8() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage9() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage10() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage11() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage12() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage13() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage14() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage15() = shouldClickTopicsLinkAndNavigateToTopicsPage()
    @Test
    fun shouldClickTopicsLinkAndNavigateToTopicsPage16() = shouldClickTopicsLinkAndNavigateToTopicsPage()
}
