plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

kotlin {
    js {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                }
            }
        }
    }

    sourceSets {
        val main by getting {
            dependencies {
                api(project(":kotlin-extensions"))
                api(project(":kotlin-css"))
                api(project(":kotlin-react"))
                api(project(":kotlin-react-dom"))

                api(kotlinxHtml("js"))

                api(npm("inline-style-prefixer", "^6.0.0"))
            }
        }
        val test by getting {
            dependencies {
                implementation(kotlin("test-js"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")

                implementation(npm("puppeteer", "10.1.0"))
            }
        }
    }
}


tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinCompile<*>>().configureEach {
    kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
}

val printBenchmarkResults by tasks.registering {
    doLast {
        // implicit dependency to benchmark classes names
        val fileNames = listOf(
            "AddStyledElements",
            "ConvertToStyled",
            "CssBuildersInject",
            "DataTypeOperations"
        )
        fileNames.forEach { test ->
            val report = buildDir.resolve("reports/tests/test/classes/benchmark.$test.html").readText()
            "#.*;".toRegex().findAll(report).map { it.value }.forEach { stdout ->
                val benchmarks = stdout.split(";").mapNotNull {
                    if (it.isEmpty()) {
                        null
                    } else {
                        val b = it.split(":")
                        val testName = b[0].replace("#", "")
                        val benchmarkMs = b[1].toInt()

                        testName to benchmarkMs
                    }
                }.toMap()

                benchmarks.forEach {
                    // TeamCity messages need to escape '[' and ']' using '|'
                    val testName = it.key
                        .replace("[", "|[")
                        .replace("]", "|]")
                    println("##teamcity[buildStatisticValue key='benchmark_$testName' value='${it.value}']")
                }
            }
        }
    }
}

tasks.named("test") {
    enabled = project.hasProperty("test")
    if (enabled) {
        finalizedBy(printBenchmarkResults)
    }
}
