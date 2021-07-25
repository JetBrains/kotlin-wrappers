
plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    js(IR) {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                }
            }
        }
        binaries.executable()
    }

    sourceSets {
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")

                implementation(project(":kotlin-react"))
                implementation(project(":kotlin-react-dom"))
                implementation(project(":kotlin-styled-next"))
            }
        }
    }
}

val printBundleSize by tasks.registering {
    dependsOn(tasks.named("jsBrowserDistribution"))
    doLast {
        val jsFile = buildDir.resolve("distributions/web-benchmark-core.js")
        val size = jsFile.length()
        println("##teamcity[buildStatisticValue key='landingPageBundleSize' value='$size']")
    }
}

val printBenchmarkResults by tasks.registering {
    doLast {
        val report = buildDir.resolve("reports/tests/jsTest/classes/BenchmarkTests.html").readText()
        val stdout = "#.*;".toRegex().findAll(report).map { it.value }.firstOrNull()

        val benchmarks = stdout?.split(";")?.mapNotNull {
            if (it.isEmpty()) {
                null
            } else {
                val b = it.split(":")
                val testName = b[0].replace("#", "")
                val benchmarkMs = b[1].toInt()

                testName to benchmarkMs
            }
        }?.toMap()

        benchmarks?.forEach {
            // TeamCity messages need to escape '[' and ']' using '|'
            val testName = it.key
                .replace("[", "|[")
                .replace("]", "|]")
            println("##teamcity[buildStatisticValue key='benchmark_$testName' value='${it.value}']")
        }
    }
}
tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>>().configureEach {
    kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
}

tasks.named("jsTest") { finalizedBy(printBenchmarkResults) }
tasks.named("build") { finalizedBy(printBundleSize) }