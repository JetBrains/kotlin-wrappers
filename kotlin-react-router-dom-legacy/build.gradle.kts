plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-history"))
    api(project(":kotlin-react-dom"))

    api(npm("react-router-dom", "^6.3.0"))
}
