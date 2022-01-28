plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

kotlin {
    sourceSets.configureEach {
        languageSettings.optIn("kotlin.contracts.ExperimentalContracts")
    }
}

dependencies {
    api(npmv("typescript"))
}
