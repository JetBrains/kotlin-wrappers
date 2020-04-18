plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    implementation(npm("mocha", "^3.0.0"))
}
