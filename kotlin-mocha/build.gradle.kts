plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(npm("mocha", npmVersion("mocha")))
}
