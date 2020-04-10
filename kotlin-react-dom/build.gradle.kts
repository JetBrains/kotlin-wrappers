plugins {
    kotlin("js")
    `npm-publishing-conventions`
}

dependencies {
    compile(project(":kotlin-react"))
}
