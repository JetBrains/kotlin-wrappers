plugins {
    kotlin("js")
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {}
    }
}

dependencies {
    implementation(project(":kotlin-react"))
    implementation(project(":kotlin-styled-next"))
}
