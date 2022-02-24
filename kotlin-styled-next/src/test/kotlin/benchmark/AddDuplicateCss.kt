package benchmark

import TestScope
import addCss
import react.Props
import react.fc
import styled.styledDiv
import waitForAnimationFrame
import kotlin.random.Random
import kotlin.test.Test
import kotlin.time.Duration
import kotlin.time.measureTime

class AddDuplicateCss : BenchmarkBase() {
    /**
     * Measure the time elapsed to inject [repeatCount] styled components with the same CSS [n] times into the DOM
     * @return duration of all injects
     */
    private suspend fun TestScope.addElement(n: Int, repeatCount: Int): Duration {
        val component = fc<Props> {
            (1..repeatCount).forEach {
                val random = Random(152)
                (1..n).forEach {
                    styledDiv {
                        addCss(it, random)
                    }
                }
            }
        }
        val duration = measureTime {
            renderComponent(component)
            waitForAnimationFrame()
        }

        assertChildrenCount(n * repeatCount)
        assertCssNotEmpty()

        clear()
        return duration
    }

    @Test
    fun add100DuplicatedElements() = runBenchmark("add100DuplicatedElements") {
        addElement(100, 20)
    }

    @Test
    fun add200DuplicatedElements() = runBenchmark("add200DuplicatedElements") {
        addElement(200, 15)
    }

    @Test
    fun add500DuplicatedElements() = runBenchmark("add500DuplicatedElements") {
        addElement(500, 5)
    }
}
