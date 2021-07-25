import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.toList
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.CSSStyleSheet
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
class BenchmarkTests {
    private fun flowRepeat(count: Int, calculate: suspend () -> Duration): Flow<Duration> {
        return flow {
            repeat(count) {
                emit(calculate())
            }
        }
    }

    private fun assertCssNotEmpty() {
        val styles = document.getElementById("ksc-global-styles") as HTMLStyleElement
        assertTrue((styles.sheet as CSSStyleSheet).cssRules.length > 0)
        // TODO maybe somehow checking that the css is correct
    }

    private fun TestScope.assertChildrenCount(n: Int) {
        assertEquals(n, root.childElementCount)
    }

    private fun runBenchmark(
        name: String,
        repeat: Int = 5,
        run: suspend TestScope.() -> Duration
    ) = runTest {
        val durations = flowRepeat(count = repeat) {
            run()
        }.toList()

        val avgMs = durations.map { it.toInt(DurationUnit.MILLISECONDS) }.average().toInt()

        val browserName = window.navigator.userAgent.lowercase().let {
            when {
                it.contains("chrome") -> "chrome"
                it.contains("firefox") -> "firefox"
                else -> "unknown_browser"
            }
        }

        println("#$name[$browserName]:$avgMs;")
    }

    private suspend fun TestScope.addNItems(n: Int): Duration {
        assertChildrenCount(0)

        val duration = measureTime {
            renderComponent(getStyledComponent(n))
            waitForAnimationFrame()
        }

        assertChildrenCount(n)
        assertCssNotEmpty()

        clear()
        return duration
    }

    private suspend fun TestScope.addCssBuilders(n: Int): Duration {
        assertChildrenCount(0)

        val duration = measureTime {
            renderComponent(getStyledComponent(n))
            waitForAnimationFrame()
        }

        assertChildrenCount(n)
        assertCssNotEmpty()

        clear()
        return duration
    }

    @Test
    fun checkTestsRun() {
        println("Test has run")
    }


    @Test // add1kItems overrides default `repeat` value (was - 5, now - 3) to avoid getting swallowed on CI
    fun add1kItems() = runBenchmark(name = "add1000Items", repeat = 3) {
        addNItems(1000)
    }

    @Test
    fun add100Items() = runBenchmark("add100Items") {
        addNItems(100)
    }

    @Test
    fun add200Items() = runBenchmark("add200Items") {
        addNItems(200)
    }

    @Test
    fun add500Items() = runBenchmark("add500Items") {
        addNItems(500)
    }

    @Test
    fun add1kCSSBuilders() = runBenchmark(name = "add1kCSSBuilders", repeat = 3) {
        addCssBuilders(1000)
    }
}