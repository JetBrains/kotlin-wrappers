rootProject.name = "kotlin-wrappers"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic-settings")
}

plugins {
    id("wrappersbuild.settings")
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            val kotlinVersion = extra["kotlin.version"] as String
            library("kotlin-test", "org.jetbrains.kotlin", "kotlin-test").version(kotlinVersion)
            library("kotlin-testJunit", "org.jetbrains.kotlin", "kotlin-test-junit").version(kotlinVersion)

            val coroutinesVersion = extra["kotlinx-coroutines.version"] as String
            library("coroutines-core", "org.jetbrains.kotlinx", "kotlinx-coroutines-core").version(coroutinesVersion)
            library("coroutines-test", "org.jetbrains.kotlinx", "kotlinx-coroutines-test").version(coroutinesVersion)

            val htmlVersion = extra["kotlinx-html.version"] as String
            library("kotlinx-html", "org.jetbrains.kotlinx", "kotlinx-html").version(htmlVersion)
        }
    }
}

fun includeKarakum(path: String) {
    includeBuild("$path/karakum") {
        name = "$path-karakum"
    }
}

includeBuild("build-logic")

include("docs")

includeKarakum("kotlin-actions")

// Kotlin/JS: GitHub Actions Artifact wrappers
include("kotlin-actions-artifact")

// Kotlin/JS: GitHub Actions Cache wrappers
include("kotlin-actions-cache")

// Kotlin/JS: GitHub Actions Core wrappers
include("kotlin-actions-core")

// Kotlin/JS: GitHub Actions Exec wrappers
include("kotlin-actions-exec")

// Kotlin/JS: GitHub Actions GitHub wrappers
include("kotlin-actions-github")

// Kotlin/JS: GitHub Actions Glob wrappers
include("kotlin-actions-glob")

// Kotlin/JS: GitHub Actions HTTP Client wrappers
include("kotlin-actions-http-client")

// Kotlin/JS: GitHub Actions IO wrappers
include("kotlin-actions-io")

// Kotlin/JS: GitHub Actions Tool Cache wrappers
include("kotlin-actions-tool-cache")

// Kotlin/JS: Ajv JSON schema validator wrappers
include("kotlin-ajv")

// Kotlin/JS: Browser APIs missing from the standard library
include("kotlin-browser")

includeKarakum("kotlin-browser")

includeKarakum("kotlin-cesium")

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

includeKarakum("kotlin-csstype")

// Kotlin/JS: Electron wrappers
include("kotlin-electron")

includeKarakum("kotlin-electron")

// Kotlin/JS: Emotion Cache wrappers
include("kotlin-emotion-cache")

// Kotlin/JS: Emotion CSS wrappers
include("kotlin-emotion-css")

// Kotlin/JS: Emotion React wrappers
include("kotlin-emotion-react")

// Kotlin/JS: Emotion Styled wrappers
include("kotlin-emotion-styled")

// Kotlin/JS: Emotion Utils wrappers
include("kotlin-emotion-utils")

// Kotlin/JS: APIs missing from the standard library
include("kotlin-js")

// Kotlin/JS: Helper for `kotlin-js`
include("kotlin-js-core")

// Kotlin/JS: JSZip wrappers
include("kotlin-jszip")

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

includeKarakum("kotlin-node")

// Kotlin/JS: null-writable wrappers
include("kotlin-null-writable")

includeKarakum("kotlin-null-writable")

// Kotlin/JS: pako wrappers
include("kotlin-pako")

// Kotlin/JS: Popper Core wrappers
include("kotlin-popperjs-core")

includeKarakum("kotlin-popperjs-core")

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

includeKarakum("kotlin-react-dom")

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

includeKarakum("kotlin-semver")

// Kotlin/JS: a reimplementation of kotlin-styled in pure Kotlin, without styled-components
include("kotlin-styled-next")

// Kotlin/JS: TanStack History wrappers
include("kotlin-tanstack-history")

includeKarakum("kotlin-tanstack-history")

includeKarakum("kotlin-tanstack-query")

// Kotlin/JS: TanStack Query Core wrappers
include("kotlin-tanstack-query-core")

// Kotlin/JS: TanStack React Query wrappers
include("kotlin-tanstack-react-query")

// Kotlin/JS: TanStack React Query Devtools wrappers
include("kotlin-tanstack-react-query-devtools")

// Kotlin/JS: TanStack React Router wrappers
include("kotlin-tanstack-react-router")

// Kotlin/JS: TanStack React Table wrappers
include("kotlin-tanstack-react-table")

// Kotlin/JS: TanStack React Virtual wrappers
include("kotlin-tanstack-react-virtual")

// Kotlin/JS: TanStack Router Core wrappers
include("kotlin-tanstack-router-core")

includeKarakum("kotlin-tanstack-table")

// Kotlin/JS: TanStack Table Core wrappers
include("kotlin-tanstack-table-core")

includeKarakum("kotlin-tanstack-virtual")

// Kotlin/JS: TanStack Virtual Core wrappers
include("kotlin-tanstack-virtual-core")

// Kotlin/JS: TypeScript wrappers
include("kotlin-typescript")

includeKarakum("kotlin-typescript")

// Kotlin/JS: @vercel/ncc wrappers
include("kotlin-vercel-ncc")

// Kotlin/JS: VS Code wrappers
include("kotlin-vscode")

includeKarakum("kotlin-vscode")

// Kotlin/JS: Common web wrappers
include("kotlin-web")

// Kotlin/JS: yaml wrappers
include("kotlin-yaml")

include("kotlin-wrappers-bom")

include("kotlin-wrappers-catalog")
