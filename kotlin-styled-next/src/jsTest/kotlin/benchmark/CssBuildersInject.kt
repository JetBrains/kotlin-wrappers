package benchmark

import StyledElementsFactory.getCssBuilders
import TestScope
import kotlinx.css.CssBuilder
import waitForAnimationFrame
import kotlin.test.Test
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
class CssBuildersInject : BenchmarkBase() {
    /**
     * Measure time to inject [n] [CssBuilder] CSS rules into DOM
     * @return duration of all injects
     */
    private suspend fun TestScope.addCssBuilders(n: Int): Duration {
        assertChildrenCount(0)

        val cssBuilders: List<CssBuilder> = getCssBuilders(n)
        val duration = measureTime {
            cssBuilders.forEach { injectBuilder(it) }
            waitForAnimationFrame()
        }

        assertCssNotEmpty()

        clear()
        return duration
    }

    @Test
    fun add100CssBuilders() = runBenchmark(name = "add100CssBuilders") {
        addCssBuilders(100)
    }

    @Test
    fun add500CssBuilders() = runBenchmark(name = "add500CssBuilders") {
        addCssBuilders(500)
    }

    @Test
    fun add1kCssBuilders() = runBenchmark(name = "add1kCssBuilders", repeat = 3) {
        addCssBuilders(1000)
    }
}
