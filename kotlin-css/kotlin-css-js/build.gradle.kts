plugins {
    kotlin("js")
    `npm-publishing-conventions`
}

dependencies {
    api(project(":kotlin-css"))
}
