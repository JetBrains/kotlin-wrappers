package benchmark

import StyledElementsFactory.getCssBuilders
import styled.GlobalStyles
import styled.toStyledCss
import waitFlowCoroutine
import waitForAnimationFrame
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
class DataTypeOperations : BenchmarkBase() {
    /**
     * Measures [LinkedHashMap.put] operation for [GlobalStyles.styledClasses] data structure [n] times
     * @return duration of all [LinkedHashMap.put] operations
     */
    private suspend fun putNElements(n: Int): Duration {
        val styledCSS = getCssBuilders(n).map { it.toStyledCss() }
        return measureTime {
            styledCSS.forEach { GlobalStyles.styledClasses[it] = "" }
            waitFlowCoroutine()
        }
    }

    /**
     * Measures [LinkedHashMap.get] operation for [GlobalStyles.styledClasses] data structure [n] times
     * with [collisionProb] probability of collision
     * @return duration of all [LinkedHashMap.get] operations
     */
    private suspend fun getNElements(n: Int, collisionProb: Double = 0.5): Duration {
        assertTrue(collisionProb in 0.0..1.0)

        val collisionsN = (n * collisionProb).toInt()
        val builders = getCssBuilders(collisionsN).map { it.toStyledCss() }.toMutableList()
        builders.forEach { GlobalStyles.styledClasses[it] = "" }

        val nonCollisionsN = (n * (1 - collisionProb)).toInt()
        builders.addAll(getCssBuilders(nonCollisionsN).map { it.toStyledCss() })
        return measureTime {
            builders.map { GlobalStyles.styledClasses[it] }
            waitForAnimationFrame()
        }
    }

    @Test
    fun put500Elements() = runBenchmark(name = "put500Elements") {
        putNElements(500)
    }

    @Test
    fun put1kElements() = runBenchmark(name = "put1kElements") {
        putNElements(1000)
    }

    @Test
    fun put2kElements() = runBenchmark(name = "put2kElements") {
        putNElements(1000)
    }

    @Test
    fun put5kElements() = runBenchmark(name = "put5kElements") {
        putNElements(1000)
    }

    @Test
    fun put10kElements() = runBenchmark(name = "put10kElements") {
        putNElements(10000)
    }


    @Test
    fun get500Elements() = runBenchmark(name = "get500Elements") {
        getNElements(500)
    }

    @Test
    fun get1kElements() = runBenchmark(name = "get1kElements") {
        getNElements(1000)
    }

    @Test
    fun get2kElements() = runBenchmark(name = "get2kElements") {
        getNElements(2000)
    }

    @Test
    fun get5kElements() = runBenchmark(name = "get5kElements") {
        getNElements(5000)
    }

    @Test
    fun get10kElements() = runBenchmark(name = "get10kElements") {
        getNElements(10000)
    }
}