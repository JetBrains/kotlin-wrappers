plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    api(npmv("mocha"))
}
