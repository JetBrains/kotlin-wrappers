package benchmark

import StyledElementsFactory.getCssBuilders
import TestScope
import kotlinx.css.CSSBuilder
import waitForAnimationFrame
import kotlin.test.Test
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
class CSSBuildersInject: BenchmarkBase() {
    /**
     * Measure time to inject [n] [CSSBuilder] CSS rules into DOM
     * @return duration of all injects
     */
    private suspend fun TestScope.addCssBuilders(n: Int): Duration {
        assertChildrenCount(0)

        val cssBuilders: List<CSSBuilder> = getCssBuilders(n)
        val duration = measureTime {
            cssBuilders.forEach { injectBuilder(it) }
            waitForAnimationFrame()
        }

        assertCssNotEmpty()

        clear()
        return duration
    }

    @Test
    fun add100CSSBuilders() = runBenchmark(name = "add100CSSBuilders") {
        addCssBuilders(100)
    }

    @Test
    fun add500CSSBuilders() = runBenchmark(name = "add500CSSBuilders") {
        addCssBuilders(500)
    }

    @Test
    fun add1kCSSBuilders() = runBenchmark(name = "add1kCSSBuilders", repeat = 3) {
        addCssBuilders(1000)
    }
}