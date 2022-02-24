package benchmark

import TestScope
import kotlinx.browser.window
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.toList
import runTest
import kotlin.test.BeforeTest
import kotlin.test.assertTrue
import kotlin.time.Duration
import kotlin.time.DurationUnit

open class BenchmarkBase {
    protected val additionalMeasurements = mutableMapOf<String, MutableList<Duration>>()
    private fun flowRepeat(count: Int, calculate: suspend () -> Duration): Flow<Duration> {
        return flow {
            repeat(count) {
                emit(calculate())
            }
        }
    }

    @BeforeTest
    open fun before() = runTest {
        clearStyles()
    }

    protected fun TestScope.assertCssNotEmpty() {
        assertTrue(getRules().isNotEmpty())
    }

    /**
     * Run the [name] benchmark [repeat] times and print average [Duration] of [run] runs
     */
    protected fun runBenchmark(
        name: String,
        repeat: Int = 5,
        run: suspend TestScope.() -> Duration,
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
