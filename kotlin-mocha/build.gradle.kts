plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    implementation(npm("mocha", npmVersion("mocha")))
}
