package benchmark

import TestScope
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.toList
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.CSSStyleSheet
import runTest
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.time.Duration
import kotlin.time.DurationUnit
import kotlin.time.ExperimentalTime

@OptIn(ExperimentalTime::class)
open class BenchmarkBase {
    protected val additionalMeasurements = mutableMapOf<String, MutableList<Duration>>()
    private fun flowRepeat(count: Int, calculate: suspend () -> Duration): Flow<Duration> {
        return flow {
            repeat(count) {
                emit(calculate())
            }
        }
    }

    protected fun assertCssNotEmpty() {
        val styles = document.getElementById("ksc-global-styles") as HTMLStyleElement
        assertTrue((styles.sheet as CSSStyleSheet).cssRules.length > 0)
    }

    protected fun TestScope.assertChildrenCount(n: Int) {
        assertEquals(n, root.childElementCount)
    }

    /**
     * Run [name] benchmark for [repeat] times and print average [Duration] of [run] runs
     */
    protected fun runBenchmark(
        name: String,
        repeat: Int = 5,
        run: suspend TestScope.() -> Duration
    ) = runTest {
        val durations = flowRepeat(count = repeat) { run() }.toList()

        val avgMs = durations.map { it.toInt(DurationUnit.MILLISECONDS) }.average().toInt()

        val browserName = window.navigator.userAgent.lowercase().let {
            when {
                it.contains("chrome") -> "chrome"
                it.contains("firefox") -> "firefox"
                else -> "unknown_browser"
            }
        }

        println("#$name[$browserName]:$avgMs;\n")
        additionalMeasurements.forEach { (key, additionalDurations) ->
            val additionalAvgMs = additionalDurations.map { it.toInt(DurationUnit.MILLISECONDS) }.average().toInt()
            println("#$name-$key[$browserName]:$additionalAvgMs;\n")
        }
        additionalMeasurements.clear()
    }
}