rootProject.name = "kotlin-wrappers"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }

    versionCatalogs {
        create("libs") {
            val karakumVersion = extra["karakum.version"] as String
            plugin("karakum", "io.github.sgrishchenko.karakum").version(karakumVersion)

            val kotlinVersion = extra["kotlin.version"] as String
            library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").version(kotlinVersion)
            library("kotlin-testJunit", "org.jetbrains.kotlin", "kotlin-test-junit").version(kotlinVersion)

            val seskarVersion = extra["seskar.version"] as String
            library("seskar-core", "io.github.turansky.seskar", "seskar-core").version(seskarVersion)

            val coroutinesVersion = extra["kotlinx-coroutines.version"] as String
            library("coroutines-core", "org.jetbrains.kotlinx", "kotlinx-coroutines-core").version(coroutinesVersion)
            library("coroutines-test", "org.jetbrains.kotlinx", "kotlinx-coroutines-test").version(coroutinesVersion)

            val htmlVersion = extra["kotlinx-html.version"] as String
            library("kotlinx-html", "org.jetbrains.kotlinx", "kotlinx-html").version(htmlVersion)

            npmLibraries()
        }
    }
}

fun VersionCatalogBuilder.npmLibraries() {
    val lines = file("gradle.properties").readLines()

    for ((commentLine, versionLine) in lines.windowed(2)) {
        val version = versionLine
            .substringAfter(".npm.version=", "")
            .ifEmpty { null }
            ?: continue

        val packageName = commentLine
            .removePrefix("# https://www.npmjs.com/package/")
            .takeIf { it != commentLine }
            ?: continue

        val packageAlias = packageName
            .removePrefix("@")
            .replace(
                regex = Regex("""-(\w)"""),
                transform = { it.groupValues[1].uppercase() }
            )
            .replace("/", "-")

        library("npm-$packageAlias", "npm", packageName).version(version)
    }
}

include("docs")

// Kotlin/JS: GitHub Actions Toolkit wrappers
include("kotlin-actions-toolkit")

// Kotlin/JS: Ajv JSON schema validator wrappers
include("kotlin-ajv")

// Kotlin/JS: Browser APIs missing from the standard library
include("kotlin-browser")

// Kotlin/JS: CesiumJS wrappers
include("kotlin-cesium-engine")

// Kotlin/JS: CesiumJS wrappers
include("kotlin-cesium-widgets")

// Platform-agnostic CSS support
include("kotlin-css")

// Kotlin/JS: Zero-runtime CSS core typings
include("kotlin-cssom-core")

// Kotlin/JS: Zero-runtime CSS typings
include("kotlin-csstype")

// Kotlin/JS: Electron wrappers
include("kotlin-electron")

// Kotlin/JS: Emotion wrappers
include("kotlin-emotion")

// Kotlin/JS: APIs missing from the standard library
include("kotlin-js")

// Kotlin/JS: Helper for `kotlin-js`
include("kotlin-js-core")

// Kotlin/JS: Material UI wrappers
include("kotlin-mui-material")

// Kotlin/JS: MUI Base UI wrappers
include("kotlin-mui-base")

// Kotlin/JS: Material UI Icons wrappers
include("kotlin-mui-icons-material")

// Kotlin/JS: MUI Lab wrappers
include("kotlin-mui-lab")

// Kotlin/JS: MUI System wrappers
include("kotlin-mui-system")

// Kotlin/JS: MUI X Date Pickers wrappers
include("kotlin-muix-date-pickers")

// Kotlin/JS: MUI X Tree View wrappers
include("kotlin-muix-tree-view")

// Kotlin/JS: Node.js wrappers
include("kotlin-node")
include("kotlin-node:karakum")

// Kotlin/JS: null-writable wrappers
include("kotlin-null-writable")

// Kotlin/JS: Popper Core wrappers
include("kotlin-popperjs-core")

// Kotlin/JS: JSON Lint wrappers
include("kotlin-prantlf-jsonlint")

// Kotlin/JS: Preact Signals Core wrappers
include("kotlin-preact-signals-core")

// Kotlin/JS: Preact Signals React wrappers
include("kotlin-preact-signals-react")

// Kotlin/JS: React wrappers
include("kotlin-react")

// Kotlin/JS: react-beautiful-dnd wrappers
include("kotlin-react-beautiful-dnd")

// Kotlin/JS: React wrappers
include("kotlin-react-core")

// Kotlin/JS: React DOM wrappers
include("kotlin-react-dom")

// Kotlin/JS: React DOM legacy wrappers
include("kotlin-react-dom-legacy")

// Kotlin/JS: React DOM Test Utilities wrappers
include("kotlin-react-dom-test-utils")

// Kotlin/JS: React legacy wrappers
include("kotlin-react-legacy")

// Kotlin/JS: React Popper wrappers
include("kotlin-react-popper")

// Kotlin/JS: React Router wrappers
include("kotlin-react-router")

// Kotlin/JS: React Select wrappers
include("kotlin-react-select")

// Kotlin/JS: React Use wrappers
include("kotlin-react-use")

// Kotlin/JS: semver wrappers
include("kotlin-semver")

// Kotlin/JS: a reimplementation of kotlin-styled in pure Kotlin, without styled-components
include("kotlin-styled-next")

// Kotlin/JS: Tanstack Query Core wrappers
include("kotlin-tanstack-query-core")

// Kotlin/JS: Tanstack React Query wrappers
include("kotlin-tanstack-react-query")

// Kotlin/JS: Tanstack React Query Devtools wrappers
include("kotlin-tanstack-react-query-devtools")

// Kotlin/JS: Tanstack React Table wrappers
include("kotlin-tanstack-react-table")

// Kotlin/JS: Tanstack React Virtual wrappers
include("kotlin-tanstack-react-virtual")

// Kotlin/JS: Tanstack Table Core wrappers
include("kotlin-tanstack-table-core")

// Kotlin/JS: Tanstack Virtual Core wrappers
include("kotlin-tanstack-virtual-core")

// Kotlin/JS: TypeScript wrappers
include("kotlin-typescript")

// Kotlin/JS: @vercel/ncc wrappers
include("kotlin-vercel-ncc")

// Kotlin/JS: Common web wrappers
include("kotlin-web")

// Kotlin/JS: yaml wrappers
include("kotlin-yaml")

include("kotlin-wrappers-bom")

include("kotlin-wrappers-catalog")
