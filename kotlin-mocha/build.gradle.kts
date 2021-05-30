plugins {
    kotlin("js")
    `publish-conventions`
}

dependencies {
    api(npmv("mocha"))
}
